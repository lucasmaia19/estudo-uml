package com.example.EstudoManyToMany.model;
import javax.persistence.Entity;

import com.example.EstudoManyToMany.model.enums.EstadoPagamento;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PagamentoComCartao extends Pagamento {
	public PagamentoComCartao(Integer id2, EstadoPagamento estado2, Pedido pedido2) {
		super(id2, estado2, pedido2);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;
		
}
