package modelo;

import javax.swing.JOptionPane;

public class Anual{

	double porcentaje;
	
	public Anual() {}
	
	

	public double getPorcentanje() {
		return porcentaje;
	}

	public void setPorcentanje(double porcentanje) {
		this.porcentaje = porcentanje;
	}
	
	public String toString() {
		
		String text="";
		return text += super.toString()+"Porcentaje sobre el salario: " + getPorcentanje();
	}
	

}
