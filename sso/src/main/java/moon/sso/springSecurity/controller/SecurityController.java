package moon.sso.springSecurity.controller;



import moon.sso.springSecurity.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @program: moon
 * @description:
 * @create: 2020-12-24 17:32
 **/

@Controller
@RequestMapping(value = "sec")
public class SecurityController {

    @Autowired
    SecurityService securityService;


    @Autowired
    ConsumerTokenServices consumerTokenServices;


    /**
     * 插入用户数据
     * @return
     */
    @RequestMapping(value = "insertUserData",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String insertUserData(){
        securityService.insertUserData();
        return "success";
    }


    /**
     * 清除redis中token
     * @param accessToken
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/removeToken/{accessToken}",method = RequestMethod.GET)
    public Boolean removeToken(@PathVariable(value = "accessToken") String accessToken){
        boolean revokeToken = consumerTokenServices.revokeToken(accessToken);
        return revokeToken;
    }




    @RequestMapping(value = "test",method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    @PreAuthorize("hasAuthority('ROLE_USER')")
    public String test(){
        return "success";
    }

    /**
     * 验证失败页面
     * @return
     */
    @RequestMapping(value = "fail",method = {RequestMethod.GET, RequestMethod.POST})
    public String fail(){
//        返回登录失败页面
        return "fail";
    }




}
