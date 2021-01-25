package com.example.EstudoManyToMany.respository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.EstudoManyToMany.model.ItemPedido;


@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
