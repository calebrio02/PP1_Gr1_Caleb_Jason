package modelo;

import javax.swing.JOptionPane;

public class Docentes extends Clientes {
String categoria, estado, lugartrabajo; // Categoria --> prof. Adjunto, asociado, catedratico. estado--> interino, propiedad

public Docentes() {}

public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public String getLugartrabajo() {
	return lugartrabajo;
}
public void setLugartrabajo(String lugartrabajo) {
	this.lugartrabajo = lugartrabajo;
}

public void IngresaDocente () {
	
	ingresarCliente();
	
	escogeCategoria();
	
	escogeEstado();
	
	setLugartrabajo(JOptionPane.showInputDialog("Ingresa el lugar de trabajo de " + getNombre()));
	
}

public void escogeCategoria() {   //Metodos para evitar que el usuario escriba,ya que se le es mas facil escoger por medio del numero, 
	//a nivel del programa es mas facil evitar que ocurran errores
	String tipoDocente="";
	do {
		
		tipoDocente = (JOptionPane.showInputDialog(null, "Selecciona la categoria de docente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Adjunto", "Asociado", "Catedratico"}, "Selecciona")).toString() ;
		
		if(tipoDocente.equalsIgnoreCase("Adjunto")) {
			setCategoria("Adjunto");
			
		}else if(tipoDocente.equalsIgnoreCase("Asociado")) {
			setCategoria("Asociado");
			
		}else if(tipoDocente.equalsIgnoreCase("Catedratico")) {
			setCategoria("Catedratico");
			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoDocente=="Selecciona"||tipoDocente==null);
	

}

public void escogeEstado() {//Metodos para evitar que el usuario escriba,ya que se le es mas facil escoger por medio del numero, 
	//a nivel del programa es mas facil evitar que ocurran errores
	String estadoDocente="";
	do {
		
		estadoDocente = (JOptionPane.showInputDialog(null, "Selecciona el estado del docente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Propiedad", "Interino"}, "Selecciona")).toString() ;
		
		if(estadoDocente.equalsIgnoreCase("Propiedad")) {
			setEstado("Propiedad");
			
		}else if(estadoDocente.equalsIgnoreCase("Interino")) {
			setEstado("Interino");
			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (estadoDocente=="Selecciona"||estadoDocente==null);
		
}

public String toString() { //Caleb es asi que se  implementa el metodo toString ?
	String text="";
	return text+= super.toString() + "Categoria: " + getCategoria() + "\n"+ "Estado: " + getEstado() + "\n" + "Lugar de trabajo: " + getLugartrabajo();
}


}
