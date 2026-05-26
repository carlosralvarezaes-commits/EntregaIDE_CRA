package PPaqueteClases;

public class Usuario {
	private String nombre; 
	private int telefono; 
	private String email; 
	
	public Usuario(String nombre,String email, int telefono ) {
		this.nombre=nombre; 
		this.email=email; 
		this.telefono=telefono; 
	}
	

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }
	
	
}
