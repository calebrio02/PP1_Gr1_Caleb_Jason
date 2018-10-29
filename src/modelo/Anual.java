package modelo;

import javax.swing.JOptionPane;

public class Anual {

	double porcentajeCliente;
	
	public Anual() {}

public double getPorcentajeCliente() {
		return porcentajeCliente;
	}

public void setPorcentajeCliente(double porcentajeCliente) {
		this.porcentajeCliente = porcentajeCliente;
	}
public void IngresarAnual() {
	setPorcentajeCliente(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje que desea rebajar de su salario")));
}
	
}
