package model;

public class especies{
	
	//ATRIBUTOS 
	private String nombreEspecie;
	private tipoEspecie tipoEspecie;
	private String foto;
	private int cantEjemplares;
	
	//CONSTRUCTOR
	public especies(String nombreEspecie,tipoEspecie tipoEspecie,String foto, int cantEjemplares){
		
		this.nombreEspecie = nombreEspecie;
		this.tipoEspecie = tipoEspecie;
		this.foto = foto;
		this.cantEjemplares = cantEjemplares;
		
		
	}
	
	public String getNombreEspecie(){
		
		return this.nombreEspecie;
	}
	
	public String setNombre(String nuevoNombre){
		
		return this.nombreEspecie=nuevoNombre;
	}
	
	public tipoEspecie setTipo(tipoEspecie nuevoTipoEspecie){
		
		return this.tipoEspecie=nuevoTipoEspecie;
	}
	
	public String setFoto(String nuevaFoto){
		
		return this.foto=nuevaFoto;
	}
	
	public int setCant(int nuevaCant){
		
		return this.cantEjemplares=nuevaCant;
	}
	
}