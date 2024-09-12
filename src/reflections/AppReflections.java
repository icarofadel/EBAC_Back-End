package reflections;

import annotation.ITabelaPagamento;

public class AppReflections {
	public static void main(String args[]) {
		Class classe = ITabelaPagamento.class;
		System.out.println(classe);
	}
}
