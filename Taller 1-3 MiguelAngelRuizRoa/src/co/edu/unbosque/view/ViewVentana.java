package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class ViewVentana {
	
	public void showmessage( String mensaje, String tipo) {
		if(tipo.equals("informativo"))  {
			JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
		}else if(tipo.equals("error")) {
			JOptionPane.showMessageDialog(null, mensaje, "error", JOptionPane.ERROR_MESSAGE);
		}else if(tipo.equals("Alerta")) {
			JOptionPane.showMessageDialog(null, mensaje, "Alerta", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public int leerDato(String mensaje) {
		String aux = JOptionPane.showInputDialog(null,mensaje,"Ingreso de dato",JOptionPane.QUESTION_MESSAGE);
		int dato = Integer.parseInt(aux);
		return dato;
	}
}
