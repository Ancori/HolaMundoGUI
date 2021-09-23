package dad.holamundo.awt;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class HolaMundo {

	public static void main(String[] args) {

		// creamos la etiqueta para mostrar el saludo
		Label saludoLabel = new Label();
		saludoLabel.setText("Aqu� saldr� el saludo");
		saludoLabel.setBounds(20, 20, 120, 50); // x, y, ancho, alto
		
		// creamos el bot�n para saludar
		Button saludarButton = new Button();
		saludarButton.setLabel("Saludar");
		saludarButton.setBounds(20, 80, 120, 30);
		// establecemos un listener para la pulsaci�n del bot�n
		saludarButton.addActionListener(e -> saludoLabel.setText("���Hola Mundo!!!")); // mostramos el saludo en la etiqueta
		
		// panel (contenedor) que contiene la etiqueta y el bot�n
		Panel rootPanel = new Panel();
		rootPanel.setLayout(null);
		rootPanel.add(saludoLabel);
		rootPanel.add(saludarButton);
		
		// ventana
		final Frame frame = new Frame();
		frame.setTitle("Hola Mundo con AWT");
		frame.setSize(320, 200);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.add(rootPanel);
		frame.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
			
		});
		
		frame.setVisible(true);
		
	}

}