package com.bebel.first_spring_app.controller;

import com.bebel.first_spring_app.service.HelloWorldService;
//import com.bebel.first_spring_app.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/hello-world")
public class HelloWorldController{

	private HelloWorldService helloWorldService; //Crio um objeto do tipo do meu Service

	@Autowired // Possibilita fazer a injeção do argumento passado no construtor em meu site
	public HelloWorldController(HelloWorldService _helloWorldService){ //Crio um construtor
		this.helloWorldService = _helloWorldService;
	}

	@GetMapping 
	public String helloWorld(){
		return this.helloWorldService.helloWorld("Bebel"); //Estou chamando a função 
														   //helloWorld DO SERVICE!
	}
/*
 *O método post está funcionando via curl apenas
 *
	@PostMapping("/{id}")
	public String helloWorldPost(@PathVariable("id") String id){ 
		//Criei uma variável que id que recebe tudo o que vem depois da rota

		//Caso eu usasse o meu objeto, precisaria passar na função: @RequestBody User body
		//Assim, leria o meu objeto do tipo User recebendo os valores por um JSON
		
		//return "Hello, object: " + body.getName(); //Pegaria os dados por um JSON
		return "Hello, " + id + "!";
	}
*/
}
