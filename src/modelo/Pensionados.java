package modelo;

import javax.swing.JOptionPane;

public class Pensionados extends Clientes{

	int anosjubilado;
	String tipoPensionado;
	
public Pensionados() {}
	
public void IngresaPensionado() {
	
	ingresarCliente();
	String anterior = (JOptionPane.showInputDialog(null, "Selecciona el area en la que se desempenaba", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Docente", "Administrativo"}, "Selecciona")).toString() ;
	
	if(anterior.equalsIgnoreCase("Docente")) {
		setTipoEmpleado("Docente");
		
	}else if(anterior.equalsIgnoreCase("Administrativo")) {
		setTipoEmpleado("Administrativo");
	}
	
	setAnosjubilado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de años jubilado (a) de " + getNombre())));

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
	+"Años jubilado: "+getAnosjubilado()+"\n"
			+ "Area en la que se desempenaba: "+getTipoEmpleado()+"\n\n";
	
	return Respuesta;
}
public void RespuestaPensioando() {
	
	JOptionPane.showMessageDialog(null, RespuestaPensionado());
}
}
