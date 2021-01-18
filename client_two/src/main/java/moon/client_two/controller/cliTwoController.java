package moon.client_two.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: mySpringCloud
 * @description:
 * @create: 2021-01-18 15:12
 **/

@RestController
@RequestMapping("cliTwo")
public class cliTwoController {



    @RequestMapping(value = "test2",method = RequestMethod.GET)
    public String test(@RequestParam("name") String name){
        System.out.println("接收的参数："+name);
        return name+"is success";
    }
}
