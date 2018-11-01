package modelo;

import javax.swing.JOptionPane;

public class Pensionados extends Clientes{

	int anosjubilado;
	String tipoPensionado;
	
public Pensionados() {}
	
public void IngresaPensionado() {
	int cambio=0;
	ingresarCliente();
	String anterior = (JOptionPane.showInputDialog(null, "Selecciona el area en la que se desempeñaba", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Docente", "Administrativo"}, "Selecciona")).toString() ;
	
	if(anterior.equalsIgnoreCase("Docente")) {
		setTipoEmpleado("Docente");
		
	}else if(anterior.equalsIgnoreCase("Administrativo")) {
		setTipoEmpleado("Administrativo");
	}
	do {
		try {
			setAnosjubilado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de años jubilado (a) de " + getNombre())));
			cambio=1;
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingresa solo numeros");
			cambio=0;
		}
	} while (cambio==0);

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
			+ "Area en la que se desempeñaba: "+getTipoEmpleado()+"\n\n";
	
	return Respuesta;
}
public void RespuestaPensioando() {
	
	JOptionPane.showMessageDialog(null, RespuestaPensionado());
}
}
