package cn.coderon.zhongrong3_0.controller;

import cn.coderon.zhongrong3_0.bean.Channel;
import cn.coderon.zhongrong3_0.bean.TopUpRecord;
import cn.coderon.zhongrong3_0.service.ChannelService;
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
@Api(value="ChannelController",tags={"公司渠道列表接口"})
public class ChannelController {
    @Resource
    private ChannelService channelService;

    @ApiOperation(value="查询公司渠道列表")
    @GetMapping(value = "/getChannel")
    public ResponseData getChannel(HttpServletRequest request,Integer companyId) {
        if (companyId==null){
            String token = request.getHeader("Authorization");
            Claims claims = JwtUtil.parseToken(token);
            Integer cid = (Integer) claims.get("companyId");
            companyId=cid;
        }
        List<Channel> channels=channelService.getChannel(companyId);
        if (channels!=null){
            return new ResponseData().code(200).data(channels);
        }
        return new ResponseData().code(400);
    }

    @ApiOperation(value="添加渠道")
    @PostMapping(value = "/addChannel")
    public ResponseData addChannel(HttpServletRequest request,Channel channel) {
        String token = request.getHeader("Authorization");
        Claims claims = JwtUtil.parseToken(token);
        String permission = (String) claims.get("permission");
        if (permission!=null){
            if ("admin".equals(permission)) {
                int i=channelService.addChannel(channel);
                if (i!=0){
                    return new ResponseData().code(200).message("添加成功");
                }
            }
        }
        return new ResponseData().code(400);
    }
}
