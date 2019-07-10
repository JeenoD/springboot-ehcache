package jeeno.example.demo.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author: Jeeno
 * @mail: jeenocruise@gmail.com
 * @date: 2019/7/10 17:23
 */
@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
public class UserDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private Boolean male;

    public UserDO(String name, Integer age){
        this.name = name;
        this.age = age;
    }
}