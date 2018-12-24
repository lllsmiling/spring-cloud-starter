package wang.lingqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述:
 *
 * @outhor LiLongLong
 * @create 2018-12-24 11:46
 */
@SpringBootApplication
@EnableEurekaClient
public class GatewayServer {
    public static void main(String[] args) {
        SpringApplication.run(GatewayServer.class,args);
    }
}
