package model;

public class controlador{
	
	private lugar[] almacenamientoLugar;
	
	public controlador(){
		
		almacenamientoLugar = new lugar[200];
	}
	
	/**
	descripcion: muestra la lista de departamentos
	*/
	
	public String listaDepartamento(){
		
		departamento[] arregloDepartamento = departamento.values();
		
		String lista = "";
		
		for(int i = 0; i<arregloDepartamento.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arregloDepartamento[i];
			
		}
		
		return lista;
		
	}
	
	/**
	descripcion: muestra la lista de tipos de lugar
	*/
	
	public String listaTipoLugar(){
		
		tipoLugar[] arregloTipoLugar = tipoLugar.values();
		
		String lista = "";
		
		for(int i = 0; i<arregloTipoLugar.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arregloTipoLugar[i];
			
		}
		
		return lista;
		
	}
	
	/**
	descripcion: se almacena en el arreglo lugar el objeto lugar con sus atributos
	pre: el arreglo almacenamientoLugar tiene que esta inicializado 
	@param String nombreLugar es el nombre del lugar 
	@param departamento departamento es el departamento al que pertenece el lugar 
	@param double area es el area en metros cuadrados que tiene el lugar 
	@param tipo lugar tipoLugar es el tipo de lugar
	@param String fechaInaguracion es la fecha que el lugar fue inagurado 
	@param String foto es la url de la imagen del lugar 
	@param comunidad comunidad es la comunidad encargada del lugar
	@param double recursosEconocmicos es la cantidad de dinero que se necesita para el mantenimiento del lugar 
	@param int especies es la cantidad de especies que hay en el lugar 
	pos: se guarda el objeto lugar en el arreglo almacenamientoLugar 
	*/
	
	public boolean almacenarLugar(String nombreLugar,int depart,double area,int tipoL,String foto,double recursosEconocmicos){
		
		departamento nuevoDepartamento = departamento.CHOCO;
		
		switch(depart){
			
			case 1:
			nuevoDepartamento = departamento.CHOCO;
			break;
			
			case 2:
			nuevoDepartamento = departamento.VALLE;
			break;
			
			case 3:
			nuevoDepartamento = departamento.CAUCA;
			break;
			
			case 4:
			nuevoDepartamento = departamento.NARINO;
			break;
		}
		
		tipoLugar nuevoTipoLugar = tipoLugar.AREA_PROTEGIDA;
		
		switch(tipoL){
			
			case 1:
			nuevoTipoLugar = tipoLugar.AREA_PROTEGIDA;
			break;
			
			case 2:
			nuevoTipoLugar = tipoLugar.PARQUE_NACIONAL;
			break;
			
			case 3:
			nuevoTipoLugar = tipoLugar.AREA_PRIVADA;
			break;
			
		}
		
		lugar nuevoLugar = new lugar(nombreLugar,nuevoDepartamento,area,nuevoTipoLugar,foto,recursosEconocmicos);
		
		for( int i =0; i<almacenamientoLugar.length; i++){
			
			if(almacenamientoLugar[i] == null){
				
				almacenamientoLugar[i] = nuevoLugar;
				return true;
				
			}
			else if(almacenamientoLugar[i].getNombreLugar().equals(nombreLugar)){
				return false;
			}
			
		}
		 return false;
		
	}
	
	public String listarLugares(){
		
		String lista = "";
		
		for(int i=0;i<almacenamientoLugar.length;i++){
			
			if(almacenamientoLugar[i]!=null){
			lista+="\n"+almacenamientoLugar[i].getNombreLugar()+"-"+almacenamientoLugar[i].getNombreLugar();
			}
		}
		
		return lista;
		
		 
	}	
	
	/**
	descripcion: muestra la lista de tiposde comunidad
	*/
	
	public String listaTipoComunidad(){
		
		tipoComunidad[] arregloTipoComunidad = tipoComunidad.values();
		
		String lista = "";
		
		for(int i = 0; i<arregloTipoComunidad.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arregloTipoComunidad[i];
			
		}
		
		return lista;
		
	}
	
	/**
	descripcion: muestra la lista de los mayores problemas que puede tener una comunidad
	*/
	
