package es.studium.Historico;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.TextArea;
import java.awt.TextField;

public class Vista {

	Frame ventana = new Frame("Histórico de Operaciones");
	TextField txt = new TextField(30);
	TextArea txtInfo = new TextArea();
	Button btn = new Button("Agregar");
	
	GridBagLayout gridbag = new GridBagLayout();
	GridBagConstraints gbc = new GridBagConstraints();
	
	public Vista() {
		
		ventana.setSize(400, 300);
		ventana.setLayout(gridbag);
		ventana.setBackground(new Color(75, 75, 250));
		gbc.weightx = 1;
		gbc.weighty = 1;
		
		gbc.insets = new Insets(10, 10, 10, 10);
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		ventana.add(txt, gbc);
		
		gbc.gridx = 1;
		ventana.add(btn, gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		txtInfo.setEditable(false);
		ventana.add(txtInfo, gbc);
		gbc.gridwidth = 1;
		
		ventana.setResizable(true);
		ventana.setVisible(true);
	}
}
