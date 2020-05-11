package com.unimonte.amar.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("")//Vai rodar na porta padrão
	private String showHomePage() {

		System.out.println("Mostrar home page");

		return "home-page";//vai retornar a pagina jsp correspondente

	}

}
