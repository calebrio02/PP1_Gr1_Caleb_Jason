package modelo;

import javax.swing.JOptionPane;

public class PlanesAhorro extends Servicios{
	
	Anual Anual = new Anual();
	ALaVista ALaVista = new ALaVista();
	
	double saldo;
	int mesesCancelados;	
	
	
public PlanesAhorro() {}


public void ingresarMesesCancelados() {
	setMesesCancelados(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de meses cancelados")));
}

public void SeleccionarPlanAhorro() {
	String tipoAhorro="";
	do {
		
		tipoAhorro = (JOptionPane.showInputDialog(null, "Selecciona el Plan de Ahorro", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Anual", "A la vista"}, "Selecciona")).toString() ;
		
		if(tipoAhorro.equalsIgnoreCase("Anual")) {
			TipoClienteAnual();

		}else if(tipoAhorro.equalsIgnoreCase("A la vista")) {
			TipoClienteALaVista();

			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoAhorro=="Selecciona"||tipoAhorro==null);
	
}

public void TipoClienteAnual() {
	
	
	String tipoCliente="";
	do {
		
		tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
		
		if(tipoCliente.equalsIgnoreCase("Docente")) {
			EstableceDatosDocente();
			Anual.IngresarAnual();
			ingresarMesesCancelados();
			CalculoAnualDocente();
			
			
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			EstableceDatosPensionado();
			Anual.IngresarAnual();
			ingresarMesesCancelados();
			CalculoAnualPensionado();
			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			EstableceDatosAdministrativos();
			Anual.IngresarAnual();
			ingresarMesesCancelados();
			CalculoAnualAdministrativo();
			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoCliente=="Selecciona"||tipoCliente==null);
	
	
}

public void TipoClienteALaVista() {
	
	
	String tipoCliente="";
	do {
		
		tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
		
		if(tipoCliente.equalsIgnoreCase("Docente")) {
			EstableceDatosDocente();
			ingresarMesesCancelados();
			CalculoALavistaDocente();
			
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			EstableceDatosPensionado();
			ingresarMesesCancelados();
			CalculoALavistaPensionado();
			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			EstableceDatosAdministrativos();
			ingresarMesesCancelados();
			CalculoALavistaAdministrativo();
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoCliente=="Selecciona"||tipoCliente==null);
	
	
}






//////calculos anuales de cada tipo de clieente///////////////////////////
public double CalculoAnualDocente() {
	double cuota=0;
	cuota=(clienteDo.getSalario()*Anual.getPorcentajeCliente());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}

public double CalculoAnualPensionado() {
	double cuota=0;
	cuota=(clientePe.getSalario()*Anual.getPorcentajeCliente());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}

public double CalculoAnualAdministrativo() {
	double cuota=0;
	cuota=(clienteAd.getSalario()*Anual.getPorcentajeCliente());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();														//
}																			//
//////////////////////////////////////////////////////////////////////////////




////// calculos a la vista de cliente///////////////////////////////////////////
public double CalculoALavistaDocente() {
	double cuota=0;
	cuota=(clienteDo.getSalario()*ALaVista.getPorcentajeCliente())+(clienteDo.getSalario()*ALaVista.getPorcentajePatrono());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}

public double CalculoALavistaPensionado() {
	double cuota=0;
	cuota=(clienteDo.getSalario()*ALaVista.getPorcentajeCliente())+(clienteDo.getSalario()*ALaVista.getPorcentajePatrono());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}

public double CalculoALavistaAdministrativo() {
	double cuota=0;
	cuota=(clienteDo.getSalario()*ALaVista.getPorcentajeCliente())+(clienteDo.getSalario()*ALaVista.getPorcentajePatrono());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}																			///
																			///
////////////////////////////////////////////////////////////////////////////////
public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
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
