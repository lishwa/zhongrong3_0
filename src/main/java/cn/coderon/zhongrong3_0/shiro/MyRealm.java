package cn.coderon.zhongrong3_0.shiro;

import cn.coderon.zhongrong3_0.util.JwtUtil;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

/**
 * @author Mr.Li
 * @create 2018-07-12 15:23
 * @desc
 **/
@Component
public class MyRealm extends AuthorizingRealm {

//    @Autowired
//    private SysUserService sysUserService;


    /**
     * 必须重写此方法，不然Shiro会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
//        return token instanceof JwtToken;
        return token instanceof UsernamePasswordToken;
    }

//    /**
//     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
//     */
//    @Override
//    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        String username = JwtUtil.getUsername(principals.toString());
////        SysUser user = sysUserService.findByUserName(username);
//        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
//        return simpleAuthorizationInfo;
//    }
//
//    /**
//     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
//     */
//    @Override
//    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
//        String token = (String) auth.getCredentials();
//        // 解密获得username，用于和数据库进行对比
//        String username = JwtUtil.getUsername(token);
//        if (username == null) {
//            throw new AuthenticationException("token无效");
//        }
//
////        User userBean = sysUserService.findByUserName(username);
////        if (userBean == null) {
////            throw new AuthenticationException("用户不存在!");
////        }
//
//        /*if (!JwtUtil.verify(token, username, userBean.getPassword())) {
//            throw new AuthenticationException("用户名或密码错误");
//        }*/
//
//        return new SimpleAuthenticationInfo(token, token, "my_realm");
//    }
    /**
     * Realm授权
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
//        logger.info("授权开始");
        String jwt = (String) principals.getPrimaryPrincipal();
        if (JwtUtil.verifyToken(jwt)) {
            String role = (String) JwtUtil.parseToken(jwt).get("role");
            SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
            simpleAuthorizationInfo.addRole(role);
//            logger.info("权限是" + simpleAuthorizationInfo.getRoles());
//            logger.info("授权成功");
            return simpleAuthorizationInfo;
        }
        return null;
    }

    /**
     * Realm登录认证
     *
     * @param token
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
        String jwt = (String) usernamePasswordToken.getPrincipal();
        if (JwtUtil.verifyToken(jwt)) {
            return new SimpleAuthenticationInfo(jwt, jwt, getName());
        }
        return null;
    }
}