package Es02;

import java.util.Arrays;
import java.util.Random;

public class App {

	public static void main(String[] args) {
		int somma = 0;
		int[] arrayNum = new int[3000];
		casuale(arrayNum);
		for (int numero : arrayNum) {
			somma += numero;
		}
		System.out.println("La somma dei numeri nell'array è: " + somma);

		System.out.println("---------------Array1--------------");
		int[] arrayNumeri1 = Arrays.copyOfRange(arrayNum, 0, 1000);
		ciclaEStampa(arrayNumeri1);
		System.out.println("---------------Array2--------------");
		int[] arrayNumeri2 = Arrays.copyOfRange(arrayNum, 1000, 2000);
		ciclaEStampa(arrayNumeri2);
		System.out.println("---------------Array3--------------");
		int[] arrayNumeri3 = Arrays.copyOfRange(arrayNum, 2000, 3000);
		ciclaEStampa(arrayNumeri3);

		NuoviThread t1 = new NuoviThread(arrayNumeri1, arrayNumeri2, arrayNumeri3);
		t1.start();
	}

	public static int[] casuale(int[] array) {
		Random rndm = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rndm.nextInt(3000);
		}
		return array;
	}

	public static void ciclaEStampa(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
}
