package modelo;
import modelo.*;
import javax.swing.JOptionPane;
import javax.tools.ToolProvider;

public class Creditos extends Servicios{
	
	Corriente creditoCorriente = new Corriente();
	Vivienda creditoVivienda = new Vivienda();
	Especial creditoEspecial = new Especial ();
	
double montoCredito, cuotaPagar, interes;
int plazo;

public Creditos() { //esta parte hay que distribuirla de forma diferente ya que todos los creditos tienen un monto especifico
	//no se puede crear un ingresar en el constructor de la misma manera que lo hice en Cliente. hay que pensarla haha
	
	
}


public Corriente getCreditoCorriente() {
	return creditoCorriente;
}



public void setCreditoCorriente(Corriente creditoCorriente) {
	this.creditoCorriente = creditoCorriente;
}



public Vivienda getCreditoVivienda() {
	return creditoVivienda;
}



public void setCreditoVivienda(Vivienda creditoVivienda) {
	this.creditoVivienda = creditoVivienda;
}



public Especial getCreditoEspecial() {
	return creditoEspecial;
}



public void setCreditoEspecial(Especial creditoEspecial) {
	this.creditoEspecial = creditoEspecial;
}



public double getMontoCredito() {
	return montoCredito;
}

public void setMontoCredito(double montoCredito) {
	this.montoCredito = montoCredito;
}

public double getCuotaPagar() {
	return cuotaPagar;
}

public void setCuotaPagar(double cuotaPagar) {
	this.cuotaPagar = cuotaPagar;
}

public double getInteres() {
	return interes;
}

public void setInteres(double interes) {
	this.interes = interes;
}

public int getPlazo() {
	return plazo;
}

public void setPlazo(int plazo) {
	this.plazo = plazo;
}




public void escogeTipoCreditoClientefinal(int tipoCredito) {
	int escogeCredito = tipoCredito;
	if(escogeCredito==1) {
		
		String tipoCliente;
		tipoCliente= (JOptionPane.showInputDialog(null, "Selecciona el tipo de Cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Administrativo", "Docente", "Pensionado"}, "Selecciona")).toString() ;
		if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			ingresaAdministrativoCreditoCorriente();
		}else if(tipoCliente.equalsIgnoreCase("Docente")) {
			ingresaDocenteCreditoCorriente();
		}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
			ingresaPensionadoCreditoCorriente();
		}
		
	}
}
public int devuelveTipoCredito() {
	int credito=0;
	String tipoCredito ="";
	tipoCredito = (JOptionPane.showInputDialog(null, "Selecciona el tipo de credito", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Corriente", "Vivienda", "Especial"}, "Selecciona")).toString() ;
	
	if(tipoCredito.equalsIgnoreCase("Corriente")) {
		credito = 1;
	}else if(tipoCredito.equalsIgnoreCase("Vivienda")){
		credito = 2;
	}else if(tipoCredito.equalsIgnoreCase("Especial")) {
		credito = 3;
	}
	return credito;
}



public String muestraAdministrativoCreditoCorriente() {
return	MuestraDatosAdministrativos();
	
	
}

//INGRESA DE LOS TRES TIPOS DE CLIENTES PARA CREDITO CORRIENTE//
public void ingresaAdministrativoCreditoCorriente() {//Le hace falta lo que compete a hipoteca
	
	EstableceDatosAdministrativos();
	setMontoCredito(calculoMontoCreditoAdministrativoCorriente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	setCuotaPagar(calculoCoutaCorriente());
}

public void ingresaDocenteCreditoCorriente() {
	
	EstableceDatosDocente();
	setMontoCredito(calculoMontoCreditoDocenteCorriente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	setCuotaPagar(calculoCoutaCorriente());
}

public void ingresaPensionadoCreditoCorriente() {
	
	EstableceDatosPensionado();
	setMontoCredito(calculoMontoCreditoPensionadoCorriente());
	setInteres(22);
	do {
	setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Plazo(de 24 a 72 maximo)")));
	if(getPlazo()<24||getPlazo()>72) {
		JOptionPane.showMessageDialog(null, "Los plazos van desde los 24 a los 72 meses maximo");
	}
	}while(getPlazo()<24||getPlazo()>72);
	setCuotaPagar(calculoCoutaCorriente());
}

///////////////////////////////////////////////////////////////////////


//Calculo del monto total  del credito CORRIENTE-- ADMINISTRATIVOS 
public double calculoMontoCreditoAdministrativoCorriente() {
	double resultado =0;
	
resultado = clienteAd.getSalario()+(clienteAd.getSalario()*0.90);
return resultado;
	
}

///////////////////////////////////////////////////////////////////////



//Calculo del monto total CORRIENTE-- DOCENTES
public double calculoMontoCreditoDocenteCorriente() {
	double resultado =0;
	
resultado = clienteDo.getSalario()+(clienteDo.getSalario()*0.90);
return resultado;
	
}

///////////////////////////////////////////////////////////////////////


//Calculo del monto total del credito CORRIENTE-- PENSIONADOS 
public double calculoMontoCreditoPensionadoCorriente() {
	double resultado =0;
	
resultado = clientePe.getSalario()+(clientePe.getSalario()*0.90);
return resultado;
	
}
///////////////////////////////////////////////////////////////////////

//CALCULO DE LA CUOTA DEL CREDITO CORRIENTE-FUNCIONA PARA TODOS LOS TIPOS DE CLIENTES EN CREDITO CORRIENTE

public double calculoCoutaCorriente() {
	double resultado =0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100))/getPlazo();
	return resultado;
}





//INGRESA DE LOS DOS TIPOS DE CLIENTES PARA CREDITO ESPECIAL ORDINARIO//


public void ingresaAdministrativoCreditoEspecialOrdinario() {
	EstableceDatosAdministrativos();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(20 000 000 maximo)")));	
		if(getMontoCredito()<0||getMontoCredito()>20000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 0 a 20000000");
		}
	}while(getMontoCredito()<0||getMontoCredito()>20000000);
	setInteres(24);
	setPlazo(72);
	setCuotaPagar(calculoCuotaEspecialOrdinario());
	creditoEspecial.EO.estableceEspecialOrdinario();
}


public void ingresaDocenteCreditoEspecialOrdinario() {
	EstableceDatosDocente();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(20 000 000 maximo)")));	
		if(getMontoCredito()<0||getMontoCredito()>20000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 0 a 20000000");
		}
	}while(getMontoCredito()<0||getMontoCredito()>20000000);
	setInteres(24);
	setPlazo(72);
	setCuotaPagar(calculoCuotaEspecialOrdinario());
	creditoEspecial.EO.estableceEspecialOrdinario();
	
}

