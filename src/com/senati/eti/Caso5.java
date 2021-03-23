package com.senati.eti;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrCodigo = {"A-123", "A-456", "A-789", "A-777"};
		String[] arrNombre = {"Joe Castillo", "Rosa Flores", "Ricardo Montes", "Teresa L�pez"};
		int[] arrNota = {15, 8, 17, 11};
		
		System.out.println("B�SQUEDA DE DATOS");
		System.out.println("-----------------");
		System.out.print("C�digo a buscar: ");
		String codigo = sc.nextLine(); // A-456
		
		int pos = -1;
		
		for (int x = 0; x < arrCodigo.length; x++) {
			if (codigo.equals(arrCodigo[x])) {
				pos = x;
				break;
			}
		}
		
		if (pos == -1) {
			System.out.println("\n--------------------");
			System.out.println("C�DIGO NO ENCONTRADO");
			System.out.println("--------------------");
		}
		else {
			System.out.println("\n-----------------");
			System.out.println("C�DIGO ENCONTRADO");
			System.out.println("-----------------");
			System.out.println("C�digo........: " + arrCodigo[pos]);
			System.out.println("Nombre........: " + arrNombre[pos]);
			System.out.println("Nota..........: " + arrNota[pos]);
		}
	}

}










