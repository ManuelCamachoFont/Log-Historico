package es.studium.Historico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Controlador extends WindowAdapter implements ActionListener {

	private Vista v;
	private Modelo m;
	
	public Controlador(Modelo modelo, Vista vista) {
		this.m = modelo;
		this.v = vista;
		v.btn.addActionListener(this);
		v.ventana.addWindowListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(v.btn)) {
			String texto = v.txt.getText();		
			v.txt.setText("");
			v.txt.requestFocus();
			if (!texto.isEmpty()) {
				String textoFormateado = m.formatear(texto);
				m.guardar(textoFormateado);
				v.txtInfo.append(textoFormateado + "\n");
			}
		}
		
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		if (e.getSource().equals(v.ventana)) {
			System.exit(0);
		}
	}

}
