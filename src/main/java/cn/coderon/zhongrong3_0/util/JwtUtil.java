package cn.coderon.zhongrong3_0.util;

//import com.auth0.jwt.JWT;
//import com.auth0.jwt.JWTVerifier;
//import com.auth0.jwt.algorithms.Algorithm;
//import com.auth0.jwt.exceptions.JWTDecodeException;
//import com.auth0.jwt.interfaces.DecodedJWT;
////import lombok.extern.slf4j.Slf4j;
//
//import java.util.Date;
//
///**
// * JwtUtil:用来进行签名和效验Token
// *
// * @author zhangxiaoxiang
// * @date: 2019/07/12
// */
////@Slf4j
//public class JwtUtil {
//    /**
//     * JWT验证过期时间 EXPIRE_TIME 分钟
//     */
//    private static final long EXPIRE_TIME = 30 * 60 * 1000;
//
//    /**
//     * 校验token是否正确
//     *
//     * @param token  密钥
//     * @param secret 用户的密码
//     * @return 是否正确
//     */
//    public static boolean verify(String token, String username, String secret) {
//        try {
//            //根据密码生成JWT效验器
//            Algorithm algorithm = Algorithm.HMAC256(secret);
//            JWTVerifier verifier = JWT.require(algorithm)
//                    .withClaim("username", username)
//                    .build();
//            //效验TOKEN
//            DecodedJWT jwt = verifier.verify(token);
////            log.info("登录验证成功!");
//            return true;
//        } catch (Exception exception) {
////            log.error("JwtUtil登录验证失败!");
//
//            return false;
//        }
//    }
//
//    /**
//     * 获得token中的信息无需secret解密也能获得
//     *
//     * @return token中包含的用户名
//     */
//    public static String getUsername(String token) {
//        try {
//            DecodedJWT jwt = JWT.decode(token);
//            return jwt.getClaim("username").asString();
//        } catch (JWTDecodeException e) {
//            return null;
//        }
//    }
//
//    /**
//     * 生成token签名EXPIRE_TIME 分钟后过期
//     *
//     * @param username 用户名(电话号码)
//     * @param secret   用户的密码
//     * @return 加密的token
//     */
//    public static String sign(String username, String secret) {
//        Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
//        Algorithm algorithm = Algorithm.HMAC256(secret);
//        // 附带username信息
//        return JWT.create()
//                .withClaim("username", username)
//                .withExpiresAt(date)
//                .sign(algorithm);
//
//    }
//
//    public static void main(String[] args) {
//        /**
//         * 测试生成一个token
//         */
//        String sign = sign("18888888888", "123456");
////        log.warn("测试生成一个token\n"+sign);
//    }

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * 用来生成token令牌和解码验证token令牌
 * JWT由三部分组成，头部header、载荷payload与签名signature
 */
public class JwtUtil {
    //自定义加密密钥SIGNING_KEY
    private static final String SIGNING_KEY = "www.conderon.com";
    //转换成Base64编码
    private static byte[] signingSecretBytes = DatatypeConverter.parseBase64Binary(SIGNING_KEY);
    //有效期为7天
    private static final long EXP = 60*60*24*1000*7;

    /**
     * 生成token，默认60分钟
     *
     * @param payload 载荷
     * @return token
     */
    public static String createToken(Map<String, Object> payload) { //默认有效期为60分钟
        return createToken(payload, EXP);
    }

    /**
     * 生成token
     *
     * @param payload 载荷
     * @param exp     有效时长
     * @return token
     */
    public static String createToken(Map<String, Object> payload, long exp) {
        //签名算法使用SHA256算法加密
        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        //加密JWT
        Key signingKey = new SecretKeySpec(signingSecretBytes, signatureAlgorithm.getJcaName());
        //设置JWT声明格式，生成JWT
        JwtBuilder jwtBuilder = Jwts.builder()
                .setHeaderParam("typ", "jwt")
                .setHeaderParam("alg", "HS256")
                .setClaims(payload)
                .setExpiration(new Date(System.currentTimeMillis() + exp))  //token有效期
                .signWith(signatureAlgorithm, signingKey); //签名算法及签名密钥，将header与payload加密拼接后形成JWT
        return jwtBuilder.compact(); //返回JWT
    }

    /**
     * 解析token信息
     *
     * @param token JWT信息
     * @return payload
     */
    public static Claims parseToken(String token) {
        try {
            return Jwts.parser()
                    .setSigningKey(signingSecretBytes)
                    .parseClaimsJws(token).getBody();
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 解析token信息
     *
     * @param token JWT信息
     * @return payload
     */
    public static boolean verifyToken(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(signingSecretBytes)
                    .parseClaimsJws(token).getBody();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}