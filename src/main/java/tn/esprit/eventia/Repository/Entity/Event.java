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

    @Column(name = "EVENT_NAME", length = 100, nullable = false, unique = false)
    private String name;

    @Column(name = "EVENT_NUMBER", nullable = false, unique = false)
    private int number;

    @Temporal(TemporalType.DATE)
    private Date starting_date;

    @Temporal(TemporalType.DATE)
    private Date end_date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getStarting_date() {
		return starting_date;
	}

	public void setStarting_date(Date starting_date) {
		this.starting_date = starting_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
    
    
}
