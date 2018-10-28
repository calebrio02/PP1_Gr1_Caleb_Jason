package modelo;

public class Vivienda extends Creditos {
String direccionPropiedad;
double tamano, peritaje;
Administrativos Ad;
Docentes Do;
Pensionados Pe;

public void ingresarAd(){
	Administrativos ad = new Administrativos();
}

public void ingresarDo() {
	Docentes Do = new Docentes();
}

public void ingresarPe() {
	Pensionados Pe = new Pensionados();
}

public Vivienda() {
		
}

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


}
