package funkcije;

import java.util.Scanner;

public class Funkcije1 {

	public static void main(String[] args) {

		/*
		 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i
		 * ispise (u mainu) najmanji od ta tri unesena broja.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite tri prirodna broja: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		najmanji(a, b, c);

	}

	public static void najmanji(int a, int b, int c) {

		int najmanji = 0;
		
		if(a < b) {
			najmanji = a;
			if (a < c) {
				najmanji = a;
			}else {
				najmanji = c;
			}
		}else if(b < c){
			najmanji = b;
		}else {
			najmanji = c;
		}
		
		System.out.println("Najmanji od unetih brojeva je: " + najmanji);		
	}
}