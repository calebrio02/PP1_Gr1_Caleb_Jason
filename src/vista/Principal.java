package vista;
import javax.swing.JOptionPane;

import controlador.ArrayObjetos;
import modelo.*;


public class Principal {

	public static void main(String[] args) {
		
		//ArrayObjetos objeto = new ArrayObjetos();
		Corriente c = new Corriente();
		Vivienda v = new Vivienda();
		EspecialOrdinario eo = new EspecialOrdinario();
		EquipoComputo ec = new EquipoComputo();
		Anual a = new Anual();
		ALaVista av = new ALaVista();
		
		
		v.Ingresar();
		JOptionPane.showMessageDialog(null,v.Muestra());
	}
}
