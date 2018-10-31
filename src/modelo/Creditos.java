package modelo;
import modelo.*;
import javax.swing.JOptionPane;
import javax.tools.ToolProvider;

public class Creditos extends Servicios{
	

	
double montoCredito, cuotaPagar, interes;
int plazo;

public Creditos() { //esta parte hay que distribuirla de forma diferente ya que todos los creditos tienen un monto especifico
	//no se puede crear un ingresar en el constructor de la misma manera que lo hice en Cliente. hay que pensarla haha
	
	
}




public double getMontoCredito() {
	return montoCredito;
}

public void setMontoCredito(double montoCredito) {
	this.montoCredito = montoCredito;
}

public double getCuotaPagar() {
	return cuotaPagar;
}

public void setCuotaPagar(double cuotaPagar) {
	this.cuotaPagar = cuotaPagar;
}

public double getInteres() {
	return interes;
}

public void setInteres(double interes) {
	this.interes = interes;
}

public int getPlazo() {
	return plazo;
}

public void setPlazo(int plazo) {
	this.plazo = plazo;
}






@Override
public String toString() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public String SoloDNI() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void Ingresar() {
	// TODO Auto-generated method stub
	
}


@Override
public String Muestra() {
	// TODO Auto-generated method stub
	return null;
}





}
