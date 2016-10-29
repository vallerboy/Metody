package pl.akademiakodu.metody;

public class Zadanie6 {

	public static void main(String[] args) {

		Zadanie6 zadanie = new Zadanie6();
		System.out.println("Wynik sumy: " + zadanie.sum(12312));

	}

	int sum(int a) {

		String converted = String.valueOf(a);

		int sum = 0; 
		for (int i = 0; i < converted.length(); i++) {
            sum += Character.getNumericValue(converted.charAt(i));
		}
      
		return sum;
	}

}
