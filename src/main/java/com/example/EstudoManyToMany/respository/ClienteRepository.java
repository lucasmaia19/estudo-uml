package com.example.EstudoManyToMany.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EstudoManyToMany.model.Cliente;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
