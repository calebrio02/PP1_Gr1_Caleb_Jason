package modelo;

import javax.swing.JOptionPane;

public class ALaVista{

	double porcentajeCliente, porcentajePatrono;
	
	public ALaVista() {}
	
	
public void IngresarALaVista() {
	
	setPorcentajeCliente(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el porcentaje  sobre salario de ")));
	setPorcentajePatrono(Double.parseDouble(JOptionPane.showInputDialog("Ingresa el porcentaje del patrono sobre salario de ")));
	
}
	public double getPorcentajeCliente() {
		return porcentajeCliente;
	}

	public void setPorcentajeCliente(double porcentajeCliente) {
		this.porcentajeCliente = porcentajeCliente;
	}

	public double getPorcentajePatrono() {
		return porcentajePatrono;
	}

	public void setPorcentajePatrono(double porcentajePatrono) {
		this.porcentajePatrono = porcentajePatrono;
	}
	
	
public String toString() {
		
		String text="";
		return text += super.toString()+"Porcentaje del Cliente sobre el salario: " + getPorcentajeCliente() + "\n" 
					+ "Porcentaje del Patrono sobre el salario: " + getPorcentajePatrono();
	}
	
}
