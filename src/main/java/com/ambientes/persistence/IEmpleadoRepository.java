package com.ambientes.persistence;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpleadoRepository extends CrudRepository<Empleado, Long> {

}
