package sm.login.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sm.login.login.entity.UserType;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType,Integer> {
}