	public String listaMayoresProblemas(){
		
		mayoresProblemas[] arregloMayoresProblemas = mayoresProblemas.values();
		
		String lista = "";
		
		for(int i = 0; i<arregloMayoresProblemas.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arregloMayoresProblemas[i];
			
		}
		
		return lista;
		
	}
	
	public lugar buscarLugar(String nombreLugar){
		
		for(int i = 0; i<almacenamientoLugar.length; i++){
			
			lugar temporal = almacenamientoLugar[i];
			
			if(temporal!=null){
				
				if(nombreLugar.equals(temporal.getNombreLugar())){
				
				return temporal;
				
				}
			}			
			
		}

		return null;	
		
	}
	
	/**
	descripcion: se almacena en el arreglo de comunidad el objeto comunidad con sus atributos
	pre: el arreglo almacenamientoCom tiene que esta inicializado 
	@param String nombreComunidad es el nombre de la comunidad 
	@param tipoComunidad tipoComunidad es el tipo de comunidad 
	@param String nombreRepresetante es el nombre del representante 
	@param String numeroRepresentante es el numero del representante 
	@param int cantHabitantes es el numero de habitantes en la comunidad 
	@param double recursosEconocmicos es la cantidad de dinero que se necesita para el mantenimiento del lugar 
	@param mayoresProblemas mayoresProblemas son los problemas que se pueden presentar en una comunidad  
	pos: se guarda el objeto lugar en el arreglo almacenamientoCom
	*/
	
	public boolean almacenarComunidad(String nombreLugar, String nombreComunidad, int tipoCom, String nombreRepresetante, String numeroRepresentante, int cantHabitantes, int mayoresProblem){
		
		tipoComunidad nuevoTipoComunidad = tipoComunidad.AFROCOLOMBIANA;
		
		switch(tipoCom){
			
			case 1:
			nuevoTipoComunidad = tipoComunidad.AFROCOLOMBIANA;
			break;
			
			case 2:
			nuevoTipoComunidad = tipoComunidad.INDIGENA;
			break;
			
			case 3:
			nuevoTipoComunidad = tipoComunidad.RAIZAL;
			break;
			
		}
		
		mayoresProblemas nuevoMayoresProblemas = mayoresProblemas.FALTA_DE_HOSPITAL;
		
		switch(mayoresProblem){
			
			case 1:
			nuevoMayoresProblemas = mayoresProblemas.FALTA_DE_HOSPITAL;
			break;
			
			case 2:
			nuevoMayoresProblemas = mayoresProblemas.FALTA_DE_ESCUELA;
			break;
			
			case 3:
			nuevoMayoresProblemas = mayoresProblemas.FALTA_DE_AGUA_POTABLE;
			break;
			
			case 4:
			nuevoMayoresProblemas = mayoresProblemas.FALTA_DE_ACCESO_A_ALIMENTACION_BASICA;
			break;
		}


		lugar found = buscarLugar(nombreLugar);
		
		if(found!=null){
			comunidad nuevaComunidad = new comunidad(nombreComunidad, nuevoTipoComunidad, nombreRepresetante, numeroRepresentante, cantHabitantes, nuevoMayoresProblemas);
		return found.asignarComunidad(nuevaComunidad);
		}else{
		return false;
		}
		
		
		
	}
	
	public String listaTipoEspecie(){
		
		tipoEspecie[] arregloTipoEspecie = tipoEspecie.values();
		
		String lista = "";
		
		for(int i = 0; i<arregloTipoEspecie.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arregloTipoEspecie[i];
			
		}
		
		return lista;
		
	}
	
	public boolean almacenarEspecieLugar(String nombreLugar, String nombreEspecie, int tipoEsp, String foto, int cantEjemplares){
		
		tipoEspecie nuevoTipoEspecie = tipoEspecie.FAUNA;
		
		switch(tipoEsp){
			case 1:
			nuevoTipoEspecie = tipoEspecie.FLORA;
			break;
			
			case 2:
			nuevoTipoEspecie = tipoEspecie.FAUNA;
			break;
			
		}
		
		lugar found = buscarLugar(nombreLugar);
		
		if(found!=null){
			especies nuevaEspecie = new especies(nombreEspecie, nuevoTipoEspecie, foto, cantEjemplares);
		return found.agregarEspecie(nuevaEspecie);
		}
		else{
		return false;
		}
	}
	
