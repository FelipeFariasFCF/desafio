import java.util.Scanner;

public class Questão4 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		
		if(idade >= 18 && idade <= 67) {
			System.out.println("Idade permitida para doar sangue.");
		} else {
			System.out.println("Idade nao permitida para doar de sangue.");
		}
		sc.close();
	}
}