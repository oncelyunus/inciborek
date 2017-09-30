package tr.com.inciborek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.inciborek.domains.InciOrder;

@Repository
public interface InciOrderRepository extends JpaRepository<InciOrder, Long> {
}
