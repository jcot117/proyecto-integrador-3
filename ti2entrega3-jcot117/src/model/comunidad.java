package model;

public class comunidad{
	
	private String nombreComunidad;
	private tipoComunidad tipoComunidad;
	private String nombreRepresetante;
	private String numeroRepresentante;
	private int cantHabitantes;
	private mayoresProblemas mayoresProblemas; 
	private producto[] productos;
	
	public comunidad (String nombreComunidad,tipoComunidad tipoComunidad,String nombreRepresetante,String numeroRepresentante, int cantHabitantes, mayoresProblemas mayoresProblemas){
		
		this.nombreComunidad=nombreComunidad;
		this.tipoComunidad=tipoComunidad;
		this.nombreRepresetante=nombreRepresetante;
		this.numeroRepresentante=numeroRepresentante;
		this.cantHabitantes=cantHabitantes;
		this.mayoresProblemas=mayoresProblemas; 
		productos = new producto[20];
	}
	
	public String getNombreComunidad (){
		
		return this.nombreComunidad;
		
	}
	
	public mayoresProblemas getProblemas(){
		
		return this.mayoresProblemas;
		
	}
	
	public boolean agregarProducto(producto nuevoProducto) {
		
		for(int i=0;i<productos.length;i++){
		
			if(productos[i]==null){
				
				productos[i]=nuevoProducto;
				return true;
				
			}else if(productos[i].getNombreProducto().equals(nuevoProducto)){
				
				return false;
			}
		
		}
		
		return false;
    }
	
	
	
	public String NameProducto(){
		String nombre = "";
		
		for(int i=0;i<productos.length;i++){
			
			if(productos[i]!=null){
			nombre = productos[i].getNombreProducto();
			}
		}
		
		return nombre;
		
		 
	}	
	
	public boolean eliminarProducto(String nombreProducto) {

		int index = buscarProducto( nombreProducto);

		if (index != -1) {

			productos[index] = null;

			return true;

		}
		return false;
	}
	
	public int buscarProducto(String nombreProducto) {

		for (int i = 0; i < productos.length; i++) {

			producto temporal = productos[i];

			if (temporal != null) {

				if (nombreProducto.equalsIgnoreCase(temporal.getNombreProducto())) {

					return i;

				}

			}

		}

		return -1;

	}
	
	public int cantProductos(){
		
		int indice=0;
		
		for(int i=0;i<productos.length;i++){
		
			if(productos[i]!=null){
				
				indice=(indice+1);
				
			}else if(productos[i]==null){
				
				return indice;
			}
		
		}
		
		return indice;
    }
	
	public String toString(){

        String msg = "";

        msg += "Nombre de la comunidad: "+nombreComunidad;

        msg += "\nTipo de comunidad: "+tipoComunidad;

        msg += "\nNombre del representante: "+nombreRepresetante;
		
		msg += "\nNumero del represntante: "+numeroRepresentante;

        msg += "\nCantidad de habitantes: "+cantHabitantes;

        msg += "\n mayoresProblemas: "+mayoresProblemas;

        msg += "\nCantidad de productos: "+cantProductos();
		
		

        return msg;
    }
	
}