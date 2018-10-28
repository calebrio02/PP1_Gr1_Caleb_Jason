package modelo;
import javax.swing.*;
public abstract class  Clientes  {
	
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
	setDni(JOptionPane.showInputDialog("Introduce el DNI de " + getNombre()+"."));
	
	
	do {
		try {
			setSalario(Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario en $ correspondiente a " + getNombre()+".")));
			cambio=1;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
			cambio=0;
		}
	} while (cambio==0);
	
}
public String toString() {
	
	String text="";
	return text+= "Nombre: " + getNombre()+"\n"+"DNI: " + getDni()+"\n"+"Salario: $" + getSalario() + "\n";
}

}
