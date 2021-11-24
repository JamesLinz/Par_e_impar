/*
Programa que pede N n�meros inteiros, calcula e mostra a quantidade de 
n�meros pares e �mpares.
*/

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de n�meros: ");
		quantNumeros = sc.nextInt();
		
		int count = 0;
		do {
			System.out.println("N�mero: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count++;
		} while (count < quantNumeros);
		
		System.out.println("Quantidade de n�meros pares: " + quantPares);
		System.out.println("Quantidade de n�meros �mpares: " + quantImpares);
	}
}
