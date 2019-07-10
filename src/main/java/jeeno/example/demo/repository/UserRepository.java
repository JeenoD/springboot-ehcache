package jeeno.example.demo.repository;

import jeeno.example.demo.pojo.UserDO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/10 17:24
 */
public interface UserRepository extends JpaRepository<UserDO, Long> {

    UserDO findByName(String name);

}
