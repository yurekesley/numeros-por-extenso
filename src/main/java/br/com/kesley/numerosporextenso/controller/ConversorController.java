package br.com.kesley.numerosporextenso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kesley.numerosporextenso.response.NumeroResponse;
import br.com.kesley.numerosporextenso.service.IConversorService;

@RestController
@RequestMapping("conversor")
public class ConversorController {

	@Autowired
	IConversorService converter;

	@GetMapping("/por-extenso/{numero}")
	public NumeroResponse porExtenso(@PathVariable Double numero) {
		return new NumeroResponse(converter.converterToExtenso(numero));
	}
}
