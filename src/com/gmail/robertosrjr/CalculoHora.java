package com.gmail.robertosrjr;

import java.math.BigDecimal;

public class CalculoHora implements CalculoValor {
	
	private BigDecimal valorHora = new BigDecimal(12.0);
	@Override
	public void calcular(Long tempo) {
		
		Long minuto = 60000L;
		Long hora = minuto * 60;
		Long duracao = (tempo/hora);
		System.out.println("Calculo de Hora...: R$ " + new BigDecimal(duracao).multiply(valorHora));
		
	}

}
