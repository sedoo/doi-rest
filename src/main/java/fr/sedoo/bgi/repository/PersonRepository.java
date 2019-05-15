package fr.sedoo.bgi.repository;

import org.springframework.data.repository.CrudRepository;

import fr.sedoo.bgi.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
