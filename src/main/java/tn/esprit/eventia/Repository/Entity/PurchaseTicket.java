package tn.esprit.eventia.Repository.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.geom.Area;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class PurchaseTicket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpurchaseticket ;
    float amount;
    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    @Temporal(TemporalType.DATE)
    Date paymentDate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    User user;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Event event;


}
