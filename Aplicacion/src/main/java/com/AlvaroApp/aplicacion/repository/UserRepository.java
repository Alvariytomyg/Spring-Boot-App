package com.AlvaroApp.aplicacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.AlvaroApp.aplicacion.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
