package pl.akademiakodu.metody;

public class Zadanie8 {

	public static void main(String[] args) {
		Zadanie8 zadanie = new Zadanie8();
		
		long start = System.nanoTime();
		zadanie.czyPierwsza(2135412423); // Bez optymalizacji
		long stop = System.nanoTime();
		
		System.out.println(stop-start);
		
		 start = System.nanoTime();
		zadanie.czyPierwsza(2135412423); // Z optymalizacj¹
		 stop = System.nanoTime();
		 
		System.out.println(stop-start);
		
	}

	// Z optymalizacja
	boolean czyPierwsza(int liczba) {
		 
    
        if (liczba == 1) {
            System.out.println("Liczba nie jest liczba pierwsza");
            return false;
        }
 
        for (int i = 2; i < liczba; i++) {
            if (liczba % i == 0) {
                return false;
            }
        }
 
       
        System.out.println("Liczba " + liczba + " jest liczba pierwsza");
        return true;
 
    }
	
	// Bez optymalizacji 
	boolean czyPierwszaOld(int liczba) {
		 
        int counter = 0;
        if (liczba == 1) {
            System.out.println("Liczba nie jest liczba pierwsza");
            return false;
        }
 
        for (int i = 2; i <= liczba; i++) {
            if (liczba % i == 0) {
                counter++;
            }
        }
 
        if (counter > 1) {
            System.out.println("liczba nie jest liczba pierwsza");
            return false;
        }
        System.out.println("Liczba " + liczba + " jest liczba pierwsza");
        return true;
 
    }
	
}
