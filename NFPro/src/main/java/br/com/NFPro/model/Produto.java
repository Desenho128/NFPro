package br.com.NFPro.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codProduto;
	private String produto;
	private String ncm;
	private BigDecimal valorEntrada;
	private BigDecimal valorSaida;
	private String unidade;
	private Boolean defeito;
	
}
