package PPaqueteClases;

import java.util.ArrayList;

public class Pedido {
	private int id; 
	private String estado;
	private Cliente cliente; 
	private Repartidor repartidor; 
	private ArrayList<Producto> listaProductos; 
	

    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.estado = "pendiente";
        this.cliente = cliente;
        this.repartidor = null;
        this.listaProductos = new ArrayList<>();
        
    }
    
    //agrega producto y verifica que no exista
    public void agregaProducto(Producto nuevoProducto) {
    	boolean yaExiste=false;
    	
    	for(int i=0; i<listaProductos.size();i++) {
    		if(listaProductos.get(i).getNombre().equals(nuevoProducto.getNombre())) {
    			yaExiste=true;
    			break; 
    		}
    	}
    	
    	if(yaExiste==true) {
    		System.out.println("Error el Producto:"+nuevoProducto.getNombre()+" ya Existe");
    	}else {
    		listaProductos.add(nuevoProducto);
    		System.out.println("Producto:"+nuevoProducto.getNombre()+" ha sido ingresado con Exito :)");
    	}
    	
    }
    
    
    public double calcularTotal() {
    	double total=0; 
    		for(int i=0; i <listaProductos.size();i++) {
    			total=total+listaProductos.get(i).getPrecio();    			
    		}
    	return total; 
    }
    
    
    public void asignarRepartidor(Repartidor nuevoRepartidor ) {
    	if(nuevoRepartidor.isDisponibilidad()==false) {
    		System.out.println("Error: Repartidor Ocupado");
    		return; 
    	}else if(listaProductos.isEmpty()==true) {
    		System.out.println("Error: No hay productos en el Pedido");
    		return;
    	}
    		//todo verficado
        	//pasamos a poner el nuevoRepartidor a repartidor y tambien el estado del pedido lo pasamos a Reparto 
        	// y el repartidor a "Ocupado" que es el false de disponibilidad 
        	repartidor=nuevoRepartidor; 
        	estado= "En Reparto";
        	repartidor.setDisponibilidad(false);
        	
    	
    	
    	//- Y decimos por pantalla que ya todo esta configurado
    	System.out.println("Repartidor:"+ repartidor.getNombre()+" se le ha Asignado su Producto.");
    	System.out.println("ID del Pedido: "+id);
    	
    	System.out.println("Productos que estan el Pedido:");
    	for(int i=0;i<listaProductos.size();i++) {
    		System.out.println((i+1)+ "º Producto:"+listaProductos.get(i).getNombre()+ " Precio:"+listaProductos.get(i).getPrecio()+ "Categoria: "+listaProductos.get(i).getCategoria());	
    	}
    }
    
    public void entregarPedido() {
    	if(estado.equals("En Reparto")) {
    		estado="Entregado";
    		repartidor.setDisponibilidad(true);
    		System.out.println("Pedido con el ID:"+ id+" Entregado Con Exito");
    		
    	}else {
    		System.out.println("Error: No se puede entregar un pedido que no está en reparto.");
    	}
    }
    
    
    
    
    
    
	
	
	
	
}
