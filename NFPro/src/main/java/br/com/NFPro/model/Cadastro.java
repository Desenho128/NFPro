package br.com.NFPro.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cadastro {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cnpj_rg;
	private String nome;
	private String fantasya;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Endereco> endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCnpj_rg() {
		return cnpj_rg;
	}

	public void setCnpj_rg(String cnpj_rg) {
		this.cnpj_rg = cnpj_rg;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFantasya() {
		return fantasya;
	}

	public void setFantasya(String fantasya) {
		this.fantasya = fantasya;
	}

	public List<Endereco> getEndereco() {
		return endereco;
	}

	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	
	public void adicionaEndereço(Endereco endereço) {
		
		if (this.endereco == null) {
			this.endereco =  new ArrayList<Endereco>();
		}
		this.endereco.add(endereço);
	}
	
	
}
