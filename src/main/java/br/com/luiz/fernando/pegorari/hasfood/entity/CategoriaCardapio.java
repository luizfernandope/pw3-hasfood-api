package br.com.luiz.fernando.pegorari.hasfood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.luiz.fernando.pegorari.hasfood.enums.StatusEnum;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBL_CARDAPIO")

public class CategoriaCardapio {
	@Id
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CATEGORIA_CARDAPIO")
	private Long ID_CATEGORIA_CARDAPIO;
	
	@Column(name = "TX_NOME")
	private String TX_NOME;
	
	@ManyToOne
	@JoinColumn(name = "ID_CARDAPIO")
	private Cardapio ID_CARDAPIO;
	
	@Column(name = "TX_STATUS")
	private StatusEnum TX_STATUS;
	
}