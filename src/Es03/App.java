package Es03;

public class App {
	public static void main(String[] args) {

		RegistroPresenze.aggiungiElemento("Mario", 30);
		RegistroPresenze.aggiungiElemento("Giulia", 40);

		for (RegistroPresenze elemento : RegistroPresenze.lista) {
			RegistroPresenze.saveDisk(elemento);
		}
		RegistroPresenze.stampareRegistro();
	}
}
