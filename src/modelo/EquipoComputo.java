package modelo;

import javax.swing.JOptionPane;

public class EquipoComputo {
String dispositivo, comercio;

public EquipoComputo() {
	
}

public String getDispositivo() {
	return dispositivo;
}

public void setDispositivo(String dispositivo) {
	this.dispositivo = dispositivo;
}

public String getComercio() {
	return comercio;
}

public void setComercio(String comercio) {
	this.comercio = comercio;
}

public void estableceEquipoComputo() {
	setDispositivo(JOptionPane.showInputDialog("Ingrese el nombre del dispositivo a adquirir"));
	setComercio("Ingrese el nombre del comercio donde lo comprara");
}
}
