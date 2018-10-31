package controlador;

import javax.swing.JOptionPane;

import modelo.Creditos;
import modelo.PlanesAhorro;
import modelo.Servicios;



public class ArrayObjetos {
	Servicios s [] = new Servicios [10];//creacion del array de objetos
	Creditos c = new Creditos();
	PlanesAhorro p = new PlanesAhorro();	
	public int ContUser=0, Cod=1;

public ArrayObjetos() {//Constructor de la clase que contiene el menu de interaccion que a su vez llama a los diferentes metodos para manipular el arreglo
	int e;
	
		
			
		
		for(;;) {
			try {
			
			e= Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opci�n\n"
														  + "1-Ingresar\n"
														  + "2-Mostrar\n"
														  + "3-Buscar\n"
														  + "4-Eliminar\n"
														  + "5-Salir"));
		switch (e) {
		case 1:Ingresar();
			break;
		case 2:Mostrar();
			break;
		case 3://Buscar();
			break;
		case 4://Eliminar();
			break;
		case 5:System.exit(0);//opcion para terminar el programa
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
		JOptionPane.showMessageDialog(null,"El m�ximo de Usuarios que puedes agregar es de " + s.length, null,JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Si deseas agregar, debes eliminar alguno de los usuarios ya guardados.");
	}else{
	int n=0;
	tipoServicio = (JOptionPane.showInputDialog(null, "Selecciona el tipo de servicio", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
			{ "Selecciona","Creditos", "Planes Ahorro"}, "Selecciona")).toString() ;
	
	if(tipoServicio.equalsIgnoreCase("Creditos")) {
		
	c.escogeTipoCreditoClientefinal(c.devuelveTipoCredito());
	s[ContUser]= c;
	JOptionPane.showMessageDialog(null, c.Muestra());
		
	}else if(tipoServicio.equalsIgnoreCase("Planes Ahorro")) {
		p.Ingresar();
		s[ContUser]= p;
		
	
		JOptionPane.showMessageDialog(null, p.Muestra());
		
		
	}else  {
	
		JOptionPane.showMessageDialog(null,"Escoge una de las tres opciones");
	}
} while (tipoServicio=="Selecciona"||tipoServicio==null);

	
ContUser ++;
}


public void Mostrar() {//metodo para recorrer el arreglo de objetos y mostrar todos los clientes que se encuentren ingresados hasta el momento
	if(!s[0].equals(null)){
	
	for (int i = 0; i < ContUser; i++) {
		
		
		JOptionPane.showMessageDialog(null, s[i].Muestra());
	}
	}
}


/*
public void Buscar(){//metodo para buscar y mostrar a un solo cliente
	
	String t,m="";
	int b;
	
	for(int i=0;i<ContUser;i++) {
		
		m+="\n"+O[i].getCod()+"- "+O[i].Solonombre();//se hace uso del metodo para llamar solo el nombre del cliente y asi saber a quien se mostrara
		
		}
	try {
		
	
	t = JOptionPane.showInputDialog(null, "Digite el c�digo del cliente a buscar. "+m);
	
	if(t!=null&&!t.equals("")) {
		
		b = Integer.parseInt(t); t = "";
	
	if(ContUser!=0) {
		
		for(int i=0;i<ContUser;i++) {
			
			if (O[i].getCod()==b) {
				
				t = "";
				t +=O[i].toString();//uso del metodo toString para mostrar todos los datos del cliente a buscar
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
	
	Oferta Borra [] = new Oferta[ContUser-1]; 
	
	for(int i=0;i<ContUser;i++) {
		
	m+="\n"+O[i].getCod()+"- "+O[i].Solonombre();//uso del metodo para mostrar solo el nombre y asi saber a quien se eliminara

	}
	try {
		
	
	e = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el c�digo del cliente a eliminar. "+m));
	
	if (e<=ContUser) {
		
		for(int i=0;i<ContUser;i++) {
			
			if (e==O[i].getCod()) {
				
				continue;}
			
			else {
				
				if(O[i].getCod()<e) {
				
					Borra[i]=O[i];
				}
				
			if (O[i].getCod()>e) {
				
				O[i].setCod(i);
				
				Borra[i-1]=O[i];
			}
			}
		}
	O = null; Cod--; ContUser--;
	
	O = new Oferta [3];
	
	for (int i=0; i<Borra.length;i++) {
		
		O[i]=Borra[i];
	}
	}
	else {
		
		JOptionPane.showMessageDialog(null, "El cliente a eliminar no existe.");
	}
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, "Ingrese unicamente numeros");
	}
}

public Oferta[] getO() {
	return O;
}

public void setO(Oferta[] o) {
	O = o;
}

public int getContUser() {
	return ContUser;
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
*/
}
