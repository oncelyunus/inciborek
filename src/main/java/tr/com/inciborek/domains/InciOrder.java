package tr.com.inciborek.domains;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "inci_order")
public class InciOrder {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private Date created;

    @ManyToOne
    @JoinColumn(name = "consumerId")
    private Consumer consumer;

    @ManyToOne
    @JoinColumn(name = "inciProductId")
    private InciProduct inciProduct;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Consumer getConsumer() {
        return consumer;
    }

    public void setConsumer(Consumer consumer) {
        this.consumer = consumer;
    }

    public InciProduct getInciProduct() {
        return inciProduct;
    }

    public void setInciProduct(InciProduct inciProduct) {
        this.inciProduct = inciProduct;
    }
}
