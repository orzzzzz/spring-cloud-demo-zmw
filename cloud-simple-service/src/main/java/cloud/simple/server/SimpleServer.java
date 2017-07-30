package cloud.simple.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * Created by Administrator on 2017/7/30.
 */
@RefreshScope
@EnableDiscoveryClient
@SpringBootApplication
public class SimpleServer {
    public static void main(String[] args) {
        SpringApplication.run(SimpleServer.class, args);
    }
}
