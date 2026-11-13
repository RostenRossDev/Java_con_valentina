package ejercicios;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
//El tipo de dato   nombre    contenido
		Scanner     scanner = new Scanner(System.in); // Scanner es el objeto que nos permite ingresar datos por teclado
		
		System.out.println("Por favor ingrese un numero entero: ");
		
		int input = scanner.nextInt(); //El metodo nextInt, pausa el programa hasta que ingrese un valor por teclado
		
		int resultado = input % 2;
		
		if (resultado == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("No es par");
		}
		
		
		if (resultado == 1) {
			System.out.println("No es par");
		} else {
			System.out.println("Es par");
		}
	}
}
