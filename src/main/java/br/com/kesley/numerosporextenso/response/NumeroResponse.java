package br.com.kesley.numerosporextenso.response;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public @Data class NumeroResponse implements Serializable {

	private String extenso;

}
