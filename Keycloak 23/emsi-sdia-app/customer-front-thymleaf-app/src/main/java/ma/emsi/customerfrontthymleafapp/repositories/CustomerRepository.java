package ma.emsi.customerfrontthymleafapp.repositories;

import ma.emsi.customerfrontthymleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}