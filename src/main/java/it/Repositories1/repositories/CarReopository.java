package it.Repositories1.repositories;

import it.Repositories1.entities.Car;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface CarReopository extends JpaRepository<Car, Long> {

}
