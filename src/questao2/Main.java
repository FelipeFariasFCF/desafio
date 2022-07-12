package questao2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ContaCorrente corrente = new ContaCorrente();
		ContaPoupanca poupanca = new ContaPoupanca();
		
		poupanca.setNumero(1010);
		poupanca.setTitular("Alfred Penniworth");
		poupanca.setSaldo(100.0);
		
		corrente.setNumero(1011);
		corrente.setTitular("Bruce Wayne");
		corrente.setSaldo(100.0);
		
		System.out.println("saldo conta poupanca: $" + poupanca.getSaldo());
		System.out.println("rendimento conta poupanca: $" + poupanca.rendimento());
		System.out.println();
		System.out.println("saldo conta corrente: $" + corrente.getSaldo());
		System.out.println("rendimento conta corrente: $" + corrente.rendimento());
		
		
		sc.close();
	}
}