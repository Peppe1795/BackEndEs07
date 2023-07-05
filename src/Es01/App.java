package Es01;

public class App {

	public static void main(String[] args) {
		Simboli s1 = new Simboli("*");
		Simboli s2 = new Simboli("#");
		s1.start();
		try {
			s1.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		s2.start();
	}

}
