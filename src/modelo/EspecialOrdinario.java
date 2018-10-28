package modelo;

public class EspecialOrdinario extends Especial{
int anoIngresoLabores;
String puestoEspecifico;
Administrativos Ad;
Docentes Do;


public void ingresarAd(){
	Administrativos ad = new Administrativos();
}

public void ingresarDo() {
	Docentes Do = new Docentes();
}
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


}
