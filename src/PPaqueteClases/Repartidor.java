package PPaqueteClases;

public class Repartidor extends Usuario{ 
	private String zonaDeRepartidor; 
	private boolean disponibilidad; 
	
	public Repartidor (String nombre,String email,int telefono,String zonaDeRepartidor) {
		super(nombre,email,telefono);
		this.zonaDeRepartidor=zonaDeRepartidor; 
		this.disponibilidad=true;
	}
	
	  public boolean isDisponibilidad() {
	        return disponibilidad;
	    }

	    public String getZonaDeRepartidor() {
	        return zonaDeRepartidor;
	    } 
	    
	    public void setDisponibilidad(boolean disponibilidad) {
	        this.disponibilidad = disponibilidad;
	    }
}
