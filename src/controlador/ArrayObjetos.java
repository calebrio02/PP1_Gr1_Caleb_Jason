package controlador;

import java.math.BigInteger;

import javax.swing.JOptionPane;

import modelo.ALaVista;
import modelo.Administrativos;
import modelo.Anual;
import modelo.Clientes;
import modelo.Corriente;
import modelo.Creditos;
import modelo.Docentes;
import modelo.Pensionados;
import modelo.PlanesAhorro;
import modelo.Vivienda;

public class ArrayObjetos {

	int contUser=0, cod=1; //variable para llevar control usuarios ingresados
    Clientes usuario [] = new Clientes[5]; //creando el arreglo de objetos (clase userBanc)
 
    public ArrayObjetos(){ //constructor de la clase ArrObj/ en el construcutor kenneth hizo el menu. 
 
        String ax;
        int op=0;
 
        do{
            ax = JOptionPane.showInputDialog(null, "1. Ingresar \n"
                                                  +"2. Mostrar\n"
                                                  +"3. Buscar\n"
                                                  +"4. Eliminar\n"
                                                  +"5. Salir","MENU PRINCIPAL",JOptionPane.INFORMATION_MESSAGE);
            if(ax!=null && !ax.equals("")){
                op = Integer.parseInt(ax);
 
                switch(op){
                    case 1:
                        ingresar();
                        break;
                   /* case 2:
                        mostrar();
                        break;
                    case 3:
                        buscar();
                        break;
                    case 4:
                        eliminar();
                        break;
                    case 5:
                    	JOptionPane.showMessageDialog(null, "Hasta la vista!!!!!!Crazy","DESPEDIDA",JOptionPane.INFORMATION_MESSAGE);
                        break;
                    */default:
                        JOptionPane.showMessageDialog(null, "No es una opcion valida!!!","ADVERTENCIA",JOptionPane.INFORMATION_MESSAGE);                        
                }
            }
 
        }while(op!=5);
    }
 
    
    
