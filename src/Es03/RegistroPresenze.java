package Es03;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {
	private String nome;
	private int giorniPresenza;
	private static File file = new File("registro.txt");

	static List<RegistroPresenze> lista = new ArrayList<>();

	public RegistroPresenze(String nome, int giorni) {
		this.setNome(nome);
		this.setGiorniPresenza(giorni);
	}

	public static void saveDisk(RegistroPresenze text) {
		try {
			FileUtils.writeStringToFile(file, text.toString() + System.lineSeparator(), "UTF-8", true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readDisk() throws IOException {
		if (file.exists()) {
			String contenuto = FileUtils.readFileToString(file, "UTF-8");
			System.out.println(contenuto);
			return contenuto;

		} else {
			System.out.println("File non trovato");
			return "";
		}

	}

	public static void aggiungiElemento(String nome, int giorniPresenza) {
		RegistroPresenze elemento = new RegistroPresenze(nome, giorniPresenza);
		lista.add(elemento);
	}

	public static void stampareRegistro() {
		try {
			String contenuto = readDisk();
			System.out.println(contenuto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Nome:" + getNome() + ", Presenze: " + "@" + getGiorniPresenza() + "#";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGiorniPresenza() {
		return giorniPresenza;
	}

	public void setGiorniPresenza(int giorniPresenza) {
		this.giorniPresenza = giorniPresenza;
	}
}