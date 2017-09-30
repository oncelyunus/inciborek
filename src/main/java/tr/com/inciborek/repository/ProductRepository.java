package tr.com.inciborek.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.inciborek.domains.InciProduct;

@Repository
public interface ProductRepository extends JpaRepository<InciProduct, Long> {

}
