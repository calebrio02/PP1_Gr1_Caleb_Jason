package modelo;

import javax.swing.JOptionPane;

public class Anual extends PlanesAhorro{

	double porcentaje;
	
	public Anual() {}
	
	
public void IngresarAnual() {
	
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
	
	setPorcentanje(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje que desea ahorrar de su salario")));
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
