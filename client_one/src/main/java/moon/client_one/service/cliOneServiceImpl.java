package moon.client_one.service;

import moon.client_two.api.CliTwoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: mySpringCloud
 * @description:
 * @create: 2021-01-18 19:29
 **/

@Service
public class cliOneServiceImpl implements cliOneService {

    @Autowired
    CliTwoApi cliTwoApi;

    @Override
    public String haha () {
        String test = cliTwoApi.test("张三");
        System.out.println(test);
        return test;
    }
}
