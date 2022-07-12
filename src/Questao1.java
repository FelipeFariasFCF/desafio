import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, faixa1 = 0, faixa2 = 0, faixa3 = 0, faixa4 = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
		double peso;

		for (int i = 0; i < 10; i++) {
			System.out.print("IDADE: ");
			idade = sc.nextInt();
			System.out.print("PESO: ");
			peso = sc.nextDouble();

			if (idade >= 1 && idade <= 10) {
				cont1++;
				faixa1 += peso;
			} else if (idade >= 11 && idade <= 20) {
				cont2++;
				faixa2 += peso;
			} else if (idade >= 21 && idade <= 30) {
				cont3++;
				faixa3 += peso;
			} else {
				cont4++;
				faixa4 += peso;
			}

		}

		if(faixa1 !=0 && cont1 != 0) {
			System.out.println("Peso medio da faixa etaria 1 a 10 anos = " + (faixa1 / cont1) + "Kg");
		} else {
			System.out.println("Nao possui parametros para calculo");
		}
		
		if(faixa2 !=0 && cont2 != 0) {
			System.out.println("Peso medio da faixa etaria 11 a 20 anos = " + (faixa2 / cont2) + "Kg");
		} else {
			System.out.println("Nao possui parametros para calculo");
		}
		
		if(faixa3 !=0 && cont3 != 0) {
			System.out.println("Peso medio da faixa etaria 21 a 30 anos = " + (faixa3 / cont3) + "Kg");
		} else {
			System.out.println("Nao possui parametros para calculo");
		}
		
		if(faixa4 !=0 && cont4 != 0) {
			System.out.println("Peso medio da faixa etaria acima de 30 anos = " + (faixa4 / cont4) + "Kg");
		} else {
			System.out.println("Nao possui parametros para calculo");
		}
		sc.close();
	}
}