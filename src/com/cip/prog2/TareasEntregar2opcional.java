package com.cip.prog2;

import java.util.Scanner;

public class TareasEntregar2opcional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduzca los grados Fº: ");
		
		double Fahrenheit = sc.nextDouble();
		
		double Cº = (Fahrenheit - 32) * 5 / 9;
		
		System.out.println("Son " + Cº + " Cº");
		
		sc.close();

	}

}
