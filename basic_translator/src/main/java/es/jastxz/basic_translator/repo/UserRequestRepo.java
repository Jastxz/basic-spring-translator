package es.jastxz.basic_translator.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import es.jastxz.basic_translator.model.UserRequest;

public interface UserRequestRepo extends JpaRepository<UserRequest, String>{
}
