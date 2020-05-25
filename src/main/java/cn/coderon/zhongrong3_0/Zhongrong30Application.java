package cn.coderon.zhongrong3_0;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.coderon.zhongrong3_0.dao")
public class Zhongrong30Application {

    public static void main(String[] args) {
        SpringApplication.run(Zhongrong30Application.class, args);
    }

}
