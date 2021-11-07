package kz.zhelezyaka.repositories;

import kz.zhelezyaka.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
