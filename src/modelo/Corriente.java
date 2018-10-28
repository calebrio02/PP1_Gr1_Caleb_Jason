package modelo;

public class Corriente extends Creditos {
double montoPCredito, hipoteca;
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

public Corriente() {
	
}

public double getMontoPCredito() {
	return montoPCredito;
}

public void setMontoPCredito(double montoPCredito) {
	this.montoPCredito = montoPCredito;
}

public double getHipoteca() {
	return hipoteca;
}

public void setHipoteca(double hipoteca) {
	this.hipoteca = hipoteca;
}


}
