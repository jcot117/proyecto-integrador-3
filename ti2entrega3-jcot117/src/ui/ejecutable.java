package ui;
import java.util.Scanner;
import model.controlador;

public class ejecutable{
	
	//atributos 
	private Scanner reader;
	
	//relaciones
	private controlador controller;
	
	
	public static void main(String [] principal){
		
		ejecutable exe = new ejecutable();
		
		exe.menus();
		
	}
	
	//constructor
	public ejecutable(){
		reader = new Scanner (System.in);
		controller = new controlador();
	}
	
	/**
	descripcion: este metodo desplega el menu de los menus.
	pre: el scanner tiene que estar inicializado	
	*/
	
	public void menus(){
		
		boolean flag = true;
		
		do{
			
			System.out.println("Bienvenido a la cop 16");
			System.out.println("1)menu administativo");
			System.out.println("2)Menu de consultor");
			System.out.println("0)salir ");
			int opc = reader.nextInt();
			
			switch(opc){
				
				case 1:
				menuAdministrativo();
				break;
				
				case 2: 
				menuConsultor();
				break;
				
				case 0:
				flag = false;
				System.out.println("Gracias por usar nuestros servicios");
				break;
		
				
				default:
				System.out.println("Opcion Invalida. Intenta nuevamente");
				break;
			}
			
		}while(flag==true);
		
	}
	
	/**
	descripcion: el metodo menu despliega el menu abministrador del programa 
	pre: el scnnaer tiene que estar inicializado
	*/
	
	public void menuAdministrativo(){
		
		boolean flag = true;
		
		do{
			
			System.out.println("........ MENU DE ADMINISTRADOR .........");
			System.out.println("1)Registrar un lugar ");
			System.out.println("2)Registrar una comunidad");
			System.out.println("3)Registrar un producto de una comunidad ");
			System.out.println("4)Eliminar un producto de una comunidad ");
			System.out.println("5)Registrar una especie a un lugar ");
			System.out.println("6)Modificar datos de una especie en un lugar ");
			System.out.println("7)Creacion de casos de prueba");
			System.out.println("0)salir ");
			int opc = reader.nextInt();
			
			switch(opc){
				
				case 1:
				registrarlugar();
				break;
				
				case 2: 
				registrarComunidad();
				break;
				
				case 3:
				registrarProductoComunidad();
				break;
				
				case 4:
				eliminarProducto();
				break;
				
				case 5:
				registrarEspecie();
				break;
				
				case 6:
				modificarEspecie();
				break;
				
				case 7:
				
				break;
	
				case 0:
				flag = false;
				System.out.println("Gracias por usar nuestros servicios");
				break;
		
				
				default:
				System.out.println("Opcion Invalida. Intenta nuevamente");
				break;
			}
			
		}while(flag==true);
		
	}
	
	
	private void menuConsultor() {
        boolean exit = false;
        while (!exit) {
            System.out.println("........ MENU DE CONSULTOR .........");
            System.out.println("1. Consultar lugar");
            System.out.println("2. Consultar comunidades por departamento");
            System.out.println("3. Consutlar comunidades con problemasde escuela y hospital");
            System.out.println("4. Mostrar el lugar con mas especies");
            System.out.println("5. mostrar los 3 lugares mas grandes");
            System.out.println("6. Volver al menu");
            int opc = reader.nextInt();
           

           switch (opc) {
            case 1:
            consultarLugar();
            break;
			
            case 2: 
            consultarComunidadDepartamento();   
            break;
			
            case 3:
            consultarComunidadProblemas();
            break;
            
            case 4:
            lugarConMasEspecies();
            break;

            case 5:
            lugaresMasGrandes();
            break;
			
            case 6:
            exit = true;
            break;

           
            default:
            System.out.println("opcion invalida");
                break;
           }
        }
    }
	
