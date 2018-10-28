package modelo;

public class PlanesAhorro {
double saldo, cuotaAhorro;
int mesesCancelados;
Clientes c;
public PlanesAhorro() {

	
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public double getCuotaAhorro() {
	return cuotaAhorro;
}

public void setCuotaAhorro(double cuotaAhorro) {
	this.cuotaAhorro = cuotaAhorro;
}

public int getMesesCancelados() {
	return mesesCancelados;
}

public void setMesesCancelados(int mesesCancelados) {
	this.mesesCancelados = mesesCancelados;
}



public String toString() {
	
	String text;
	return text = "Saldo: " + getSaldo() + "\n"
				+"Cuota de ahorro: " + getCuotaAhorro() + "\n"
				+"Meses Cancelados: " + getMesesCancelados() + "\n";
}
}
