package moon.zuul.Security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;

import javax.servlet.http.HttpServletResponse;

/**
 * 资源服务器配置
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

//    方法一：不用配置yml
//    @Primary
//    @Bean
//    public RemoteTokenServices tokenServices() {
//        final RemoteTokenServices tokenService = new RemoteTokenServices();
//        tokenService.setCheckTokenEndpointUrl("http://localhost:8800/oauth/check_token");
//        tokenService.setClientId("abc");
//        tokenService.setClientSecret("long");
//        return tokenService;
//    }


    /**
     * 方法二：配置yml
     * @param http
     * @throws Exception
     */
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .exceptionHandling()
                .authenticationEntryPoint((request, response, authException) -> response.sendError(HttpServletResponse.SC_UNAUTHORIZED))
                .and()
                .authorizeRequests()
                .antMatchers("/sso/oauth/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();
    }




}