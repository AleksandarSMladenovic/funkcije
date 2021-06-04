package funkcije;

import java.util.Scanner;

public class Funkcije2 {

	public static void main(String[] args) {

		/*
		 * Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i taj program treba da pozove
		 *  i vrati (u mainu) proizvod unetih brojeva.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri prirodna broja: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		proizvod(a, b, c);
		
	}

	public static void proizvod(int a, int b, int c) {
		int proizvod = a * b * c;
		
		System.out.println("Proizvod unetih brojeva je: " + proizvod);
	}
}
