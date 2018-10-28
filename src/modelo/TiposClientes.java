package modelo;

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


}
