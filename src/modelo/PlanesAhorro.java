package modelo;

import javax.swing.JOptionPane;

public class PlanesAhorro extends Servicios{
	
	Anual Anual = new Anual();
	ALaVista ALaVista = new ALaVista();
	
	double saldo;
	int mesesCancelados;	
	String Muestra;
	
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
			setMuestra(MuestraDocenteAnual());
			
			
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			EstableceDatosPensionado();
			Anual.IngresarAnual();
			ingresarMesesCancelados();
			setMuestra(MuestraPensionadoAnual());
			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			EstableceDatosAdministrativos();
			Anual.IngresarAnual();
			ingresarMesesCancelados();
			setMuestra(MuestraAdministrativoAnual());
			
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
			setMuestra(MuestraDocenteALaVista());
			
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			EstableceDatosPensionado();
			ingresarMesesCancelados();
			setMuestra(MuestraPensionadoALaVista());
			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			EstableceDatosAdministrativos();
			ingresarMesesCancelados();
			setMuestra(MuestraAdministrativoALaVista());
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

public String MuestraDocenteAnual() {
	String Muestra="";
	
	Muestra+=clienteDo.RespuestaDocente() +"Tipo de plan de ahorro: Anual\n"
			+ "Porcentaje sobre salario: "+Anual.getPorcentajeCliente()+"%\n"
					+ "Meses de ahorro: "+getMesesCancelados()+"\n"
							+ "Total de ahorro: $"+CalculoAnualDocente()+"\n\n";
	
	return Muestra;
}

public String MuestraPensionadoAnual() {
	String Muestra="";
	
	Muestra+=clientePe.RespuestaPensionado()+"Tipo de plan de ahorro: Anual\n"
			+ "Porcentaje sobre salario: "+Anual.getPorcentajeCliente()+"%\n"
					+ "Meses de ahorro: "+getMesesCancelados()+"\n"
							+ "Total de ahorro: $"+CalculoAnualPensionado()+"\n\n";
	
	return Muestra;
}

public String MuestraAdministrativoAnual() {
	String Muestra="";
	
	Muestra+=clienteAd.RespuestaAdministrativos()+"Tipo de plan de ahorro: Anual\n"
			+ "Porcentaje sobre salario: "+Anual.getPorcentajeCliente()+"%\n"
					+ "Meses de ahorro: "+getMesesCancelados()+"\n"
							+ "Total de ahorro: $"+CalculoAnualAdministrativo()+"\n\n";
	
	return Muestra;
}

public String MuestraDocenteALaVista() {
	
	String muestra="";
	
	muestra+=clienteDo.RespuestaDocente()+"Tipo de plan de ahorro: A la Vista\n"
			+ "Meses de ahorro: "+getMesesCancelados()+"\n"
					+ "Total de ahorros: "+CalculoALavistaDocente();
	return muestra;
}

public String MuestraPensionadoALaVista() {
	
	String muestra="";
	
	muestra+=clientePe.RespuestaPensionado()+"Tipo de plan de ahorro: A la Vista\n"
			+ "Meses de ahorro: "+getMesesCancelados()+"\n"
					+ "Total de ahorros: "+CalculoALavistaPensionado();
	return muestra;
}

public String MuestraAdministrativoALaVista() {
	
	String muestra="";
	
	muestra+=clienteAd.RespuestaAdministrativos()+"Tipo de plan de ahorro: A la Vista\n"
			+ "Meses de ahorro: "+getMesesCancelados()+"\n"
					+ "Total de ahorros: "+CalculoALavistaAdministrativo();
	return muestra;
}

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

public Anual getAnual() {
	return Anual;
}


public void setAnual(Anual anual) {
	Anual = anual;
}


public ALaVista getALaVista() {
	return ALaVista;
}


public void setALaVista(ALaVista aLaVista) {
	ALaVista = aLaVista;
}


public String getMuestra() {
	return Muestra;
}


public void setMuestra(String muestra) {
	Muestra = muestra;
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
	return getMuestra();
}

}
