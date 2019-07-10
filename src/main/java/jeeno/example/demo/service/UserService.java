package jeeno.example.demo.service;

import jeeno.example.demo.pojo.UserDO;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/10 17:55
 */
public interface UserService {
    UserDO findByName(String name);

    void save(UserDO user);


}