	/*
	descripcion: este metodo registra el lugar y lo almacena.
	pre: el scanner tiene que haber sido inicializado
	**/
	
	
	public void registrarlugar(){
		
		reader.nextLine(); //Correccion del bug del Scanner
		
		System.out.println("Digite el nombre del lugar");
		String nombreLugar = reader.nextLine();
		System.out.println("");
		
		System.out.println("Seleccione el departamento del lugar");
		System.out.println(controller.listaDepartamento());
		int depart = reader.nextInt();
		System.out.println("");
		
		System.out.println("Digite el area del lugar");
		double area = reader.nextDouble();
		System.out.println("");
		
		System.out.println("Seleccione el tipo de lugar");
		System.out.println(controller.listaTipoLugar());
		int tipoL = reader.nextInt();
		System.out.println("");
		
		System.out.println("Digite el link de una imagen");
		String foto = reader.nextLine();
		System.out.println("");
		
		System.out.println("Digite los recursos economicos necesarios para un buen mantenimiento del lugar");
		double recursosEconomicos = reader.nextDouble();
		System.out.println("");
		
		System.out.println("Seleccione el tipo de lugar");
		int especies = reader.nextInt();
		System.out.println("");
		
		boolean resultado = controller.almacenarLugar(nombreLugar, depart, area, tipoL, foto, recursosEconomicos);
		
		if(resultado){
			System.out.println("el lugar ha registrado exitosamente");
		}else{
			System.out.println("Error, el lugar no se ha podido registrar");
		}

		
	}
	
	/*
	descripcion: este metodo registra el lugar y lo almacena.
	pre: el scanner tiene que haber sido inicializado
	**/
	
	public void registrarComunidad(){
		
		reader.nextLine(); //Correccion del bug del Scanner
		
		System.out.println("¿ha que lugar ingresara la comunidad?");
		System.out.println(controller.listarLugares());
		String nombreLugar = reader.nextLine();
		System.out.println("");
		
		System.out.println("Digite el nombre de la comunidad");
		String nombreComunidad = reader.nextLine();
		System.out.println("");
		
		System.out.println("Seleccione el departamento del lugar");
		System.out.println(controller.listaTipoComunidad());
		int tipoCom = reader.nextInt();
		System.out.println("");
		
		System.out.println("Digite el nombre del representante");
		String nombreRepresentante = reader.nextLine();
		System.out.println("");
		
		System.out.println("digite el numero del representante");
		String numeroRepresentante = reader.nextLine();
		System.out.println("");
		
		System.out.println("digite la fecha de inaguracion");
		int cantHabitantes = reader.nextInt();
		System.out.println("");
		
		System.out.println("Seleccione un tipo de problema");
		System.out.println(controller.listaMayoresProblemas());
		int mayoresProblem = reader.nextInt();
		System.out.println("");
		
		controller.buscarLugar(nombreLugar);
		boolean resultado = controller.almacenarComunidad(nombreLugar, nombreComunidad, tipoCom, nombreRepresentante, numeroRepresentante,cantHabitantes, mayoresProblem);
		
		if(resultado){
			System.out.println("la comunidad ha registrado exitosamente");
		}else{
			System.out.println("Error, la comunidad no se ha podido registrar");
		}
		
	}
	
	public void registrarEspecie(){
		
		reader.nextLine();
		
		System.out.println("digite el lugar al que desea agregar la especie");
		System.out.println(controller.listarLugares());
		String nombreLugar = reader.nextLine();
		
		System.out.println("digite el nombre de la especie");
		String nombreEspecie = reader.nextLine();
		
		System.out.println("seleccione el tipo de especie");
		System.out.println(controller.listaTipoEspecie());
		int tipoEsp = reader.nextInt();
		
		System.out.println("Digite el url de una imagen de la especie");
		String foto = reader.nextLine();
		
		System.out.println("digite la cantidad de especies que hay");
		int cantEjemplares = reader.nextInt();
		
		boolean resultado = controller.almacenarEspecieLugar(nombreLugar, nombreEspecie, tipoEsp, foto, cantEjemplares);
		
		if(resultado){
			System.out.println("la comunidad ha registrado exitosamente");
		}else{
			System.out.println("Error, la comunidad no se ha podido registrar");
		}
	}
	
