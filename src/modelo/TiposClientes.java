package modelo;

import javax.swing.JOptionPane;

public class TiposClientes {
	
	Pensionados Pensionados = new Pensionados();
	Docentes Docentes = new Docentes();
	Administrativos Administrativos = new Administrativos();
	
	
	public Pensionados getPensionados() {
		return Pensionados;
	}
	public void setPensionados(Pensionados pensionados) {
		Pensionados = pensionados;
	}
	public Docentes getDocentes() {
		return Docentes;
	}
	public void setDocentes(Docentes docentes) {
		Docentes = docentes;
	}
	public Administrativos getAdministrativos() {
		return Administrativos;
	}
	public void setAdministrativos(Administrativos administrativos) {
		Administrativos = administrativos;
	}


	
	public void escogeCliente() {
		
		
		String tipoCliente="";
		do {
			
			tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
					{ "Selecciona","Docente", "Pensionado", "Administrativo"}, "Selecciona")).toString() ;
			
			if(tipoCliente.equalsIgnoreCase("Docente")) {
				
			setDocentes(Docentes);
			
				
			}else if(tipoCliente.equalsIgnoreCase("Pensionado")) {
				setPensionados(Pensionados);
				
			}else if(tipoCliente.equalsIgnoreCase("Administrativo")) {
			setAdministrativos(Administrativos);
				
			}else {
				JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
			}
		} while (tipoCliente=="Selecciona"||tipoCliente==null);
		
		
	}
		
	
}
