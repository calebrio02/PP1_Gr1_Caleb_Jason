package modelo;

public class TiposClientes {
	
	Pensionados P = new Pensionados();
	Docentes D = new Docentes();
	Administrativos A = new Administrativos();
	


public Pensionados getP() {
		return P;
	}
public void setP(Pensionados p) {
		P = p;
	}
public Docentes getD() {
		return D;
	}
public void setD(Docentes d) {
		D = d;
	}
public Administrativos getA() {
		return A;
	}
public void setA(Administrativos a) {
		A = a;
	}

}
