package cn.coderon.zhongrong3_0.controller;

import cn.coderon.zhongrong3_0.bean.Orders;
import cn.coderon.zhongrong3_0.service.OrdersService;
import cn.coderon.zhongrong3_0.util.JwtUtil;
import cn.coderon.zhongrong3_0.util.ResponseData;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@Api(value="OrdersController",tags={"订单接口"})
public class OrdersController {

    @Resource
    private OrdersService ordersService;

    @ApiOperation(value = "查询公司当天订单数")
    @GetMapping(value = "/getCompanyOrdersByThatDate")
    public ResponseData getCompanyOrders(HttpServletRequest request,Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        int i = ordersService.getCompanyOrders(companyId);
        if (i >= 0) {
            return new ResponseData().code(200).data(i);
        }
        return new ResponseData().fail();
    }

    @ApiOperation(value = "根据时间查询公司订单")
    @GetMapping(value = "/getCompanyOrdersByDate")
    public ResponseData getCompanyOrdersByDate(HttpServletRequest request, String date, Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        List<Orders> ordersList=ordersService.getCompanyOrdersByDate(companyId,date);
        if (ordersList!=null) {
            return new ResponseData().code(200).data(ordersList);
        }
        return new ResponseData().fail();
    }


    //业务员操作

    /**
     * 获取已处理或者未处理订单
     * @param markAsRead 0未处理；1已处理；
     * @return
     */
    @ApiOperation(value="获取已处理或者未处理订单")
    @GetMapping(value = "/getOrders")
    public ResponseData getOrders(@ApiParam(name="markAsRead",value="markAsRead 0未处理；1已处理")Integer markAsRead){

        List<Orders> ordersList=ordersService.getOrders(markAsRead);

        return new ResponseData().code(200).data(ordersList);
    }

    /**
     *标记为已处理订单
     * @param id 订单id
     * @return
     */
    @ApiOperation(value="标记为已处理订单")
    @PostMapping(value = "/updateOrders")
    public ResponseData updateOrdersByMarkAsRead(@ApiParam(name="id",value="id")Integer id){
        int i=ordersService.updateOrdersByMarkAsRead(id);
        if (i!=0){
            return new ResponseData().code(200).message("标记成功");
        }
        return new ResponseData().fail();
    }

    /**
     * 管理员登录成功查询所有业务员数据
     * @return
     */
    @ApiOperation(value="管理员登录成功查询所有业务员数据")
    @GetMapping(value = "/getAllOrders")
    public ResponseData getAllOrders(){

        List<Orders> ordersList=ordersService.getAllOrders();

        return new ResponseData().code(200).data(ordersList);
    }

    /**
     * 业务员登录成功查询业务员数据
     * @return
     */
    @ApiOperation(value="业务员登录成功查询业务员数据")
    @PostMapping(value = "/getUserOrders")
    public ResponseData getUserOrders(@ApiParam(name="businessId",value="业务员id")Integer businessId){

        List<Orders> ordersList=ordersService.getUserOrders(businessId);

        return new ResponseData().code(200).data(ordersList);
    }
}


