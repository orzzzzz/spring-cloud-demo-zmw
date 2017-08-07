package zmw.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy  // 开启 zuul
@EnableEurekaClient
public class CloudZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudZuulServiceApplication.class, args);
	}
}
