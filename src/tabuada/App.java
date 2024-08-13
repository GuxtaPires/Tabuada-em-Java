package tabuada;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-----------------Cálculo de Tabuada-----------------");
		System.out.print("Olá, informe o a tabuada que você quer calcular: ");
		int tabuada = sc.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println("----------------------------------------------------");
			System.out.println(tabuada + " * " + i + " = " + (tabuada * i));
		}
	}

}
