package controlador;

import javax.swing.JOptionPane;

import modelo.ALaVista;
import modelo.Anual;
import modelo.Corriente;
import modelo.EquipoComputo;
import modelo.EspecialOrdinario;
import modelo.Servicios;
import modelo.Vivienda;



public class ArrayObjetos {
	Servicios s [] = new Servicios [100];//creacion del array de objetos
	Corriente c = new Corriente();
	Vivienda v = new Vivienda();
	EspecialOrdinario eo = new EspecialOrdinario();
	EquipoComputo ec = new EquipoComputo();
	Anual a = new Anual();
	ALaVista av = new ALaVista();	
	public int ContUser=0, Cod=1;

public ArrayObjetos() {//Constructor de la clase que contiene el menu de interaccion que a su vez llama a los diferentes metodos para manipular el arreglo
	int e;
	
		
			
		
		for(;;) {
			try {
			
			e= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion\n"
														  + "1-Ingresar\n"
														  + "2-Mostrar\n"
														  + "3-Buscar\n"
														  + "4-Eliminar\n"
														  + "5-Salir"));
		switch (e) {
		case 1:Ingresar();
			break;
		case 2:Mostrar();  //cuidado aca
			break;
		case 3:Buscar();
			break;
		case 4:Eliminar();
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Has decidido finalizar. Hasta Pronto! :)");
			System.exit(0);//opcion para terminar el programa
			break;
		default:
		JOptionPane.showMessageDialog(null, "Opci�n inv�lida");
		}
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros.");
				
			}
		}
		
}

