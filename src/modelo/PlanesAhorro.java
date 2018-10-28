package modelo;

import javax.swing.JOptionPane;

public class PlanesAhorro extends Servcios{
	
	double saldo, cuotaAhorro;
	int mesesCancelados;
	Anual Anual = new Anual();
	
	Clientes c;
	
public PlanesAhorro() {}

public void SeleccionarPlanAhorro() {
	String tipoAhorro="";
	do {
		
		tipoAhorro = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Anual", "A la vista"}, "Selecciona")).toString() ;
		
		if(tipoAhorro.equalsIgnoreCase("Anual")) {
			Clientes.Docentes.IngresaDocente();
			
		}else if(tipoAhorro.equalsIgnoreCase("A la vista")) {
			
			
		}else {
			JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
		}
	} while (tipoAhorro=="Selecciona"||tipoAhorro==null);
	
}
public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public double getCuotaAhorro() {
	return cuotaAhorro;
}

public void setCuotaAhorro(double cuotaAhorro) {
	this.cuotaAhorro = cuotaAhorro;
}

public int getMesesCancelados() {
	return mesesCancelados;
}

public void setMesesCancelados(int mesesCancelados) {
	this.mesesCancelados = mesesCancelados;
}

public String toString() {
	
	String text="";
	return text += "Saldo: " + getSaldo() + "\n"
				+"Cuota de ahorro: " + getCuotaAhorro() + "\n"
				+"Meses Cancelados: " + getMesesCancelados() + "\n";
}
}
