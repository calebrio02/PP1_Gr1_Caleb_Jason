package vista;
import javax.swing.JOptionPane;

import controlador.ArrayObjetos;
import modelo.Administrativos;
import modelo.Anual;
import modelo.Docentes;
import modelo.Pensionados;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Administrativos a = new Administrativos();
		JOptionPane.showMessageDialog(null,a.toString());
		
		
		Docentes b= new Docentes();
		JOptionPane.showMessageDialog(null,b.toString());
		
		
		Pensionados j = new Pensionados();
		JOptionPane.showMessageDialog(null,j.toString());
		*/
		Anual A = new Anual();
		A.IngresarAnual();
	}
	
	
}