public void Ingresar() {//metodo para escoger alguno de los 3 paquetees
	String tipoServicio = "";
	if(ContUser==s.length){//estrucutura de control para inidicar si el arreglo esta lleno o no sino, se ejecuta el ingresar normalmente
		JOptionPane.showMessageDialog(null,"El maximo de Usuarios que puedes agregar es de " + s.length, null,JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Si deseas agregar, debes eliminar alguno de los usuarios ya guardados.");
	}else 
		do{
	
	tipoServicio = (JOptionPane.showInputDialog(null, "Selecciona el tipo de servicio", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Creditos", "Planes Ahorro"}, "Selecciona")).toString() ;
	
		if(tipoServicio.equalsIgnoreCase("Creditos")) {
		tipoCredito();
	}else 
		if(tipoServicio.equalsIgnoreCase("Planes Ahorro")) {
		tipoAhorro();
	}else  {
	
		JOptionPane.showMessageDialog(null,"Escoge una de las dos opciones");
	}
} while (tipoServicio=="Selecciona"||tipoServicio==null);
	
ContUser ++;
}


public void tipoCredito() {
	String tipoCredito="";
	do {
	tipoCredito = (JOptionPane.showInputDialog(null, "Selecciona el tipo de credito", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Corriente", "Vivienda","Especiales"}, "Selecciona")).toString() ;
	
		if(tipoCredito.equalsIgnoreCase("Corriente")) {
			c.setCod(Cod);
			c.Ingresar();
			s[ContUser]=c;
			Cod++;
			ContUser++;
	}else 
		if(tipoCredito.equalsIgnoreCase("Vivienda")) {
			v.setCod(Cod);
			v.Ingresar();
			s[ContUser]=v;
			Cod++;
			ContUser++;
	}else 
		if(tipoCredito.equalsIgnoreCase("Especiales")) {
			tipoEspecial();
	}else{
	
		JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
	}
} while (tipoCredito=="Selecciona"||tipoCredito==null);
}
public void tipoEspecial() {
	
	String tipoEspecial="";
	
	do{
		
		tipoEspecial = (JOptionPane.showInputDialog(null, "Selecciona el tipo credito Especial", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Especial Ordinario", "Equipo Computo"}, "Selecciona")).toString() ;
		
			if(tipoEspecial.equalsIgnoreCase("Especial Ordinario")) {
				eo.setCod(Cod);
				eo.Ingresar();
				s[ContUser]=eo;
				Cod++;
				ContUser++;			
		}else 
			if(tipoEspecial.equalsIgnoreCase("Equipo Computo")) {
				ec.setCod(Cod);
				ec.Ingresar();
				s[ContUser]=ec;
				Cod++;
				ContUser++;
		}else {
		
			JOptionPane.showMessageDialog(null,"Escoge una de las dos opciones");
		}
	} while (tipoEspecial=="Selecciona"||tipoEspecial==null);
}
public void tipoAhorro() {
String tipoAhorro="";
	
	do{
		
		tipoAhorro = (JOptionPane.showInputDialog(null, "Selecciona el tipo de Plan de Ahorro", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
				{ "Selecciona","Especial Ordinario", "Equipo Computo"}, "Selecciona")).toString() ;
		
			if(tipoAhorro.equalsIgnoreCase("Especial Ordinario")) {
				a.setCod(Cod);
				a.Ingresar();
				s[ContUser]=a;
				Cod++;
				ContUser++;			
		}else 
			if(tipoAhorro.equalsIgnoreCase("Equipo Computo")) {
				av.setCod(Cod);
				av.Ingresar();
				s[ContUser]=av;
				Cod++;
				ContUser++;
		}else {
		
			JOptionPane.showMessageDialog(null,"Escoge una de las dos opciones");
		}
	} while (tipoAhorro=="Selecciona"||tipoAhorro==null);
}



public void Mostrar() {//metodo para recorrer el arreglo de objetos y mostrar todos los clientes que se encuentren ingresados hasta el momento
	if(!s[0].equals(null)){
	
	for (int i = 0; i < ContUser; i++) {
		
		
		JOptionPane.showMessageDialog(null,"Codigo de usuario: "+getCod()+"\n\n"+ s[i].Muestra());
	}
	}
}



public void Buscar(){//metodo para buscar y mostrar a un solo cliente
	
	String t,m="";
	int b;
	
	for(int i=0;i<ContUser;i++) {
		
		m+="\n"+s[i].getCod()+"- "+s[i].SoloDNI();//se hace uso del metodo para llamar solo el nombre del cliente y asi saber a quien se mostrara
		
		}
	try {
		
	
	t = JOptionPane.showInputDialog(null, "Digite el codigo del cliente a buscar. "+m);
	
	if(t!=null&&!t.equals("")) {
		
		b = Integer.parseInt(t); t = "";
	
	if(ContUser!=0) {
		
		for(int i=0;i<ContUser;i++) {
			
			if (s[i].getCod()==b) {
				
				t = "";
				t +=s[i].Muestra();//uso del metodo toString para mostrar todos los datos del cliente a buscar
			break;
			}
			
			else {
				
				t = "No se ha encontrado al cliente";
			}
		}
		JOptionPane.showMessageDialog(null, t);
	}
	}
	} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
	}
}
	
public void Eliminar() {//metodo para eliminar a un cliente que se encuentre dentro del arreglo en ese momento
	int e;
	String m="";
	
	Servicios Borra [] = new Servicios[ContUser-1]; 
	
	for(int i=0;i<ContUser;i++) {
		
	m+="\n"+s[i].getCod()+"- "+s[i].SoloDNI();//uso del metodo para mostrar solo el nombre y asi saber a quien se eliminara

	}
	try {
		
	
	e = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del cliente a eliminar. "+m));
	
	if (e<=ContUser) {
		
		for(int i=0;i<ContUser;i++) {
			
			if (e==s[i].getCod()) {
				
				continue;}
			
			else {
				
				if(s[i].getCod()<e) {
				
					Borra[i]=s[i];
				}
				
			if (s[i].getCod()>e) {
				
				s[i].setCod(i);
				
				Borra[i-1]=s[i];
			}
			}
		}
	s = null; Cod--; ContUser--;
	
	s = new Servicios [3];
	
	for (int i=0; i<Borra.length;i++) {
		
		s[i]=Borra[i];
	}
	}
	else {
		
		JOptionPane.showMessageDialog(null, "El cliente a eliminar no existe.");
	}
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
	}
}



public int getContUser() {
	return ContUser;
}

public Servicios[] getS() {
	return s;
}

public void setS(Servicios[] s) {
	this.s = s;
}

public Corriente getC() {
	return c;
}

public void setC(Corriente c) {
	this.c = c;
}

public Vivienda getV() {
	return v;
}

public void setV(Vivienda v) {
	this.v = v;
}

public EspecialOrdinario getEo() {
	return eo;
}

public void setEo(EspecialOrdinario eo) {
	this.eo = eo;
}

public EquipoComputo getEc() {
	return ec;
}

public void setEc(EquipoComputo ec) {
	this.ec = ec;
}

public Anual getA() {
	return a;
}

public void setA(Anual a) {
	this.a = a;
}

public ALaVista getAv() {
	return av;
}

public void setAv(ALaVista av) {
	this.av = av;
}

public void setContUser(int contUser) {
	ContUser = contUser;
}

public int getCod() {
	return Cod;
}
public void setCod(int cod) {
	Cod = cod;
}
}