package br.com.NFPro.model;

import javax.persistence.Entity;

import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoEmitente;

@Entity
public class Emitente extends Cadastro  {
	
	public Emitente(NFNotaInfoEmitente emitente) {
		
		this.setNome(emitente.getRazaoSocial());
		this.setFantasya(emitente.getNomeFantasia());
		this.setCnpj_rg(emitente.getCnpj());
		this.adicionaEndereço(new Endereco(emitente.getEndereco()));
		
		
	}
	
	
	
}
