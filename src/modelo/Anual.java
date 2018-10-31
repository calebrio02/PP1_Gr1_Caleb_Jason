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
	TipoClienteAnual();
	setPorcentajeCliente(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el porcentaje que desea rebajar de su salario")));
}
public void TipoClienteAnual() {
	
	String tipoCliente="";
	do {
		
		tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
		
		if(tipoCliente.equalsIgnoreCase("Docente")) {
			EstableceDatosDocente();	
			
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			EstableceDatosPensionado();

			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			EstableceDatosAdministrativos();

			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoCliente=="Selecciona"||tipoCliente==null);
	
	
}

public double CalculoAnualDocente() {
	double cuota=0;
	cuota=(clienteDo.getSalario()*getPorcentajeCliente());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}

public double CalculoAnualPensionado() {
	double cuota=0;
	cuota=(clientePe.getSalario()*getPorcentajeCliente());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();
}

public double CalculoAnualAdministrativo() {
	double cuota=0;
	cuota=(clienteAd.getSalario()*getPorcentajeCliente());
	cuota=cuota*getMesesCancelados();
	setSaldo(cuota);
	return getSaldo();														//
}


public String MuestraDocenteAnual() {
	String Muestra="";
	
	Muestra+=clienteDo.RespuestaDocente() +"Tipo de plan de ahorro: Anual\n"
			+ "Porcentaj e sobre salario: "+getPorcentajeCliente()+"%\n"
					+ "Meses de ahorro: "+getMesesCancelados()+"\n"
							+ "Total de ahorro: $"+CalculoAnualDocente()+"\n\n";
	
	return Muestra;
}

public String MuestraPensionadoAnual() {
	String Muestra="";
	
	Muestra+=clientePe.RespuestaPensionado()+"Tipo de plan de ahorro: Anual\n"
			+ "Porcentaje sobre salario: "+getPorcentajeCliente()+"%\n"
					+ "Meses de ahorro: "+getMesesCancelados()+"\n"
							+ "Total de ahorro: $"+CalculoAnualPensionado()+"\n\n";
	
	return Muestra;
}

public String MuestraAdministrativoAnual() {
	String Muestra="";
	
	Muestra+=clienteAd.RespuestaAdministrativos()+"Tipo de plan de ahorro: Anual\n"
			+ "Porcentaje sobre salario: "+getPorcentajeCliente()+"%\n"
					+ "Meses de ahorro: "+getMesesCancelados()+"\n"
							+ "Total de ahorro: $"+CalculoAnualAdministrativo()+"\n\n";
	
	return Muestra;
}
@Override
public String Muestra() {
	// TODO Auto-generated method stub
	return null;
}
public void Ingresar() {
	// TODO Auto-generated method stub
}
public String SoloDNI() {
	// TODO Auto-generated method stub
	return null;
}
}