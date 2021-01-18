package moon.client_two.api;

import moon.client_two.ClientTwoApplication;
import moon.client_two.api.impl.CliTwoApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name ="CLIENT-TWO",fallback = CliTwoApiImpl.class)
public interface CliTwoApi {

    @RequestMapping(value = "/cliTwo/test2",method = RequestMethod.GET)
    public String test(@RequestParam("name") String name);
}
