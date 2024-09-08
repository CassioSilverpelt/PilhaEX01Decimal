package controller;
import model.*;

public class DecimalController {

	public DecimalController() {
		super();
	}
	 
	No decimal = new No();
	Pilha p = new Pilha();
	
	/*public void converterBinario(int num) {
		while (num != 0) {
			p.push(num%2);
			num = num/2;
		}
		imprimePilha();
	}
	
	private void imprimePilha() {
		while(p.isEmpty() == false) {
			try {
				System.out.print(p.pop());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}*/
	
	public String dectoBin(int decimal) {
		String bin = "";
		while (decimal != 0) {
			p.push(decimal%2);
			decimal = decimal/2;
		}
		while (!p.isEmpty()) {
			try {
				bin = bin + p.pop();
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return bin;
	}
}
