package com.unimonte.amar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unimonte.amar.entities.Participantes;
import com.unimonte.amar.services.ParticipantesService;

@Controller//Esta classe é um controller
@RequestMapping("/participantes")
public class ParticipantesController {

	@Autowired
	//private ParticipantesRespository repository;//esta fazendo a injeção de dependecia de forma explicita
	
	private ParticipantesService repository;
	
	@RequestMapping("/list")
	public String listaParticipantes(Model theModel) {
		
		System.out.println("========== Metodo lista de participantes ===========");
		
		List<Participantes> theParticipantes = repository.findAll();//esta armazenando na lista os todos os participantes cadastrados 
		
		theModel.addAttribute("participantes",theParticipantes);
		
		return "participantes-list";//vai retorna a pagina com a lista de participantes
		
	}
		
	@GetMapping("/showFormForAddParticipantes")//Vai chamar a pagina de formulario para inserir os dados dos participantes
	public String showFormForAddParticipantes(Model theModel) {

		System.out.println("acessou o metodo showFormForAddParticipantes");

		Participantes theParticipantes = new Participantes();

		theModel.addAttribute("participantes", theParticipantes);

		return "participantes-form";

	}
		
	@InitBinder//Pré processara todos os dados que chegarem no nosso controller pelo formulario
	public void initBinder(WebDataBinder dataBinder) {
		
		System.out.println("Entrou no metodo initBlinder");
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
		
	//@ModelAttribute("participantes") Participantes theParticipantes
	@RequestMapping("/saveParticipante")
	public String saveParticipante(@Valid @ModelAttribute("participantes") Participantes theParticipantes, BindingResult theBindingResult) {
		
		System.out.println("Entrou no metodo saveParticipante()");
		
		if (theBindingResult.hasErrors()) {//Vai verificar se há algum erro de validação caso haja algum erro
			
			System.out.println("Ocorreu um erro de validação");
			
			return "redirect:/participantes/showFormForAddParticipantes";//ele vai retornar para a pagina do formulario de novo
			
		}else {
		
		List<Participantes>participantes = repository.findAll();//Vai fazer uma lista percorrendo todos os participantes.
			
		for (Participantes participantes2 : participantes) {
			
			if (participantes2.getCpf().contains(theParticipantes.getCpf()) || participantes2.getMatricula().contains(theParticipantes.getMatricula())) {//esta comparando a lista com o obejeto mandado pelo parametro
				
				System.out.println("Usuario já existente");
				
				return "redirect:/participantes/showFormForAddParticipantes";//se houver algum usuario com cpf ou ra existente ele ira redirecionar para pagina de formulario
			
			}
			
		}
		
		System.out.println("Salvou o participante");
		
		
		repository.save(theParticipantes);//vai salvar o participante passado como argumento

		return "redirect:/participantes/list";//vai redirecionar para a pafgina que retorna uma lista

		}
	}
	
	@GetMapping("/delete")
	public String deleteParticipante(@RequestParam("participanteId") int theId) {

		// vai deletar o participante que o id corresponder no parametro

		repository.deleteById(theId);

		return "redirect:/participantes/list";

	}
	
}
