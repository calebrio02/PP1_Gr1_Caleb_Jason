package modelo;

import javax.swing.JOptionPane;

public class Vivienda  {
String direccionPropiedad;
double tamano, peritaje;



public String getDireccionPropiedad() {
	return direccionPropiedad;
}

public void setDireccionPropiedad(String direccionPropiedad) {
	this.direccionPropiedad = direccionPropiedad;
}

public double getTamano() {
	return tamano;
}

public void setTamano(double tamano) {
	this.tamano = tamano;
}

public double getPeritaje() {
	return peritaje;
}

public void setPeritaje(double peritaje) {
	this.peritaje = peritaje;
}

public void estableceVivienda() {
	
setDireccionPropiedad(JOptionPane.showInputDialog("Ingrese la direccion de la propiedad"));
setTamano(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tamano de la propiedad en mts cuadrados")));
setPeritaje(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de peritaje de la propiedad")));
}

}
