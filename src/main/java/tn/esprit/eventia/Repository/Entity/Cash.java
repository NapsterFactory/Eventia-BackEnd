package tn.esprit.eventia.Repository.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
@Getter
@Setter
@Entity
public class Cash implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCash;
    float totalAmount;
    String billingDetails;


}
