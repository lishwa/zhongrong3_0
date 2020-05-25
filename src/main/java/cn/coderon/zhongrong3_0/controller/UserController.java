package cn.coderon.zhongrong3_0.controller;

import cn.coderon.zhongrong3_0.bean.TopUpRecord;
import cn.coderon.zhongrong3_0.bean.User;
import cn.coderon.zhongrong3_0.service.UserService;
import cn.coderon.zhongrong3_0.util.JwtUtil;
import cn.coderon.zhongrong3_0.util.ResponseData;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@CrossOrigin(maxAge = 3600)
@Api(value="UserController",tags={"业务员接口"})
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value="根据公司id查询业务员列表")
    @GetMapping(value = "/getUserByCompanyId")
    public ResponseData getUserByCompanyId(HttpServletRequest request,Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        List<User> users=userService.getUserByCompanyId(companyId);
        if (users!=null){
            return new ResponseData().code(200).data(users);
        }
        return new ResponseData().code(400);
    }

    @ApiOperation(value="添加业务员")
    @PostMapping(value = "/addUser")
    public ResponseData addUser(User user,HttpServletRequest request,Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        user.setCompanyId(companyId);
        int i=userService.addUser(user);
        if (i!=0){
            return new ResponseData().code(200).message("添加成功");
        }
        return new ResponseData().code(400);
    }

    /**
     * 更改业务员状态
     * @param id 业务员id
     * @param status 0代表请假；1代表工作中；
     * @return
     */
    @ApiOperation(value="更改业务员状态(请假/上班)")
    @PostMapping(value = "/updateUserStatus")
    public ResponseData updateUserStatus(@ApiParam(name="id",value="业务员id")Integer id, @ApiParam(name="status",value="status 0代表请假；1代表工作中；") Integer status){
        int i=userService.updateUserStatus(id,status);
        if (i!=0){
            return new ResponseData().code(200).message("标记成功");
        }
        return new ResponseData().fail();
    }

    /**
     * 查询业务员
     * @return
     */
    @ApiOperation(value="查询业务员")
    @GetMapping(value = "/getUser")
    public ResponseData getUser(HttpServletRequest request){
        String token = request.getHeader("Authorization");
        Claims claims = JwtUtil.parseToken(token);
        String city = (String) claims.get("city");
        List<User> users=userService.getUser(city);
        if (users!=null){
            return new ResponseData().code(200).data(users);
        }
        return new ResponseData().fail();
    }
}
