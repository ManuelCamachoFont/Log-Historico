package es.studium.Historico;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Modelo {

	public String formatear(String texto) {
		LocalDateTime timestamp = LocalDateTime.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String cadenaFormateada = "[" + timestamp.format(formato) + "] " + texto;
		return cadenaFormateada;
	}

	public void guardar(String textoFormateado) {

		try {
			FileWriter fw = new FileWriter("historico.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter salida = new PrintWriter(bw);
			salida.println(textoFormateado);
			salida.close();
			bw.close();
			fw.close();
		} catch (IOException ioe) {
			System.err.println("Error de archivo");
		}

	}

}