    public void ingresarTipoCredito() {
    	String tipoCredito = (JOptionPane.showInputDialog(null, "Selecciona el tipo de credito que deseas realizar", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
    			{ "Selecciona","Corriente", "Vivienda", "Especial"}, "Selecciona")).toString() ;

    	
    
   	if(tipoCredito.equalsIgnoreCase("Corriente")) {
   		Corriente Co = new	 Corriente();
   		String tipoCliente = (JOptionPane.showInputDialog(null, "Selecciona el tipo de Cliente", null, JOptionPane.PLAIN_MESSAGE,null, new Object[]
    			{ "Selecciona","Administrativo", "Docentes", "Pensionado"}, "Selecciona")).toString() ;
   			if(tipoCliente.equalsIgnoreCase("Administrativo")) {
   				Co.ingresarAd();
   			}else if(tipoCliente.equalsIgnoreCase("Docentes")) {
   				Co.ingresarDo();
   			}else {
   				Co.ingresarPe();
   			}
   		
   		
   	}else if(tipoCredito.equalsIgnoreCase("Vivienda")) {
   		Vivienda Vi = new Vivienda();

   	}else {
   		
   	}
    	
    }
    
    
    public void ingresarTipoPlanAhorro() {
    	String tipoPlanAhorro = (JOptionPane.showInputDialog(null, "Selecciona el plan de ahorro que deseas realizar",
    			null, JOptionPane.PLAIN_MESSAGE,null, 
    			new Object[] { "Selecciona","Anual", "A la Vista"}, "Selecciona")).toString() ;

    	
    	if (tipoPlanAhorro.equals("Anual")) {
    		Anual Pl = new Anual();
    	}else {
    		ALaVista Al = new ALaVista();
    	}
    }
    public void ingresar() {
    	String resp1, resp2, resp3;
    
    	
    	resp1 = (JOptionPane.showInputDialog(null, "Selecciona el tramite que deseas realizar",
    			null, JOptionPane.PLAIN_MESSAGE,null,
    			new Object[] {"Selecciona","Creditos", "Planes de Ahorro"}, "Selecciona")).toString() ;
    	
    	
    	if(resp1.equalsIgnoreCase("Creditos")) {
    		ingresarTipoCredito();
    		
    		
    		
    		
    	}else if(resp1.equalsIgnoreCase("Planes de Ahorro")) {
    		ingresarTipoPlanAhorro();

    	}
    	
    
    	
    	
    }
   /*
   public void ingresar(){        
 
        BigInteger telefono;
        String nombre, apellido;
        Double saldo;        
        Administrativos a = new Administrativos()
        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del usuario: ","NOMBRE USUARIO",JOptionPane.INFORMATION_MESSAGE);
        apellido = JOptionPane.showInputDialog(null, "Ingrese el Apellido del usuario: ","APELLIDO USUARIO",JOptionPane.INFORMATION_MESSAGE);
        telefono =  new BigInteger(JOptionPane.showInputDialog(null, "Ingrese el Telefono del Usuario: ","CONTACTO USUARIO",JOptionPane.INFORMATION_MESSAGE)) ;
        saldo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el Saldo inicial del Usuario: ","SALDO",JOptionPane.INFORMATION_MESSAGE));
 
        Clientes temp = new Clientes();
 
        temp.setCod(cod); 
        temp.setNombre(nombre); 
        temp.setDni(dni);
        temp.setTelefono(telefono);
        temp.setSaldo(saldo);        
 
        usuario[contUser] = temp;
        contUser++;  
        cod++;      
    }
 
    public void mostrar(){
 
        String ay="";
 
        for(int i=0; i<contUser; i++){
            ay+="Codigo: "+usuario[i].getCod()+"\n"
              + "Nombre: "+usuario[i].getNombre()+"\n"
              + "Apellido: "+usuario[i].getApellido()+"\n"
              + "Telefono: "+usuario[i].getTelefono()+"\n"
              + "Saldo: "+usuario[i].getSaldo()+"\n\n";        
        }

        JOptionPane.showMessageDialog(null, ay,"CONTENIDO ARREGLO DE USUARIOS",JOptionPane.INFORMATION_MESSAGE);
    }
 
    public void buscar(){
 
        String ax;
        int c;
 
        ax = JOptionPane.showInputDialog(null, "Digite el codigo a buscar","BUSQUEDA",JOptionPane.INFORMATION_MESSAGE);
        if(ax!=null && !ax.equals("")){
            c = Integer.parseInt(ax); ax="";
            if(contUser!=0){
                for(int i=0; i<contUser; i++){
                    if(usuario[i].getCod() == c){
                        ax="";
                        ax+="Codigo: "+usuario[i].getCod()+"\n"
                          + "Nombre: "+usuario[i].getNombre()+"\n"
                          + "Apellido: "+usuario[i].getApellido()+"\n"
                          + "Telefono: "+usuario[i].getTelefono()+"\n"
                          + "Saldo: "+usuario[i].getSaldo()+"\n";
                          break;
                    }
                    else{
                        ax="No se ha encontrado el usuario :("; 
                    }
                }
                JOptionPane.showMessageDialog(null, ax,"RESULTADO DE TU BUSQUEDA",JOptionPane.INFORMATION_MESSAGE);
            }
 
        }
    }
 
    public void eliminar(){
        int c;
        userBanc alumTemp[] = new userBanc[contUser-1];//creando un arreglo temporal con un campo menos
 
                        c = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el codigo del estudiante a eliminar: ","ELIMINAR",JOptionPane.INFORMATION_MESSAGE));//pidiendo el codigo a eliminar
                        if(c<=contUser){ //si el codigo a eliminar es menor o igual al contador de estudiantes
 
                            for(int i=0; i<contUser; i++){ //Inicio ciclo para realizar la eliminacion
                                if(c == usuario[i].getCod()){ //si el codigo a aliminar coincide con el codigo que hay en la posicion i
                                    continue; //continua con el ciclo
                                }
                                else{
                                    if(usuario[i].getCod() < c)
                                        alumTemp[i] = usuario[i];//si esl codigo es menor se almacena tal cual                     
                                    if(usuario[i].getCod() > c){
                                        usuario[i].setCod(i);//si el codigo es mayor se le resta para que quede en consecutivo
                                        alumTemp[i-1] = usuario[i]; //se almacena con el nuevo codigo
                                    }
                                }                                                                   
                            } //Fin ciclo para realizar la eliminacion
                            usuario=null; cod--; contUser--; //se hacen las modificaciones para los nuevos valores                   
                            usuario = new userBanc[5]; //se vuelve a crear el arreglo 
                            for(int i=0; i<alumTemp.length; i++){ //se almacenan los valores no eliminados
                                usuario[i]=alumTemp[i];
                            }                            
                        }
                        else
                            JOptionPane.showMessageDialog(null, "El estudiante a eliminar no existe !!!","ERROR AL ELIMINAR",JOptionPane.INFORMATION_MESSAGE);
    }
 
	*/
}
