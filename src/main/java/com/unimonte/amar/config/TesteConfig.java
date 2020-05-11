package com.unimonte.amar.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.unimonte.amar.entities.Participantes;
import com.unimonte.amar.repositories.ParticipantesRespository;

@Configuration("test")
//esta é uma classe que serve apenas para fins de teste elexecutarra alguns comando de inserte só para fins didaticos
public class TesteConfig implements CommandLineRunner{

	@Autowired//esta fazendo a injeção de dependencia de forma explicita
	private ParticipantesRespository participantesRespository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		Participantes participantes = new Participantes("Felipe","Lino","51821583","f.lino1934@hotmail.com",22, "Analise de desenvolvimento de sistemas","493.669.018-08");
		Participantes participantes2 = new Participantes("Mayara","Ferreira", "51823168","mayaraferreirac@hotmail.com", 24, "Odontologia", "336.658.398-31");
		Participantes participantes3 = new Participantes("Mariana", "Gonçalves Barbosa", "51824251", "marygbarbosa@gmail.com",33,"Analise de desenvolvimento de sistemas","355.342.668-30");
		Participantes participantes4 = new Participantes("Luiz", "Martins Ferreira Júnior","51822986","Luizmartinssk8@gmail.com", 21, "Analise de desenvolvimento de sistemas","465.315.188-12");
		Participantes participantes5 = new Participantes("Roberto","Ferreira Tavares","51820991","tavaresroberto16@gmail.com", 27, "Analise de desenvolvimento de sistemas","342.771.688-09");
		Participantes participantes6 = new Participantes("Gabriela", "Nunes Gonzaga", "51821916", "gabriela.gonzaga1999@gmail.com", 21,"Analise de desenvolvimento de sistemas", "474.971.608-18");
		
		
		participantesRespository.saveAll(Arrays.asList(participantes,participantes2,participantes3,participantes4,participantes5,participantes6));
		
	}
	
	
	
	
}
