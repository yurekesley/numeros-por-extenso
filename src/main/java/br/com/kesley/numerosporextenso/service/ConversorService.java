package br.com.kesley.numerosporextenso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.caelum.stella.inwords.NumericToWordsConverter;

@Service
public class ConversorService implements IConversorService {

	@Autowired
	private NumericToWordsConverter converter;

	@Override
	public String converterToExtenso(Double numero) {

		if (!isNegative(numero)) {
			return converter.toWords(numero);
		}

		return "menos " + converter.toWords(numero * -1);

	}

	public boolean isNegative(double value) {
		return value < 0;
	}

}
