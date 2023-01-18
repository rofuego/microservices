package cl.sourcecode.microservices.currency.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import cl.sourcecode.microservices.currency.entity.CurrencyEntity;

public interface CurrencyRepository extends CrudRepository<CurrencyEntity, Long> {

	Optional<CurrencyEntity> findByCode(String code);
}
