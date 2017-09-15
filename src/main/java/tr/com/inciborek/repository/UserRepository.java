package tr.com.inciborek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.inciborek.domains.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
