package pl.akademiakodu.metody;

public class Zadanie12 {

	public static void main(String[] args) {

		Zadanie12 zadanie = new Zadanie12();
		
		System.out.println("Najwi�ksz� ilo�� dzielnik�w ma liczba: " + zadanie.getMaxDividers());

	}

	public int getMaxDividers() {
		int[] arrayOfAnswer = new int[10000];

		for (int i = 2; i < 10000; i++) {
			arrayOfAnswer[i] = quantityOfDividers(i);
		}

		int max = 0;
		int indexTemp = 0;
		for (int i = 0; i < arrayOfAnswer.length; i++) {
			if (max < arrayOfAnswer[i]) {
				max = arrayOfAnswer[i];
				indexTemp = i;
			}
		}

		return indexTemp;
	}

	public int quantityOfDividers(int x) {

		int counter = 2;
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0)
				counter++;
		}

		return counter;
	}

}