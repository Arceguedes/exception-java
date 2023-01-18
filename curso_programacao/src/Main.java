import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		//Delimitar a quantidade de itens que eu quero imprimir:
		//1. Colocar um F em print para falar que você quer formatado
		//2. Delimitar o valor antes do número
		
		double x = 2.832447;
		System.out.printf("%.2f%n",x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n",x);
		
		System.out.printf("Minha conta bancária possui R$%.2f reais%n",x);
		*/
		
		
		Scanner sc = new Scanner(System.in);
		
		String w,x;
		char y;
		Double z;
		
		w = sc.next();
		System.out.println(w);
		
		
		/*Se você monta algum print antes da NextLine, a linha que foi deixada
		 pendente para o próximo comando será preenchida pela nextline, dando problema
		 Por isso, é bom colocar OUTRO nextline pra preencher esse pendente
		 */
		sc.nextLine();
		x = sc.nextLine();
		System.out.println(x);
		
		y = sc.next().charAt(0);
		System.out.println(y);

		z = sc.nextDouble();
		System.out.println(z);
		
		sc.close();
		
		
	}
}
