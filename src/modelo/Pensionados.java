package modelo;

import javax.swing.JOptionPane;

public class Pensionados extends Clientes{

	int anosjubilado;
	String tipoPensionado;
	
public Pensionados() {}
	
public void IngresaPensionado() {
	
	ingresarCliente();
	setAnosjubilado(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de anos jubilado (a) de " + getNombre())));
	
	escogeTipoEmpleado();
}

public int getAnosjubilado() {
		return anosjubilado;
	}

public void setAnosjubilado(int anosjubilado) {
		this.anosjubilado = anosjubilado;
	}
public String getTipoEmpleado() {
		return tipoPensionado;
	}
public void setTipoEmpleado(String tipoEmpleado) {
		this.tipoPensionado = tipoEmpleado;
	}
	
public void escogeTipoEmpleado() {//Metodos para evitar que el usuario escriba,ya que se le es mas facil escoger por medio del numero, 
		//a nivel del programa es mas facil evitar que ocurran errores

			String tipo="";
			do {
				
				tipo = (JOptionPane.showInputDialog(null, "Selecciona el area en la que se desempeñaba", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
						{ "Selecciona","Docente", "Administrativo"}, "Selecciona")).toString() ;
				
				if(tipo.equalsIgnoreCase("Docente")) {
					setTipoEmpleado("Docente");
					
				}else if(tipo.equalsIgnoreCase("Administrtivo")) {
					setTipoEmpleado("Administrativo");
					
				}else {
					JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
				}
			} while (tipo=="Selecciona"||tipo==null);
	
	}
	
	
public String toString() {
		String text="";
		return text+= super.toString() + "Anos de jubilacion: " + getAnosjubilado() + "\n" + "Tipo de empleado: " + getTipoEmpleado();
	}
	
}
