package br.com.NFPro.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfo;

@Entity
public class Nota  {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nfNumero;
	@OneToOne
	private Emitente  emitente;
	@OneToOne
	private Destinatario destinatario;
	@OneToMany
	private List<Produto> produtos;
	private BigDecimal valorTotal;
	private String obs;
	private String xml;
	/* tipo =  1 = Entrada ou 2 = Saida */
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNfNumero() {
		return nfNumero;
	}
	public void setNfNumero(String nfNumero) {
		this.nfNumero = nfNumero;
	}
	public Emitente getEmitente() {
		return emitente;
	}
	public void setEmitente(Emitente emitente) {
		this.emitente = emitente;
	}
	public Destinatario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Destinatario destinatario) {
		this.destinatario = destinatario;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	public BigDecimal getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getObs() {
		return obs;
	}
	public void setObs(String obs) {
		this.obs = obs;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}

	
	public Nota(NFNotaInfo nota) {
		
		this.setNfNumero(nota.getIdentificacao().getNumeroNota());
		this.setEmitente(new Emitente(nota.getEmitente()));
		this.setDestinatario(new Destinatario(nota.getDestinatario()));

		
	}

	
}
	

