package one.digitalinnovation.gof.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.gof.domain.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
