package com.unimonte.amar.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unimonte.amar.entities.Participantes;
import com.unimonte.amar.services.ParticipantesService;

@RestController
@RequestMapping("nparticipantes")
public class ParticipantesResource {

	@Autowired//esta fazendo uma  injeção de dependencia de forma explicita 
	ParticipantesService service;
	
	@GetMapping
	public ResponseEntity<List<Participantes>> findAll() {
		//vai retornar todos os participantes
		System.out.println("findAll() participantes");
		
		List<Participantes> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}
	
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Participantes> findById(@PathVariable Integer id) {

		System.out.println("Retornar um participante por id,       ID-->  "+id);
		
		Participantes obj = service.findById(id);

		return ResponseEntity.ok().body(obj);

	}
	
}
