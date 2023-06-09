package tn.esprit.eventia.Repository.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.eventia.Repository.Entity.Cash;

public interface CashRepository extends JpaRepository<Cash,Integer>
{
}
