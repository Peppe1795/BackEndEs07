package Es01;

public class Simboli extends Thread {
	private String simbolo;

	public Simboli(String simboli) {
		this.simbolo = simboli;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(simbolo);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
