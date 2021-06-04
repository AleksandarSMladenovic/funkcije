package funkcije;

import java.util.Scanner;

public class Funkcije3 {

	public static void main(String[] args) {

		/*
		 * DodatniFunkcije3: -> spojena prva dva zadatka sa malo izmenjenim zahtevima ->
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
		 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
		 * najveci od unetih brojeva.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri prirodna broja: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		zbir(a, b, c);
		
		System.out.println("Najveci od unetih brojeva je: " + najveci(a, b, c));
	}
	
	public static void zbir(int a, int b, int c) {
		System.out.println("Zbir unesenih brojeva je: " + (a + b + c));
	}
	
	public static int najveci(int a, int b, int c) {
		int najveci = 0;
		
		if(a > b) {
			najveci = a;
			if(a > c) {
				najveci = a;
			}else {
				najveci = c;
			}
		}else if(b > c) {
			najveci = b;
		}else {
			najveci = c;
		}
		return najveci;
	}

}
