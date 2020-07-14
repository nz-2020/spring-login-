package sm.login.login.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "user_type")
public class UserType  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_TYPE_ID")
    private int userTypeId;

    @Column(name = "USER_TYPE")
    private String userType;


    @JsonIgnore
    @OneToMany(mappedBy = "userType")
    private List<sm.login.login.entity.User> users;

}
