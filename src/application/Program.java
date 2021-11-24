/*
Programa que pede N números inteiros, calcula e mostra a quantidade de 
números pares e ímpares.
*/

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int quantNumeros;
		int numero;
		int quantPares = 0, quantImpares = 0;
		
		System.out.println("Quantidade de números: ");
		quantNumeros = sc.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = sc.nextInt();

			if (numero % 2 == 0) quantPares++;
			else quantImpares++;
			
			count++;
		} while (count < quantNumeros);
		
		System.out.println("Quantidade de números pares: " + quantPares);
		System.out.println("Quantidade de números ímpares: " + quantImpares);
	}
}
