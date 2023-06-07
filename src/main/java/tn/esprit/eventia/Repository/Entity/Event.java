package tn.esprit.eventia.Repository.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="EVENT_NAME", length=100, nullable=false, unique=false)
    private String name;
    @Column(name="Event number",nullable=false, unique=false)
    private int number;
   @Temporal(TemporalType.DATE)
    private Date starting_date;
   @Temporal(TemporalType.DATE)
    private Date end_date;


}
