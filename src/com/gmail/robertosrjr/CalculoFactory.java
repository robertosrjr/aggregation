package com.gmail.robertosrjr;

import java.util.Calendar;

public class CalculoFactory {
	
	private final Long QUINZE_MINUTOS = 900000L;
	private final Long SEIS_HORAS =   21600000L;	
	
	public CalculoValor build(Calendar dataInicio, Calendar dataFim) {
		
		CalculoValor cv = null;
		Calendar cal = Calendar.getInstance();
		Long dif = dataFim.getTimeInMillis() - dataInicio.getTimeInMillis();

		if (dif <= QUINZE_MINUTOS) {
			
			return CalculoTempoEnum.CALCULO_15_MINUTOS.getInstance();
		} else if (dif < SEIS_HORAS) {
			
			return CalculoTempoEnum.CALCULO_HORA.getInstance();
		}

		return CalculoTempoEnum.CALCULO_DIARIA.getInstance();
		
	}
}