///////////////////////////////////////////////////////////////////////



//INGRESA DE LOS DOS TIPOS DE CLIENTES PARA CREDITO ESPECIAL EQUIPOCOMPUTO//
public void ingresaAdministrativoCreditoEquipoComputo() {
	EstableceDatosAdministrativos();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(3600 000 maximo)")));	
		if(getMontoCredito()<0||getMontoCredito()>3600000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 0 a 3600000");
		}
	}while(getMontoCredito()<0||getMontoCredito()>3600000);
	setInteres(12);
	setPlazo(60);
	setCuotaPagar(calculoCuotaEspecialOrdinario());
	creditoEspecial.EC.estableceEquipoComputo();
}



public void ingresaDocenteCreditoEquipoComputo() {
	EstableceDatosDocente();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(3600 000 maximo)")));	
		if(getMontoCredito()<0||getMontoCredito()>3600000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 0 a 3600000");
		}
	}while(getMontoCredito()<0||getMontoCredito()>3600000);
	setInteres(12);
	setPlazo(60);
	setCuotaPagar(calculoCuotaEspecialOrdinario());
	creditoEspecial.EC.estableceEquipoComputo();
}
///////////////////////////////////////////////////////////////////////


//CALCULO DE LA CUOTA DEL CREDITO ESPECIAL--ORNDINARIO Y ECOMPUNTO -- FUNCIONA PARA TODOS LOS TIPOS DE CLIENTES EN CREDITO ESPECIAL
public double calculoCuotaEspecialOrdinario() {
	double resultado =0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100))/getPlazo(); 
	return resultado;
}
///////////////////////////////////////////////////////////////////////


//INGRESA DE LOS TIPOS DE CLIENTES PARA CREDITO VIVIENDA//
public void ingresaAdministrativoCreditoVivienda() {
	EstableceDatosAdministrativos();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(de 20 000 000 a 81 000 000 )")));	
		if(getMontoCredito()<20000000||getMontoCredito()>81000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 20 000 000 a 81 000 000");
		}
	}while(getMontoCredito()<20000000||getMontoCredito()>81000000);
	setInteres(16);
	do {
		setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el plazo(Debe estar entre 144 y 360 meses)")));
			if(getPlazo()<144||getPlazo()>360) {
				JOptionPane.showMessageDialog(null, "El plazo debe estar entre 144 y 360 meses");
			}
	}while(getPlazo()<144||getPlazo()>360);
	setCuotaPagar(calculoCuotaVivienda());
	creditoVivienda.estableceVivienda();
}


public void ingresaDocenteCreditoVivienda() {
	EstableceDatosDocente();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(de 20 000 000 a 81 000 000 )")));	
		if(getMontoCredito()<20000000||getMontoCredito()>81000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 20 000 000 a 81 000 000");
		}
	}while(getMontoCredito()<20000000||getMontoCredito()>81000000);
	setInteres(16);
	do {
		setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el plazo(Debe estar entre 144 y 360 meses)")));
			if(getPlazo()<144||getPlazo()>360) {
				JOptionPane.showMessageDialog(null, "El plazo debe estar entre 144 y 360 meses");
			}
	}while(getPlazo()<144||getPlazo()>360);
	setCuotaPagar(calculoCuotaVivienda());
	creditoVivienda.estableceVivienda();
}


public void ingresaPensionadoCreditoVivienda() {
	EstableceDatosPensionado();
	do {
		setMontoCredito(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto del credito(de 20 000 000 a 81 000 000 ) para ")));	
		if(getMontoCredito()<20000000||getMontoCredito()>81000000) {
			JOptionPane.showMessageDialog(null, "El monto debe ir de 20 000 000 a 81 000 000");
		}
	}while(getMontoCredito()<20000000||getMontoCredito()>81000000);
	setInteres(16);
	do {
		setPlazo(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el plazo(Debe estar entre 144 y 360 meses)")));
			if(getPlazo()<144||getPlazo()>360) {
				JOptionPane.showMessageDialog(null, "El plazo debe estar entre 144 y 360 meses");
			}
	}while(getPlazo()<144||getPlazo()>360);
	setCuotaPagar(calculoCuotaVivienda());
	creditoVivienda.estableceVivienda();
}
public double calculoCuotaVivienda() {
	double resultado=0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100)+(getMontoCredito()*10/100))/getPlazo();
	return resultado;
}
//**********************************************************************













@Override
public String toString() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public String Total() {
	// TODO Auto-generated method stub
	return null;
}


@Override
public void Ingresar() {
	// TODO Auto-generated method stub
	
}


@Override
public String Muestra() {
	// TODO Auto-generated method stub
	return muestraAdministrativoCreditoCorriente();
}





}
