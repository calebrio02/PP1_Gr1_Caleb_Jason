package modelo;

import javax.swing.JOptionPane;

public class EspecialOrdinario extends Especial {
int anoIngresoLabores;
String puestoEspecifico, TipoCliente;

public EspecialOrdinario() {	
}
public String getTipoCliente() {
	return TipoCliente;
}
public void setTipoCliente(String tipoCliente) {
	TipoCliente = tipoCliente;
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

public void TipoCliente() {//METOD PARA SELECCIONAR EL TIPO DE CLIENTE ESPECIFICO
	
	String tipoCliente="";
	do {
		
		tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
		
		if(tipoCliente.equalsIgnoreCase("Docente")) {
			ingresaDocente();
			setTipoCliente("Docente");
			
		}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			ingresaAdministrativo();
			setTipoCliente("Administrativo");
		}else{
			
			JOptionPane.showMessageDialog(null,"Escoge una de las dos opciones");
		}
	} while (tipoCliente=="Selecciona"||tipoCliente==null);	
}
//INGRESA DE LOS DOS TIPOS DE CLIENTES PARA CREDITO ESPECIAL ORDINARIO//


public void ingresaAdministrativo() {
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


public void ingresaDocente() {
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



public String MuestraDocente() {//MUESTRA ESPECIFICO DE CLIENTE DOCENTE
	String Muestra="";
	
	Muestra+=clienteDo.RespuestaDocente() +"Tipo de credito especial: Ordinario\n"
			+ "Monto solicitado: $"+getMontoCredito()+"\n"
				+ "Puesto especifico: "+getPuestoEspecifico()+"\n"
					+ "Ano de ingreso a labores: "+getAnoIngresoLabores()+"\n"
						+ "Plazo fijo: "+getPlazo()+"	Interes fijo: "+getInteres()+"%\n"
							+ "Cuota a pagar: ¢"+getCuotaPagar()+"\n\n";
	
	return Muestra;
}

public String MuestraAdministrativo() {// MUESTRA ESPECIFICO DE CLIENTE  ADMINISTRATIVO
	
	String Muestra="";
	
	Muestra+=clienteAd.RespuestaAdministrativos() +"Tipo de credito especial: Ordniario\n"
			+ "Monto solicitado: $"+getMontoCredito()+"\n"
			+ "Puesto especifico: "+getPuestoEspecifico()+"\n"
				+ "Ano de ingreso a labores: "+getAnoIngresoLabores()+"\n"
					+ "Plazo fijo: "+getPlazo()+"	Interes fijo: "+getInteres()+"%\n"
						+ "Cuota a pagar: ¢"+getCuotaPagar()+"\n\n";
	
	return Muestra;
	
}//FIN DE MUESTRAS ESPECIFICOS


////////////MUESTRAS GENERICOS/////////////////////////////////
public String MuestraCualquiera() {//PARA MOSTRAR CUALQUIER TIPO DE CLIENTE
String Muestra="";

if(getTipoCliente().equals("Docente")) {//SI ES DOCENTE
Muestra=MuestraDocente();//SE MUESTRAN SOLO LOS DATOS DE DOCENTE
}else if(getTipoCliente().equalsIgnoreCase("Administrativo")) {//SI ES ADMINISTRATIVO
Muestra=MuestraAdministrativo();//SE MUESTRAN SOLO LOS DATOS DE ADMINISTRATIVO
}

return Muestra;
}

public String MuestraSoloDNI() {//PARA MOSTRAR CUALQUIER DNI
String Muestra="";

if(getTipoCliente().equals("Docente")) {
Muestra=clienteDo.getDni();
}else if(getTipoCliente().equalsIgnoreCase("Administrativo")) {
Muestra=clienteAd.getDni();
}
return Muestra;
}//FIN DE MUESTRAS GENERICOS


//////////////METODOS ABSTRACTOS//////////////////
@Override
public String Muestra() {// PARA MOSTRAR LOS DATOS DE ESTA CLASE
// TODO Auto-generated method stub
return MuestraCualquiera();
}
public void Ingresar() {// PARA INGRESAR LOS DATOS DE ESTA CLASE
// TODO Auto-generated method stub
TipoCliente();
									
}												
public String SoloDNI() {//PARA TRAER SOLO EL DNI
// TODO Auto-generated method stub			
return MuestraSoloDNI();					
}												
////////////////////////////////////////////////////
}