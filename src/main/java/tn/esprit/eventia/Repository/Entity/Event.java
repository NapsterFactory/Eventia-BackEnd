package tn.esprit.eventia.Repository.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
public class Event implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idevent ;
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    List<PurchaseTicket> purchaseTickets;
}
