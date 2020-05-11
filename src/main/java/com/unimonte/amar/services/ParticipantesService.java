package com.unimonte.amar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unimonte.amar.entities.Participantes;
import com.unimonte.amar.repositories.ParticipantesRespository;

@Service//esta falando que essa classe é uma classe de serviço
//nesta classe vai ficar toda a logica de serviço
public class ParticipantesService {

	@Autowired
	private ParticipantesRespository repository;//Esta fazendo a injeção de dependecia do ParticipantesRespository de forma explicita.
	
	public List<Participantes>findAll(){
		
		return repository.findAll();//vai fazer uma lista e buscar todos os participantes.
		
	}
	
	public Participantes findById(Integer id) {
		
		repository.findById(id);//vai pesquisar pelo id 
		
		Optional<Participantes> obj = repository.findById(id);// vai adicionar ao valor o valor do id solicitado 
		
		return obj.get();//vai retornar o id solicitado
		
	}
	
	
}
