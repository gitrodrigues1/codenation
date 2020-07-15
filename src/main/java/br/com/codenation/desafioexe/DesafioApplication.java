package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> fibonacciList = new ArrayList<Integer>();
		int beforeNumber = 0;
		int actualNumber = 0;
		int nextNumber =1;

		//todo - melhorar essa condicao do for
		for (int i=1; i<=15; i++) {
			fibonacciList.add(actualNumber);
			beforeNumber = actualNumber;
			actualNumber = nextNumber;
			nextNumber = beforeNumber + actualNumber;
		}
		return fibonacciList;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}