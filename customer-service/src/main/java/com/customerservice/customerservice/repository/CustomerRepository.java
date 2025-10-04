package com.customerservice.customerservice.repository;

import com.customerservice.customerservice.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer,String> {

    Mono<Customer> findByTenantIdAndId(String tenantId, String id);

    Flux<Customer> findByTenantId(String tenantId);

    Mono<Customer> findByTenantIdAndEmail(String tenantId, String email);
}
