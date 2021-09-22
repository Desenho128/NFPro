package br.com.NFPro.model;

import javax.persistence.Entity;

import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfoDestinatario;

@Entity
public class Destinatario extends Cadastro {

	public Destinatario(NFNotaInfoDestinatario destinatario) {

		this.setNome(destinatario.getRazaoSocial());
		this.setFantasya(destinatario.getRazaoSocial());
		this.setCnpj_rg(destinatario.getCnpj());
		this.adicionaEndereço(new Endereco(destinatario.getEndereco()));
	}

	
	
}
