package moon.client_one.controller;


import moon.client_one.service.cliOneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @program: mySpringCloud
 * @description:
 * @create: 2021-01-18 15:10
 **/

@RestController
@RequestMapping("cliOne")
public class clientOneController {

    @Autowired
    cliOneService clientThreeApi;

    @RequestMapping(value = "test1",method = RequestMethod.GET)
    public String test(){
        return clientThreeApi.haha();
    }

}
