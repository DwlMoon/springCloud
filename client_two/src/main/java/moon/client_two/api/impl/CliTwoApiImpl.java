package moon.client_two.api.impl;

import moon.client_two.api.CliTwoApi;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: mySpringCloud
 * @description:
 * @create: 2021-01-18 17:06
 **/

@Component
public class CliTwoApiImpl implements CliTwoApi {
    @Override
    public String test(@RequestParam("name") String name) {
        return "fail";
    }
}
