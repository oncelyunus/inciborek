package tr.com.inciborek;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tr.com.inciborek.domains.Consumer;
import tr.com.inciborek.repository.ConsumerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConsumerTest {

    @Autowired
    private ConsumerRepository consumerRepository;

    @Test
    @Transactional
    @Rollback(value = false)
    public void testNewConsumer() {

        Consumer consumer = new Consumer();
        consumer.setAddress("Kahraman Ciftlik Yolu Sehitler Camii Sok Muratcan apt no:20/6");
        consumer.setAddressDescription("Eston evlerinin karsisindan gir sagda göreceksin");
        consumer.setFullName("Yunus ÖNCEL");
        consumer.setNote("Aman dikkat KIL müsteri");
        consumer.setPhoneNumber("05332109935");

        consumerRepository.save(consumer);
    }

}
