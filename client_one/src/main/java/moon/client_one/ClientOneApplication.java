package moon.client_one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
//设置需要调用的接口所在的包
@EnableFeignClients(basePackages = {"moon.*.api"})
@EnableHystrix
public class ClientOneApplication {

    public static void main (String[] args) {
        SpringApplication.run(ClientOneApplication.class, args);
    }

}
