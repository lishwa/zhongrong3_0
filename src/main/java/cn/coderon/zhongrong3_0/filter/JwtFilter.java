package cn.coderon.zhongrong3_0.filter;



import cn.coderon.zhongrong3_0.util.JwtUtil;
import cn.coderon.zhongrong3_0.util.ResponseData;
import com.alibaba.druid.util.StringUtils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.web.filter.authc.BasicHttpAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Mr.Li
 * @create 2018-07-12 15:56
 * @desc
 **/
public class JwtFilter extends BasicHttpAuthenticationFilter {


//    /**
//     * 执行登录认证
//     *
//     * @param request
//     * @param response
//     * @param mappedValue
//     * @return
//     */
//    @Override
//    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
//        try {
//            executeLogin(request, response);
//            return true;
//        } catch (Exception e) {
//            return false;
//        }
//    }
//
//    /**
//     *
//     */
////    @Override
////    protected boolean executeLogin(ServletRequest request, ServletResponse response) throws Exception {
////        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
////        String token = httpServletRequest.getHeader("Authorization");
////
////        JwtToken jwtToken = new JwtToken(token);
////        // 提交给realm进行登入，如果错误他会抛出异常并被捕获
////        getSubject(request, response).login(jwtToken);
////        // 如果没有抛出异常则代表登入成功，返回true
////        return true;
////    }
//
//
//
//    /**
//     * 对跨域提供支持
//     */
//    @Override
//    protected boolean preHandle(ServletRequest request, ServletResponse response) throws Exception {
//        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//        httpServletResponse.setHeader("Access-control-Allow-Origin", httpServletRequest.getHeader("Origin"));
//        httpServletResponse.setHeader("Access-Control-Allow-Methods", "GET,POST,OPTIONS,PUT,DELETE");
//        httpServletResponse.setHeader("Access-Control-Allow-Headers", httpServletRequest.getHeader("Access-Control-Request-Headers"));
//        // 跨域时会首先发送一个option请求，这里我们给option请求直接返回正常状态
//        if (httpServletRequest.getMethod().equals(RequestMethod.OPTIONS.name())) {
//            httpServletResponse.setStatus(HttpStatus.OK.value());
//            return false;
//        }
//        return super.preHandle(request, response);
//    }

    /**
     * 返回false
     *
     * @param servletRequest
     * @param servletResponse
     * @param o
     * @return 返回结果是false的时候才会执行下面的onAccessDenied方法
     * @throws Exception
     */
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) {
//        logger.info("is access allowed");
        // 判断请求是否是options请求
        String method = WebUtils.toHttp(servletRequest).getMethod();
        if (StringUtils.equalsIgnoreCase("OPTIONS", method)) {
            return true;
        }
        return false;
    }

    /**
     * 从请求头获取token并验证，验证通过后交给realm进行登录
     *
     * @param servletRequest
     * @param servletResponse
     * @return 返回结果为true时，表明登录认证通过，执行controller层
     * @throws Exception
     */
    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception {
//        logger.info("on access denied");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String jwt = request.getHeader("Authorization");
        if (JwtUtil
                .verifyToken(jwt)) {
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(jwt, jwt);
            try {
                //委托realm进行登录认证
                getSubject(servletRequest, servletResponse).login(usernamePasswordToken);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        responseError(servletResponse,401,"token 验证失败");
        return false;
    }

    private void responseError(ServletResponse response, int code, String errorMsg) throws IOException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        httpServletResponse.setHeader("Access-Control-Allow-Origin","*");
        httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
        httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
        httpServletResponse.setHeader("Access-Control-Allow-Headers", "*");
        httpServletResponse.setContentType("application/json; charset=UTF-8");
//        ResponseBean baseResponse = new ResponseBean(code,errorMsg,null);
        ResponseData responseData = new ResponseData().code(code).message(errorMsg);
        OutputStream os = httpServletResponse.getOutputStream();
        os.write(new ObjectMapper().writeValueAsString(responseData).getBytes("UTF-8"));
        os.flush();
        os.close();
    }
}