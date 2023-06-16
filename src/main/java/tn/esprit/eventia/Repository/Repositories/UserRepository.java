package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eventia.Repository.Entity.PurchaseTicket;
import tn.esprit.eventia.Repository.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
