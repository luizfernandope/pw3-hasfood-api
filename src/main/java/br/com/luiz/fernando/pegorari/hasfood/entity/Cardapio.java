package br.com.luiz.fernando.pegorari.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_CARDAPIO")
public class Cardapio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_CARDAPIO")
	private Long id_gastos;
	
	@Column(name = "ID_RESTAURANTE")
	private Long id_restaurante;
}
