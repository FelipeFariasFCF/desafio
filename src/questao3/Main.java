package questao3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Esportivo esportivo = new Esportivo();
		Caminhao caminhao = new Caminhao();
		
		System.out.println("Esportivo ou caminhao");
		System.out.print("Qual tipo de automovel (E/C) ? ");
		char type = sc.next().charAt(0);
		if(type == 'E' || type == 'e') {
			System.out.print("Tipo de combustivel do ESPORTIVO: ");
			System.out.println(esportivo);
		} else if(type == 'C' || type == 'c'){
			System.out.print("Tipo de combustivel do CAMINHAO: ");
			System.out.println(caminhao);
		} else {
			System.out.println("Tipo invalido!");
		}
		sc.close();
	}
}