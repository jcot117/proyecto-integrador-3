package model;

import java.util.Calendar;
import java.text.SimpleDateFormat;

public class lugar{
	
	//ATRIBUTOS 
	private String nombreLugar;
	private departamento departamento; 
	private double area;
	private tipoLugar tipoLugar;
	private Calendar fechaInaguracion;
	private String foto;
	private comunidad comunidad;
	private double recursosEconocmicos;
	private especies[] cantEspecies; 
	
	//CONSTRUCTOR 
	public lugar(String nombreLugar,departamento departamento,double area,tipoLugar tipoLugar,String foto,double recursosEconocmicos){

		this.nombreLugar = nombreLugar;
		this.departamento = departamento;
		this.area = area;
		this.tipoLugar = tipoLugar;
		this.fechaInaguracion = fechaInaguracion;
		this.foto = foto;
		this.recursosEconocmicos = recursosEconocmicos;
		fechaInaguracion = Calendar.getInstance();
		cantEspecies = new especies[20];
	}		
	
	public double getArea(){
		
		return this.area;
	}
	
	public String getNombreLugar(){
		
		return this.nombreLugar;
		
	}
	public departamento getDepartamento(){
		
		return this.departamento;
		
	}
	
	public comunidad getComunidad(){
		
		return this.comunidad;
		
	}
	
	public String nombreEspecie(){
		String nombre = "";
		
		for(int i=0;i<cantEspecies.length;i++){
			
			if(cantEspecies[i]!=null){
			nombre = cantEspecies[i].getNombreEspecie();
			}
		}
		
		return nombre;
		
		 
	}	
	
	public especies buscarEspecie(String nombreEspecie) {
		
		especies temporal;

		for (int i = 0; i < cantEspecies.length; i++) {

			temporal = cantEspecies[i];

			if (temporal != null) {

				if (nombreEspecie.equalsIgnoreCase(temporal.getNombreEspecie())) {

					return temporal;

				}

			}

		}

		return null;

	}
	
	public void modificarTipo(String nombreEspecie, int nuevoTipo){
	
		tipoEspecie nuevoTipoEspecie = tipoEspecie.FAUNA;
		
		switch(nuevoTipo){
			case 1:
			nuevoTipoEspecie = tipoEspecie.FLORA;
			break;
			
			case 2:
			nuevoTipoEspecie = tipoEspecie.FAUNA;
			break;
			
		}
		
		buscarEspecie(nombreEspecie).setTipo(nuevoTipoEspecie);
		
	}
	
	public boolean comprobarNombre(String nuevoNombre){
		
		for(int i=0;i<cantEspecies.length;i++){
			
			if(cantEspecies[i]!=null){
				if(cantEspecies[i].getNombreEspecie()!=nuevoNombre){
				return true;
				}
			}else{
			return false;
			}
		}
		
		return false;
		
		 
	}	
	
	
	public boolean asignarComunidad(comunidad nuevaComunidad){
		if(nuevaComunidad!=null){
		this.comunidad = nuevaComunidad;
		return true;	
		}
		return false;
		
	}
	
	public boolean agregarEspecie(especies nuevaEspecie) {
		
		for(int i=0;i<cantEspecies.length;i++){
		
			if(cantEspecies[i]==null){
				
				cantEspecies[i]=nuevaEspecie;
				return true;
				
			}else if(cantEspecies[i].getNombreEspecie().equals(nuevaEspecie)){
				
				return false;
			}
		
		}
		
		return false;
    }
	
	public int cantEspecies(){
		
		int indice=0;
		
		for(int i=0;i<cantEspecies.length;i++){
		
			if(cantEspecies[i]!=null){
				
				indice=(indice+1);
				
			}else if(cantEspecies[i]==null){
				
				return indice;
			}
		
		}
		
		return indice;
    }


	public String toString(){

        String msg = "";

        msg += "Nombre del lugar: "+nombreLugar;

        msg += "\nDepartamento: "+departamento;

        msg += "\nArea del lugar: "+area;
		
		msg += "\nTipo de lugar: "+tipoLugar;

        msg += "\nFecha de inaguracion: "+fechaInaguracion;

        msg += "\n foto del lugar: "+foto;
		
		msg += "comunidad a cargo: "+comunidad;

        msg += "\nCantida de especies: "+cantEspecies();
		
		

        return msg;
    }
	
}