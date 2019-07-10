package jeeno.example.demo.service.Impl;

import jeeno.example.demo.pojo.UserDO;
import jeeno.example.demo.repository.UserRepository;
import jeeno.example.demo.service.UserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/10 17:56
 */
@Service
@CacheConfig(cacheNames = "userCache")
public class UserServiceImpl implements UserService {

    @Resource
    UserRepository repository;

    @Override
    @Cacheable
    public UserDO findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public void save(UserDO user) {
        repository.save(user);
    }



}
