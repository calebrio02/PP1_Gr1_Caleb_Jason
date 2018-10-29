package modelo;

import javax.swing.JOptionPane;

public class PlanesAhorro extends Servicios{
	
	Anual Anual = new Anual();
	ALaVista ALaVista = new ALaVista();
	double saldo;
	double cuotaAhorro;
	int mesesCancelados;	
	
	
public PlanesAhorro() {}

/*
public void ingresarPlanAhorro() {
	setMesesCancelados(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses cancelados")));
	
}
public void SeleccionarPlanAhorro() {
	String tipoAhorro="";
	do {
		
		tipoAhorro = (JOptionPane.showInputDialog(null, "Selecciona el Plan de Ahorro", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Anual", "A la vista"}, "Selecciona")).toString() ;
		
		if(tipoAhorro.equalsIgnoreCase("Anual")) {
			ingresaTipoCliente();
			Anual.setPorcentanje(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje de " + escogeCliente().c
		}else if(tipoAhorro.equalsIgnoreCase("A la vista")) {
			ingresaTipoCliente();
			ALaVista.IngresarALaVista();
			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoAhorro=="Selecciona"||tipoAhorro==null);
	
}
public void ingresaTipoCliente() {
	
	
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
	
	
}

*/
public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public double getCuotaAhorro() {
	return cuotaAhorro;
}

public void setCuotaAhorro(double cuotaAhorro) {
	this.cuotaAhorro = cuotaAhorro;
}

public int getMesesCancelados() {
	return mesesCancelados;
}

public void setMesesCancelados(int mesesCancelados) {
	this.mesesCancelados = mesesCancelados;
}

public String Total() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void Ingresar() {
	// TODO Auto-generated method stub
	
}

@Override
public String SoloNombre() {
	// TODO Auto-generated method stub
	return null;
}

}