	public String listaComunidades() {

        String list = "";

        for (int i = 0; i < almacenamientoLugar.length; i++) {

            if (almacenamientoLugar[i] != null) {

                if (almacenamientoLugar[i].getComunidad() != null){

                    list += "\n" + (i + 1) + ". " + almacenamientoLugar[i].getComunidad().getNombreComunidad();
                }

            }

        }

        return list;

    }
	
	public comunidad buscarComunidad(String nombreComunidad){
		
		comunidad temporal;
		
		for (int i = 0; i < almacenamientoLugar.length; i++) {

            if (almacenamientoLugar[i] != null) {

                if (almacenamientoLugar[i].getComunidad().getNombreComunidad().equals(nombreComunidad)) {

                     
					return temporal=almacenamientoLugar[i].getComunidad();

                }

            }

        }

        return null;
		
	}
	
	public String listaTipoArtesania(){
		
		tipoArtesania[] arregloTipoArtesania = tipoArtesania.values();
		
		String lista = "";
		
		for(int i = 0; i<arregloTipoArtesania.length; i++){
			
			lista += "\n" + (i + 1) + "- " + arregloTipoArtesania[i];
			
		}
		
		return lista;
		
	}
	
	public boolean almacenarProductoComunidad(String nombreComunidad, String nombreProducto, double porcentajeNatural,int tipoPro, boolean hecho_a_Mano){
		tipoArtesania nuevoTipoArtesania = tipoArtesania.ALIMENTO;
		
		switch(tipoPro){
			
			case 1:
			nuevoTipoArtesania = tipoArtesania.ALIMENTO;
			break;
			
			case 2:
			nuevoTipoArtesania = tipoArtesania.ARTESANIA;
			break;
			
		}
		
		comunidad found = buscarComunidad(nombreComunidad);
		
		if(found!=null){
			producto nuevoProducto = new producto(nombreProducto,porcentajeNatural,nuevoTipoArtesania,hecho_a_Mano);
			found.agregarProducto(nuevoProducto);
			return true;
		}else{
			return false;
		}
		
	}
	
	
	
	public String listaProductos() {

        String list = "";

        for (int i = 0; i < almacenamientoLugar.length; i++) {

            if (almacenamientoLugar[i] != null) {

                if (almacenamientoLugar[i].getComunidad() != null){

                    list += "\n" + (i + 1) + ". " + almacenamientoLugar[i].getComunidad().NameProducto();
                }

            }

        }

        return list;

    }
	
	public boolean eliminarProducto(String nombreComunidad, String nombreProducto) {

		comunidad temporal = buscarComunidad(nombreComunidad);

		return temporal.eliminarProducto(nombreProducto);

	}
	
	
	
	public String listaEspecies(){

        String list = "";

        for (int i = 0; i < almacenamientoLugar.length; i++) {

            if (almacenamientoLugar[i] != null) {

                if (almacenamientoLugar[i].nombreEspecie() != null){

                    list += "\n" + (i + 1) + ". " + almacenamientoLugar[i].nombreEspecie();
                }

            }

        }

        return list;

    }
	
	public boolean modificarNombreEspecie(String nombreLugar, String nombreEspecie, String nuevoNombre) {

		lugar temporal = buscarLugar(nombreLugar);

		boolean flag = temporal.comprobarNombre(nuevoNombre);

		if (flag) {

			temporal.buscarEspecie(nombreEspecie).setNombre(nuevoNombre);
			return true;
		} else {

			return false;

		}

	}
	
	public boolean modificarTipo(String nombreLugar, String nombreEspecie, int nuevoTipo) {

		lugar temporal = buscarLugar(nombreEspecie);
		temporal.modificarTipo(nombreEspecie, nuevoTipo);
		return true;
	}
	

