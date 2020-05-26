package com.unimonte.amar.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unimonte.amar.entities.Participantes;
import com.unimonte.amar.exceptions.NotFoundException;
import com.unimonte.amar.services.ParticipantesService;

@RestController
@RequestMapping("/api")
public class ParticipantesResources {

	@Autowired
	ParticipantesService service;

	@GetMapping("/participantes")
	public ResponseEntity<List<Participantes>> findAll() {

		List<Participantes> list = service.findAll();

		return ResponseEntity.ok().body(list);
	}

	@GetMapping("/participantes/{id}")
	public ResponseEntity<Participantes> findById(@PathVariable Integer id) {

		Participantes obj = service.findById(id);
		
		if (obj == null) {
			
			//Depois vamos adicionar uma exception nesta area 
			
			throw new NotFoundException("Id do cliente não encontrado!");
			
		}

		return ResponseEntity.ok().body(obj);

	}
	
	@PostMapping("/participantes")
	public ResponseEntity<Participantes> addCliente(@RequestBody Participantes theParticipantes){
		
		theParticipantes.setId(0);
		service.save(theParticipantes);
		return ResponseEntity.ok().body(theParticipantes);
		
	}
	
	@PutMapping("/participantes")
	public ResponseEntity<Participantes> updateCliente(@RequestBody Participantes theParticipantes) {
		
		service.save(theParticipantes);
		
		return ResponseEntity.ok().body(theParticipantes);
		
	}
	
	@DeleteMapping("/participantes/{id}")
	public String deleteCliente(@PathVariable Integer id){
		
		Participantes theParticipantes = service.findById(id);
		
		if (theParticipantes == null) {
			
			//Depois vamos adicionar uma exception nesta area
			
			throw new NotFoundException("Id do cliente não encontrado!");
			
		}
		
		service.deleteById(id);
		
		return "Cliente deletado - "+theParticipantes.getNome()+" Id - "+id;
		
	}
	
	

}
