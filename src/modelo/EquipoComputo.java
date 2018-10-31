package modelo;

import javax.swing.JOptionPane;

public class EquipoComputo extends Creditos{
String dispositivo, comercio;

public EquipoComputo() {
	
}

public String getDispositivo() {
	return dispositivo;
}

public void setDispositivo(String dispositivo) {
	this.dispositivo = dispositivo;
}

public String getComercio() {
	return comercio;
}

public void setComercio(String comercio) {
	this.comercio = comercio;
}

public void estableceEquipoComputo() {
	setDispositivo(JOptionPane.showInputDialog("Ingrese el nombre del dispositivo a adquirir"));
	setComercio("Ingrese el nombre del comercio donde lo comprara");
}




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
	estableceEquipoComputo();
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
	estableceEquipoComputo();
}

//CALCULO DE LA CUOTA DEL CREDITO ESPECIAL--ORNDINARIO Y ECOMPUNTO -- FUNCIONA PARA TODOS LOS TIPOS DE CLIENTES EN CREDITO ESPECIAL
public double calculoCuotaEspecialOrdinario() {
	double resultado =0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100))/getPlazo(); 
	return resultado;
}
///////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////

@Override
public String SoloDNI() {
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
	return null;
}
}