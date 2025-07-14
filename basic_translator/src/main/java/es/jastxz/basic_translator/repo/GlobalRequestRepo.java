package es.jastxz.basic_translator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jastxz.basic_translator.model.GlobalRequest;

public interface GlobalRequestRepo extends JpaRepository<GlobalRequest, Long>{
}