	public boolean modificarFoto(String nombreLugar, String nombreEspecie, String nuevaFoto) {

			lugar temporal = buscarLugar(nombreLugar);

			temporal.buscarEspecie(nombreEspecie).setFoto(nuevaFoto);
			return true;
	}
	
	public boolean modificarFoto(String nombreLugar, String nombreEspecie, int nuevaCant) {

			lugar temporal = buscarLugar(nombreLugar);

			temporal.buscarEspecie(nombreEspecie).setCant(nuevaCant);
			
			return true;
	}
	
	
	
	public String consutlarLugar(String nombreLugar){
		
		lugar temporal = buscarLugar(nombreLugar);
			
		if(temporal!=null){
			return temporal.toString();
		}else{
			return "no se encontro el lugar";
		}
	}		
	
	public String consultarComunidadApartamento(int depart){
		
		departamento nuevoDepartamento = departamento.CHOCO;
		
		String msg = "";
		
		switch(depart){
			
			case 1:
			nuevoDepartamento = departamento.CHOCO;
			break;
			
			case 2:
			nuevoDepartamento = departamento.VALLE;
			break;
			
			case 3:
			nuevoDepartamento = departamento.CAUCA;
			break;
			
			case 4:
			nuevoDepartamento = departamento.NARINO;
			break;
		}
		
		for( int i =0; i<almacenamientoLugar.length; i++){
			
			
			if(almacenamientoLugar[i] != null){
				
				if(almacenamientoLugar[i].getComunidad()!=null){
					
					if(almacenamientoLugar[i].getDepartamento()==nuevoDepartamento){
						
						return msg+almacenamientoLugar[i].getComunidad().toString();
					}
					
					
				}
				
			}
			
		}
		
		return msg;
		
		
	}
	
	public String consultarComunidadesProblema(){
		
		String msg = "";
		
		
		for( int i =0; i<almacenamientoLugar.length; i++){
			
			
			if(almacenamientoLugar[i] != null){
				
				if(almacenamientoLugar[i].getComunidad()!=null){
					
					if(almacenamientoLugar[i].getComunidad().getProblemas()==mayoresProblemas.FALTA_DE_HOSPITAL || almacenamientoLugar[i].getComunidad().getProblemas()==mayoresProblemas.FALTA_DE_ESCUELA){
						
						return msg+almacenamientoLugar[i].getComunidad().toString();
					}
					
					
				}
				
			}
			
		}
		
		return msg;
	}
	
	public String lugarConMasEspecies() {
		int maxEspecies = 0;
		String lugarConMasEspecies = "";
		
			for (lugar lugar : almacenamientoLugar) {
				if (lugar != null) {
				int cuentaEspecies = lugar.cantEspecies();
				if (cuentaEspecies > maxEspecies) {
				maxEspecies = cuentaEspecies;
				lugarConMasEspecies = lugar.getNombreLugar();
					}
				}
			}
			
		return lugarConMasEspecies;
	}
	
	 public String LugaresMasGrandes() {
                lugar[] lugaresMasGrandes = new lugar[3];
            
                for (int i = 0; i < almacenamientoLugar.length; i++) {
                    lugar lugarActual = almacenamientoLugar[i];
                    if (lugarActual != null) {
                        for (int j = 0; j < lugaresMasGrandes.length; j++) {
                            if (lugaresMasGrandes[j] == null || lugarActual.getArea() > lugaresMasGrandes[j].getArea()) {
                                
                                for (int k = lugaresMasGrandes.length - 1; k > j; k--) {
                                    lugaresMasGrandes[k] = lugaresMasGrandes[k - 1];
                                }
                                lugaresMasGrandes[j] = lugarActual;
                                break; 
                            }
                        }
                    }
                }
           
                StringBuilder result = new StringBuilder();
                for (int i = 0; i < lugaresMasGrandes.length; i++) {
                    if (lugaresMasGrandes[i] != null) {
                        result.append(i + 1).append(". nombre: ").append(lugaresMasGrandes[i].getNombreLugar()).append(", area en kilometros: ").append(lugaresMasGrandes[i].getArea()).append("\n");
                    }
                }
            
                return result.toString();
            }
	
}