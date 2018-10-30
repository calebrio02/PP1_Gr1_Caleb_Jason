package modelo;

import javax.swing.JOptionPane;

public class Pensionados extends Clientes{

	int anosjubilado;
	String tipoPensionado;
	
public Pensionados() {}
	
public void IngresaPensionado() {
	
	ingresarCliente();
	setAnosjubilado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos jubilado (a) de " + getNombre())));
	

}

public int getAnosjubilado() {
		return anosjubilado;
	}

public void setAnosjubilado(int anosjubilado) {
		this.anosjubilado = anosjubilado;
	}
public String getTipoEmpleado() {
		return tipoPensionado;
	}
public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoPensionado = tipoEmpleado;
	}
	
	
	
public String RespuestaPensionado() {
	String Respuesta="";
	
	Respuesta+=RespuestaCliente()+"Tipo de Cliente: Pensionado\n"
	+"Anos jubilado: "+getAnosjubilado()+"\n"
			+ "Area en la que se desempenaba: "+getTipoEmpleado()+"\n\n";
	
	return Respuesta;
}
public void RespuestaPensioando() {
	
	JOptionPane.showMessageDialog(null, RespuestaPensionado());
}
}
