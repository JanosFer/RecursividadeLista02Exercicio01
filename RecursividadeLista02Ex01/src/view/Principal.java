package view;

import controller.MultiplicacaoController;

public class Principal {

	public static void main(String[] args) {
		MultiplicacaoController mc = new MultiplicacaoController();
		
		int a = 8, b = 9;
		
		System.out.println(mc.multiplica(a, b));
	}

}
