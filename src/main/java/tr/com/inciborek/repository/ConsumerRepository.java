package tr.com.inciborek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.inciborek.domains.Consumer;

@Repository
public interface ConsumerRepository extends JpaRepository<Consumer, Long> {
}
