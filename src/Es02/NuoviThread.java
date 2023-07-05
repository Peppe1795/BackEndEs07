package Es02;

public class NuoviThread extends Thread {
	private int[] arrayNumeri1;
	private int[] arrayNumeri2;
	private int[] arrayNumeri3;
	private int somma = 0;

	public NuoviThread(int[] arrayNumeri1, int[] arrayNumeri2, int[] arrayNumeri3) {
		this.arrayNumeri1 = arrayNumeri1;
		this.arrayNumeri2 = arrayNumeri2;
		this.arrayNumeri3 = arrayNumeri3;
	}

	@Override
	public void run() {
		somma = calcolaSomma(arrayNumeri1) + calcolaSomma(arrayNumeri2) + calcolaSomma(arrayNumeri3);
		System.out.println("La somma dei numeri negli array è: " + somma);
	}

	private int calcolaSomma(int[] array) {
		int sommaParziale = 0;
		for (int numero : array) {
			sommaParziale += numero;
		}
		return sommaParziale;
	}
}