package tn.esprit.eventia.Repository.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity(name = "sponsors")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sponsors {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name="Sponsors_Name", nullable=false)
    private String name;

    @Column(name="Sponsors number",nullable=false)
    private int phonenumber;

    @Column(name="Sponsors_Email", nullable=false)
    private String contactEmail;

    @Column(name="Sponsors_Status", nullable=false)
    private Boolean isActive;

    @Column(name="Sponsors_address", nullable=false)
    private String address;

    @Column(name="Sponsors_logo", nullable=false)
    private String logoUrl;
    @Column(name="Sponsors_WebsiteUrl", nullable=false)
    private String websiteUrl;


}
