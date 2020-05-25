package cn.coderon.zhongrong3_0.controller;

import cn.coderon.zhongrong3_0.bean.TopUpRecord;
import cn.coderon.zhongrong3_0.service.TopUpRecordService;
import cn.coderon.zhongrong3_0.util.JwtUtil;
import cn.coderon.zhongrong3_0.util.ResponseData;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@Api(value="TopUpRecordController",tags={"积分记录接口"})
public class TopUpRecordController {

    @Resource
    private TopUpRecordService topUpRecordService;

    //select  (select  sum(top_up_record.CNY) from top_up_record WHERE company_id=1) - (select sum(orders.price) from orders WHERE company_id=1)  as '积分余额'

    @ApiOperation(value="查询积分余额")
    @GetMapping(value = "/getCompanyIntegralBalance")
    public ResponseData getCompanyIntegralBalance(HttpServletRequest request, Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        String i = topUpRecordService.getCompanyIntegralBalance(companyId);
        if (i!=null){
            return new ResponseData().code(200).data(i);
        }
        return new ResponseData().code(200).data("0.00");
    }


    @ApiOperation(value="积分充值")
    @PostMapping(value = "/buyPoints")
    public ResponseData buyPoints(HttpServletRequest request, double CNY,Integer companyId) {
        String token = request.getHeader("Authorization");
        Claims claims = JwtUtil.parseToken(token);
        String permission = (String) claims.get("permission");
        if (permission != null) {
            if ("admin".equals(permission)) {
                int i = topUpRecordService.buyPoints(companyId, CNY);
                if (i != 0) {
                    return new ResponseData().code(200).message("充值成功");
                }
            }
        }
        return new ResponseData().code(400).message("充值失败");
    }

    @ApiOperation(value="查询公司充值记录")
    @GetMapping(value = "/getTopUpRecordByCompanyId")
    public ResponseData getTopUpRecordByCompanyId(HttpServletRequest request,Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        List<TopUpRecord> topUpRecordList=topUpRecordService.getTopUpRecordByCompanyId(companyId);
        if (topUpRecordList!=null){
            return new ResponseData().code(200).data(topUpRecordList);
        }
        return new ResponseData().code(400);
    }
}
