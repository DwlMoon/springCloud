package moon.sso.springSecurity.service;


import moon.sso.springSecurity.entity.SecurityUserData;

/**
 * @program: moon
 * @description:
 * @create: 2020-11-19 11:28
 **/

public interface SecurityService {

    public int insertUserData ();


    public SecurityUserData getUserData (Integer id);

}
