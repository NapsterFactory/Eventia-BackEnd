package tn.esprit.eventia.Repository.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class CreditCard implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idCard;
    String creditCardType;
    String creditCardNumber;
    String bellingDetails;



}
