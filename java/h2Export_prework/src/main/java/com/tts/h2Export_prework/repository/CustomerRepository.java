package com.tts.h2Export_prework.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.tts.h2Export_prework.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String last_name);
}
