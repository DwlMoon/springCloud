package moon.client_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"moon.*.api"})
public class ClientTwoApplication {

    public static void main (String[] args) {
        SpringApplication.run(ClientTwoApplication.class, args);
    }

}
