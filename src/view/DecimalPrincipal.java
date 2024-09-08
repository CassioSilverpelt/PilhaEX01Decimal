package view;

import javax.swing.JOptionPane;

import controller.DecimalController;

public class DecimalPrincipal {

	public static void main(String[] args) {
		DecimalController decCon = new DecimalController();
	
		int num = -1;
		while (num <= 0 || num > 1000) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor a ser convertido em binário (entre 0 e 1000: "));
		}
		System.out.println(decCon.dectoBin(num));
	}
}
