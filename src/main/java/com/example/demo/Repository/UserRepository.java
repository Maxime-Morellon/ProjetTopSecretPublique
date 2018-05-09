package com.example.demo.Repository;

import com.example.demo.Model.Requete;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Requete, Long> {
}