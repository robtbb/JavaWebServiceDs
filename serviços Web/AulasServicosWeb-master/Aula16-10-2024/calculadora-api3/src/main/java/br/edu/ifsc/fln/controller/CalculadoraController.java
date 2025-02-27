package br.edu.ifsc.fln.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsc.fln.domain.Calculadora;

@RestController
public class CalculadoraController {

	@RequestMapping(value="/soma/{valor1}/{valor2}", 
			method = RequestMethod.GET)
	public int somar(
			@PathVariable("valor1") int a, 
			@PathVariable("valor2") int b) {
		return Calculadora.somar(a, b);
	}
}
