package tn.esprit.eventia.Repository.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.geom.Area;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class PurchaseTicket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int idpurchaseticket ;
    String name;
    String Eventname;
    boolean status=true;
    String validity;






}
