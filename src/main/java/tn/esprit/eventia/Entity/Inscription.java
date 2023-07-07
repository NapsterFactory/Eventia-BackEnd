package tn.esprit.eventia.Entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nomParticipant ;
    private String prenomParticipant ;
    private Date Date ;
    private String Evenement ;

    @Override
    public String toString() {
        return "Inscription{" +
                "id='" + id + '\'' +
                ", nomParticipant='" + nomParticipant + '\'' +
                ", prenomParticipant='" + prenomParticipant + '\'' +
                ", Date=" + Date +
                ", Evenement='" + Evenement + '\'' +
                '}';
    }

}
