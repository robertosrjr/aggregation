package com.gmail.robertosrjr;

public enum CalculoTempoEnum {
	
	CALCULO_15_MINUTOS(new Calculo15Minutos()),
	CALCULO_DIARIA(new CalculoDiaria()),
	CALCULO_HORA(new CalculoHora());
	
	CalculoTempoEnum(CalculoValor cv) {
		
		this.instance = cv;
	}
	
	private CalculoValor instance;

	public CalculoValor getInstance() {
		return instance;
	}

	public void setInstance(CalculoValor instance) {
		this.instance = instance;
	}
	

}
