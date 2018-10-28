package modelo;

import javax.swing.JOptionPane;

public class Anual extends PlanesAhorro{

	double porcentaje;
	
	public Anual() {
		
	setPorcentanje(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el porcentaje de + " + c.getNombre() + " sobre su salario" )));
	
	}
public void ingresarAnual() {
	
}
	public double getPorcentanje() {
		return porcentaje;
	}

	public void setPorcentanje(double porcentanje) {
		this.porcentaje = porcentanje;
	}
	
	public String toString() {
		
		String text="";
		return text += "Porcentaje sobre el salario: " + getPorcentanje();
	}
	

}
