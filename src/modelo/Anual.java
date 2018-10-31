package modelo;

import javax.swing.JOptionPane;

public class Anual extends PlanesAhorro{

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
@Override
public String Muestra() {
	// TODO Auto-generated method stub
	return null;
}
public void Ingresar() {
	// TODO Auto-generated method stub
}
}