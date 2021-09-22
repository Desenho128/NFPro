package br.com.NFPro.api;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaInfo;
import com.fincatto.documentofiscal.nfe400.classes.nota.NFNota;
import com.fincatto.documentofiscal.nfe400.classes.nota.NFNotaProcessada;
import com.fincatto.documentofiscal.utils.DFPersister;

import br.com.NFPro.model.Destinatario;
import br.com.NFPro.model.Emitente;
import br.com.NFPro.model.Nota;

@RestController
@RequestMapping("/api/importnfe")
public class ImportNfeRest {
	
	
	@GetMapping
	public Boolean importNfe() {
			
		try {
			File xml = new File("C:\\Users\\fabio\\Desktop\\nota.xml");
			NFNotaProcessada notaProcessada = new DFPersister().read(NFNotaProcessada.class,xml );
			NFNotaInfo nota = notaProcessada.getNota().getInfo();
			Nota nf = new Nota(nota);

			return true;
			
		} catch (Exception e) {
			return false;
		}
		
		
		
	}
	
	
	
}
