package com.gmail.robertosrjr;

import java.util.Calendar;

public class Principal {

	public static void main(String[] args) {
		
		Calendar calIni = Calendar.getInstance();
		Calendar calFim = Calendar.getInstance();
		
		calIni.set(2019, 5, 7, 8, 15, 0);
		calFim.set(2019, 5, 7, 14, 20, 0);

		Long dif = calFim.getTimeInMillis() - calIni.getTimeInMillis();

		CalculoValor cv = new CalculoFactory().build(dif);
		cv.calcular(dif);

	}
}
