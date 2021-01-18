package moon.client_one.api;


import moon.client_one.api.impl.ClientOneApiImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name ="CLIENT-ONE",fallback = ClientOneApiImpl.class)
public interface ClientOneApi {

    @RequestMapping(value = "/cliOne/test1",method = RequestMethod.GET)
    public String test();

}
