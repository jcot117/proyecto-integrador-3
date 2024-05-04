package model;

public class producto{
	
	private String nombreProducto;
	private double porcentajeNatural;
	private tipoArtesania tipoArtesania;
	private boolean hecho_a_Mano;
	
	public producto(String nombreProducto,double porcentajeNatural,tipoArtesania tipoArtesania,boolean hecho_a_Mano){
		
		this.nombreProducto=nombreProducto;
		this.porcentajeNatural=porcentajeNatural;
		this.tipoArtesania=tipoArtesania;
		this.hecho_a_Mano=hecho_a_Mano;
		
		
	} 
	
	
	public String getNombreProducto(){
		
		return this.nombreProducto;
		
	}
	
	
}