	public void registrarProductoComunidad(){
		
		reader.nextLine();
		
		System.out.println("digite la comunidad al que desea agregar el producto");
		System.out.println(controller.listaComunidades());
		String nombreComunidad = reader.nextLine();
		
		System.out.println("digite el nombre del producto");
		String nombreProducto = reader.nextLine();
		
		System.out.println("digite el porcentaje natural del pruducto");
		double porcentajeNatural = reader.nextDouble();
		
		System.out.println("seleccione el tipo de producto");
		System.out.println(controller.listaTipoArtesania());
		int tipoPro = reader.nextInt();
		
		System.out.println("esta hecho a mano?");
		System.out.println("1) si");
		System.out.println("2) no");
		int opc = reader.nextInt();
		boolean hecho_a_Mano = false;
		
		if(opc==1){
		hecho_a_Mano=true;
		}
		else if(opc==2){
			hecho_a_Mano=false;
		}
		
		boolean resultado = controller.almacenarProductoComunidad(nombreComunidad,nombreProducto,porcentajeNatural,tipoPro,hecho_a_Mano);
		
		if(resultado){
			System.out.println("la comunidad ha registrado exitosamente");
		}else{
			System.out.println("Error, la comunidad no se ha podido registrar");
		}
	}
	
	public void eliminarProducto(){
		reader.nextLine();
		
		System.out.println("digite la comunidad");
		System.out.println(controller.listaComunidades());
		String nombreComunidad = reader.nextLine();
		
		System.out.println("seleccione el producto");
		System.out.println(controller.listaProductos());
		String nombreProducto = reader.nextLine();
		
		boolean resultado = controller.eliminarProducto(nombreComunidad,nombreProducto);
		
		if(resultado == true){
			System.out.println("el producto se elemino");
		}else{
			System.out.println("el producto no se elimino intentelo de nuevo");
		}
		
	}
	
	
	public void modificarEspecie(){
		
		reader.nextLine();
		System.out.println("¿ha que lugar desea modificar la especie?");
		System.out.println(controller.listarLugares());
		String nombreLugar = reader.nextLine();
		System.out.println("");
		
		System.out.println("que especie desea modificar?");
		System.out.println(controller.listaEspecies());
		String nombreEspecie = reader.nextLine();
		System.out.println("");
		
		System.out.println("digite el nuevo nombre");
		String nuevoNombre = reader.nextLine();
		System.out.println("");
		
		System.out.println("seleccione el nuevo tipo");
		System.out.println(controller.listaTipoEspecie());
		int nuevoTipo = reader.nextInt();
		System.out.println("");
		
		System.out.println("digite la nueva imagen");
		String nuevaFoto = reader.nextLine();
		System.out.println("");
		
		System.out.println("digite la nueva cantidad de ejemplares");
		int nuevaCant = reader.nextInt();
		System.out.println("");
		
		controller.modificarNombreEspecie(nombreLugar,nombreEspecie,nuevoNombre);
		controller.modificarTipo(nombreLugar,nombreEspecie,nuevoTipo); 
		controller.modificarFoto(nombreLugar,nombreEspecie,nuevaFoto);
		controller.modificarFoto(nombreLugar,nombreEspecie,nuevaCant);

	}
	
	
	
	public void consultarLugar(){
		
		reader.nextLine();
		
		System.out.println("digite el nombre del lugar que desea consultar");
		System.out.println(controller.listarLugares());
		String nombreLugar = reader.nextLine();
		
		controller.consutlarLugar(nombreLugar);
		
	}		
	
	
	public void consultarComunidadDepartamento(){
		
		reader.nextLine();
		
		System.out.println("seleccione el departamento");
		System.out.println(controller.listaDepartamento());
		int depart = reader.nextInt();
		
		controller.consultarComunidadApartamento(depart);
	}
	
	
	
	public void consultarComunidadProblemas(){
		
		System.out.println("estos son las comundiades con problemas de escuala y hospital");
		System.out.println(controller.consultarComunidadesProblema());
		
	}
	
	public void lugarConMasEspecies(){
		System.out.println("el lugar con mas especies es:" +controller.lugarConMasEspecies());
	}
	
	public void lugaresMasGrandes(){
		String infoLugaresGrandes = controller.LugaresMasGrandes();
        System.out.println("los 3 lugares con el area mas grande en kilometros son:");
        System.out.println(infoLugaresGrandes);
		
	}
}