package cn.coderon.zhongrong3_0.controller;


import cn.coderon.zhongrong3_0.bean.Admin;
import cn.coderon.zhongrong3_0.bean.Company;
import cn.coderon.zhongrong3_0.bean.User;
import cn.coderon.zhongrong3_0.service.AdminService;
import cn.coderon.zhongrong3_0.service.CompanyService;
import cn.coderon.zhongrong3_0.service.UserService;
import cn.coderon.zhongrong3_0.util.JwtUtil;
import cn.coderon.zhongrong3_0.util.ResponseData;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@CrossOrigin(maxAge = 3600)
@Api(value="LoginController",tags={"登录接口"})
public class LoginController {

    @Resource
    private UserService userService;

    @Resource
    private AdminService adminService;
    @Resource
    private CompanyService companyService;

    /**
     * 业务员登录
     * @param phone
     * @param password
     * @return
     */
    @ApiOperation(value="业务员登录")
    @RequestMapping(value = "/userLogin", method = RequestMethod.POST)
    public ResponseData login(String phone, String password) {
        User user = userService.findByUserPhone(phone);
        if (user == null) {
            return new ResponseData().code(400).message("用户不存在");
        }

        if (!user.getPassword().equals(password)) {
            return new ResponseData().code(400).message("密码错误");
        }

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("username", user.getPhone());
//        map.put("role", 1);
        String jwt = JwtUtil.createToken(map);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(jwt, jwt);

        try {
            subject.login(usernamePasswordToken);
            User user1 = new User();
            user1.setId(user.getId());
            return new ResponseData().success().token(jwt).data(user1);
        } catch (Exception e) {
            return new ResponseData().fail();
        }
    }


    /**
     * 管理员登录
     * @param account
     * @param password
     * @return
     */
    @ApiOperation(value="超级管理员登录")
    @RequestMapping(value = "/superAdminLogin", method = RequestMethod.POST)
    public ResponseData adminLogin(String account, String password) {
        Admin admin = adminService.findAdminByAccount(account);
        if (admin == null) {
            return new ResponseData().code(400).message("用户不存在");
        }

        if (!admin.getPassword().equals(password)) {
            return new ResponseData().code(400).message("密码错误");
        }

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("account", admin.getAccount());
        map.put("city",admin.getCity());
        map.put("company",admin.getCompany());
        map.put("permission","admin");
        String jwt = JwtUtil.createToken(map);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(jwt, jwt);

        try {
            subject.login(usernamePasswordToken);
            return new ResponseData().success().token(jwt);
        } catch (Exception e) {
            return new ResponseData().fail();
        }
    }

    @ApiOperation(value="公司管理员登录")
    @RequestMapping(value = "/companyAdminLogin", method = RequestMethod.POST)
    public ResponseData companyAdminLogin(String account, String password) {
        Company company = companyService.findCompanyAdminByAccount(account);
        if (company == null) {
            return new ResponseData().code(400).message("用户不存在");
        }

        if (!company.getPassword().equals(password)) {
            return new ResponseData().code(400).message("密码错误");
        }

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("account", company.getAccount());
        map.put("city",company.getCity());
        map.put("companyId",company.getId());
        String jwt = JwtUtil.createToken(map);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(jwt, jwt);

        try {
            subject.login(usernamePasswordToken);
            return new ResponseData().success().token(jwt);
        } catch (Exception e) {
            return new ResponseData().fail();
        }
    }

}
