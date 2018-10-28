package modelo;

public class EquipoComputo extends Especial{
String dispositivo, comercio;
Administrativos Ad;
Docentes Do;


public void ingresarAd(){
	Administrativos ad = new Administrativos();
}

public void ingresarDo() {
	Docentes Do = new Docentes();
}
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


}
