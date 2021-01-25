package com.example.EstudoManyToMany.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EstudoManyToMany.model.Cidade;


@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
