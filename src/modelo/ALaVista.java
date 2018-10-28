package modelo;

import javax.swing.JOptionPane;

public class ALaVista extends PlanesAhorro{

	double porcentajeCliente, porcentajePatrono;
	
	public ALaVista() {}
	
	
public void IngresarALaVista() {
	
	String tipoCliente="";
	do {
		
		tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
		
		if(tipoCliente.equalsIgnoreCase("Docente")) {
			Clientes.Docentes.IngresaDocente();
			
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			Clientes.Pensionados.IngresaPensionado();
			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			Clientes.Administrativos.ingresarAdministrativos();
			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoCliente=="Selecciona"||tipoCliente==null);
	
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
