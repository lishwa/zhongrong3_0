package cn.coderon.zhongrong3_0.controller;

import cn.coderon.zhongrong3_0.bean.Channel;
import cn.coderon.zhongrong3_0.bean.Company;
import cn.coderon.zhongrong3_0.bean.User;
import cn.coderon.zhongrong3_0.service.CompanyService;
import cn.coderon.zhongrong3_0.util.JwtUtil;
import cn.coderon.zhongrong3_0.util.ResponseData;
import io.jsonwebtoken.Claims;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
@Api(value="ChannelController",tags={"公司接口"})
public class CompanyController {

    @Resource
    private CompanyService companyService;

    @ApiOperation(value="获取公司列表")
    @GetMapping(value = "/getCompanyAll")
    public ResponseData getCompanyAll(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        Claims claims = JwtUtil.parseToken(token);
        String permission = (String) claims.get("permission");
        if (permission!=null){
            if ("admin".equals(permission)){
                List<Company> companyList=companyService.getCompanyAll();
                if (companyList!=null){
                    return new ResponseData().code(200).data(companyList);
                }
            }
        }
        return new ResponseData().code(400);
    }

    @ApiOperation(value="添加公司")
    @PostMapping(value = "/addCompany")
    public ResponseData addCompany(Company company, HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        Claims claims = JwtUtil.parseToken(token);
        String permission = (String) claims.get("permission");
        if (permission!=null){
            if ("admin".equals(permission)) {
                int i=companyService.addCompany(company);
                if (i!=0){
                    return new ResponseData().code(200).message("添加成功");
                }
            }
        }
        return new ResponseData().code(400);
    }

    @ApiOperation(value="更改公司状态")
    @PostMapping(value = "/updateCompanyStatus")
    public ResponseData updateCompanyStatus(Integer companyId,Integer status) {
        int i=companyService.updateCompanyStatus(companyId,status);
        if (i!=0){
                    return new ResponseData().code(200).message("更新成功");
                }
        return new ResponseData().code(400);
    }
}
