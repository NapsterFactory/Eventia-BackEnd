package tn.esprit.eventia.Repository.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.awt.geom.Area;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
public class PurchaseTicket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idPurchaseTicket ;
    float amount;
    @Enumerated(EnumType.STRING)
    PaymentType paymentType;
    @Temporal(TemporalType.DATE)
    Date paymentDate;
//    @ManyToOne
//    @JsonIgnore
//    User client;
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JsonIgnore
//    Event event;


}
