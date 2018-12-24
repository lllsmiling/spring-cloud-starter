package wang.lingqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 描述:
 *
 * @outhor LiLongLong
 * @create 2018-12-24 12:01
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserServer {
    public static void main(String[] args) {
        SpringApplication.run(UserServer.class,args);
    }
}
