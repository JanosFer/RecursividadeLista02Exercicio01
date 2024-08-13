package controller;

public class MultiplicacaoController {
	public MultiplicacaoController() {
		super();
	}
	
	public int multiplica(int a, int b) {
		if(b == 0) {
			return 0;
		}else {
			return a + multiplica(a, b-1);
		}
	}
}
