package com.example.EstudoManyToMany.model;
import java.util.Date;

import javax.persistence.Entity;

import com.example.EstudoManyToMany.model.enums.EstadoPagamento;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class PagamentoComBoleto extends Pagamento {
	public PagamentoComBoleto(Integer id2, EstadoPagamento estado2, Pedido pedido2, Date date, Object object) {
		super(id2, estado2, pedido2);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataVencimento;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dataPagamento;

}
