package modelo;
import javax.swing.*;
public  class  Clientes  {
	
String nombre, dni;
double salario;

public Clientes () {
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getDni() {
	return dni;
}
public void setDni(String dni) {
	this.dni = dni;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}


public void ingresarCliente() {
	
	int cambio=0;
			
	setNombre(JOptionPane.showInputDialog("Introduce el nombre"));
	do {
		
		setDni(JOptionPane.showInputDialog("Introduce el DNI de " + getNombre()+"."));
		if(getDni().length()<7||getDni().length()>7) {
			JOptionPane.showMessageDialog(null, "El DNI debe contener 7 numeros!");
		}else {
			
		}
		
		
	}while(getDni().length()<7||getDni().length()>7);
	
	
	do {
		try {
			setSalario(Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario en ¢ correspondiente a " + getNombre()+".")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
			cambio=0;
		}
	} while (cambio==0);
	
}
public String RespuestaCliente()
{	String Muestra="";
	
	Muestra+="DATOS DEL CLIENTE\n"
			+ "Nombre: "+getNombre()+"\n"
			+ "DNI: "+getDni()+"\n"
			+ "Salario: "+getSalario()+"\n\n";
	
	return Muestra;
	
	}
public void MuestraCliente() {

	JOptionPane.showMessageDialog(null, RespuestaCliente());

}

}
