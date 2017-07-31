package cloud.ribbon.client.controller;

import cloud.ribbon.client.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> users() {
        this.loadBalancerClient.choose("cloud-simple-service");//随机访问策略
        return restTemplate.getForObject("http://cloud-simple-service/user", List.class);

    }

}
