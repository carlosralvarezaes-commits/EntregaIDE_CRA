package PPaqueteClases;

import java.util.ArrayList;

public class Cliente extends Usuario{
	private ArrayList<Pedido> pedidosCliente;  
	
	
	public Cliente(String nombre,String email, int telefono) {
		super(nombre,email,telefono);
		this.pedidosCliente = new ArrayList<>();
	}
	
	public void agregarPedido(Pedido pedido) {
		pedidosCliente.add(pedido);
	}
	
	
}
