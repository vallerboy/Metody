package pl.akademiakodu.metody;

import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {

		// Referencja do naszej klasy, abyœmy mogli odwo³ywaæ siê do metod bez
		// static.
		Zadanie1 zadanie = new Zadanie1();

	}

	int a, b;
	Scanner scan;

	public Zadanie1() {
		scan = new Scanner(System.in);
		System.out.println("Witaj w kalkulatorze ver. 1");
		System.out.print("Podaj komende: ");
		int answer = 0;
		while (answer != 5) {
            answer = scan.nextInt();
			switch (answer) {
			case 1: {
				getNumbers();
				System.out.println("Wynik z dodawania: " + add(a, b));
				System.out.print("Podaj komende: ");
				break;
			}
			case 2: {
				getNumbers();
				System.out.println("Wynik z odejmowania: " + substract(a, b));
				System.out.print("Podaj komende: ");
				break;
			}
			case 3: {
				getNumbers();
				System.out.println("Wynik z mno¿enia: " + multiply(a, b));
				System.out.print("Podaj komende: ");
				break;
			}
			case 4: {
				getNumbers();
				System.out.println("Wynik z dzielenia: " + divide(a, b));
				System.out.print("Podaj komende: ");
				break;
			}

			}
		}
	}

	void getNumbers() {
		System.out.println("Podaj wartoœci liczb a i b: ");
		System.out.print("Liczba a: ");
		a = scan.nextInt();
		System.out.print("Liczba b: ");
		b = scan.nextInt();

	}

	int add(int a, int b) {
		return a + b;
	}

	int substract(int a, int b) {
		return a - b;
	}

	int multiply(int a, int b) {
		return a * b;
	}

	int divide(int a, int b) {
		// if(b == 0) throw new IllegalArgumentException();
		if (b == 0) {
			System.out.println("B nie mo¿e byæ 0");
			return 0;
		}
		return a / b;
	}

}
