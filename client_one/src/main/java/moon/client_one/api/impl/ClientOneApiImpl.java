package moon.client_one.api.impl;

import moon.client_one.api.ClientOneApi;
import org.springframework.stereotype.Component;

/**
 * @program: mySpringCloud
 * @description:
 * @create: 2021-01-18 17:04
 **/

@Component
public class ClientOneApiImpl implements ClientOneApi {
    @Override
    public String test () {
        String thisMethodName = Thread.currentThread().getStackTrace()[1].getMethodName();
        return "fail";
    }
}
