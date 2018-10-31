package modelo;

import javax.swing.JOptionPane;

public class EspecialOrdinario extends Especial {
int anoIngresoLabores;
String puestoEspecifico;

public EspecialOrdinario() {
	
}

public int getAnoIngresoLabores() {
	return anoIngresoLabores;
}

public void setAnoIngresoLabores(int anoIngresoLabores) {
	this.anoIngresoLabores = anoIngresoLabores;
}

public String getPuestoEspecifico() {
	return puestoEspecifico;
}

public void setPuestoEspecifico(String puestoEspecifico) {
	this.puestoEspecifico = puestoEspecifico;
}


public void estableceEspecialOrdinario() {  //Corregir ano y desempena haha 
	setAnoIngresoLabores(Integer.parseInt(JOptionPane.showInputDialog("Indique el ano de ingreso a laboral")));
	setPuestoEspecifico("Escriba el nombre del puesto especifico que desempena");
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
	estableceEspecialOrdinario();
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
	estableceEspecialOrdinario();
	
}

//CALCULO DE LA CUOTA DEL CREDITO ESPECIAL--ORNDINARIO Y ECOMPUNTO -- FUNCIONA PARA TODOS LOS TIPOS DE CLIENTES EN CREDITO ESPECIAL
public double calculoCuotaEspecialOrdinario() {
	double resultado =0;
	resultado = (getMontoCredito()+(getMontoCredito()*getInteres()/100))/getPlazo(); 
	return resultado;
}
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
