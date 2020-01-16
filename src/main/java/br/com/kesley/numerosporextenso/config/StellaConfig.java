package br.com.kesley.numerosporextenso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

@Configuration
public class StellaConfig {

	@Bean
	NumericToWordsConverter numericToWordsConverter() {
		NumericToWordsConverter converter;
		converter = new NumericToWordsConverter(new InteiroSemFormato());
		return converter;
	}

}
