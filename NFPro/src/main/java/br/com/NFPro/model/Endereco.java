package br.com.NFPro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fincatto.documentofiscal.nfe400.classes.NFEndereco;

@Entity
public class Endereco {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String logradouro;
	private String numero;
	private String bairro;
	private String codMunicipio;
	private String municipio;
	private String uf;
	private String cep;
	private Integer codPais;
	private String pais;
	private String fone;
	
	
	
	
	public Endereco(String logradouro, String numero, String bairro, String codMunicipio, String municipio, String uf,
			String cep, Integer codPais, String pais, String fone) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.codMunicipio = codMunicipio;
		this.municipio = municipio;
		this.uf = uf;
		this.cep = cep;
		this.codPais = codPais;
		this.pais = pais;
		this.fone = fone;
	}


	public Endereco(NFEndereco endereco ) {
		
		this.setLogradouro(endereco.getLogradouro());
		this.setNumero(endereco.getNumero());
		this.setBairro(endereco.getBairro());
		this.setCodMunicipio(endereco.getCodigoMunicipio());
		this.setMunicipio(endereco.getDescricaoMunicipio());
		this.setUf(endereco.getUf());
		this.setCodPais(endereco.getCodigoPais().getCodigo());
		this.setPais(endereco.getCodigoPais().getDescricao());
		this.setFone(endereco.getTelefone());
		
	}
	
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCodMunicipio() {
		return codMunicipio;
	}
	public void setCodMunicipio(String codMunicipio) {
		this.codMunicipio = codMunicipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public Integer getCodPais() {
		return codPais;
	}
	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	
	
	
	
}
