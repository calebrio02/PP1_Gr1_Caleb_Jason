package modelo;

import javax.swing.JOptionPane;

public class EspecialOrdinario {
int anoIngresoLabores;
String puestoEspecifico;

public EspecialOrdinario() {
	
}

public int getAnoIngresoLabores() {
	return anoIngresoLabores;
}

public void setAnoIngresoLabores(int anoIngresoLabores) {
	this.anoIngresoLabores = anoIngresoLabores;
}

public String getPuestoEspecifico() {
	return puestoEspecifico;
}

public void setPuestoEspecifico(String puestoEspecifico) {
	this.puestoEspecifico = puestoEspecifico;
}


public void estableceEspecialOrdinario() {  //Corregir ano y desempena haha 
	setAnoIngresoLabores(Integer.parseInt(JOptionPane.showInputDialog("Indique el ano de ingreso a laboral")));
	setPuestoEspecifico("Escriba el nombre del puesto especifico que desempena");
}
}
