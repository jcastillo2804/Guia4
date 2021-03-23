package com.senati.eti;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Integer[] numeros = new Integer[5];
		
		System.out.println("LECTURA DE N�MEROS");
		System.out.println("------------------");
		
		for (int x = 0; x <= numeros.length - 1; x++) {
			System.out.print("Ingrese n�mero " + (x + 1) + ": ");
			numeros[x] = sc.nextInt();
		}
		
		// Ordenar de forma ascendente
		Arrays.sort(numeros);
		
		System.out.println("\nN�MEROS ORDENADOS DE FORMA ASCENDENTE");
		System.out.println("-------------------------------------");
		for (int x = 0; x < numeros.length; x++)
			System.out.println("N�mero " + (x + 1) + ": " + numeros[x]);
		
		// Ordenar de forma descendente
		Arrays.sort(numeros, Collections.reverseOrder());
		
		System.out.println("\nN�MEROS ORDENADOS DE FORMA DESCENDENTE");
		System.out.println("---------------------------------------");
		for (int x = 0; x < numeros.length; x++)
			System.out.println("N�mero " + (x + 1) + ": " + numeros[x]);
	}
	
}
