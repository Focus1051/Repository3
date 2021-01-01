package com.luca.lianxi;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

//@SpringBootTest
class LianxiApplicationTests {

    @Test
    void contextLoads() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,120);
        HashMap<String,Object> map = new HashMap<>();
        String token=JWT.create()
                .withHeader(map)
                .withClaim("id",18)
                .withClaim("username","ljm")//payload
                .withExpiresAt(calendar.getTime())//指定过期时间
                .sign(Algorithm.HMAC256("erg34534@$%%6Vfbg"));//签名

        System.out.println(token);

    }
    @Test
    void test2(){
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("erg34534@$%%6Vfbg")).build();
        DecodedJWT verify = jwtVerifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpZCI6MTgsImV4cCI6MTU5NzE1NjQ4NiwidXNlcm5hbWUiOiJsam0ifQ.5GinLETI6z235-dTbwVonRuD_9lKMwlmlO4Pz2VnGj8");
        System.out.println(verify.getClaim("id").asInt());
        System.out.println(verify.getClaim("username").asString());
        System.out.println(verify.getExpiresAt());

    }

    @Test
    void test3(){
       JwtBuilder jwtBuilder= Jwts.builder().setId("666").setIssuedAt(new Date()).setSubject("小卢")
                .signWith(SignatureAlgorithm.HS256,"ljmm");

       String JWtoken= jwtBuilder.compact();
       System.out.println(JWtoken);

    }

    @Test
    void test4(){
        JwtBuilder jwtBuilder= Jwts.builder().setId("666").setIssuedAt(new Date()).setSubject("小卢")
                .signWith(SignatureAlgorithm.HS256,"ljmm")
                .claim("name","卢建明")//自定义
                .claim("money","So much");//自定义
        String JWtoken= jwtBuilder.compact();

        Claims claims = Jwts.parser().setSigningKey("ljmm").parseClaimsJws(JWtoken).getBody();
        System.out.println(claims.getIssuedAt());
        System.out.println(claims.getId());
        System.out.println(claims.getSubject());
        System.out.println(claims.get("name"));
        System.out.println(claims.get("money"));
    }
@Test
    void test5(){
    Integer i=100;
    Integer j = 300;
    Integer c=300;
    //System.out.println(c.equals(i+j));
    System.out.println(c==j);


}





}
