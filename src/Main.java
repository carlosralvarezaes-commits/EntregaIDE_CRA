	import PPaqueteClases.Cliente;
	import PPaqueteClases.Producto;
	import PPaqueteClases.Repartidor;
	import PPaqueteClases.Pedido;


public class Main {
    public static void main(String[] args) {
        // 1. Creamos usuarios
        Cliente cliente1 = new Cliente("Ana", "ana@mail.com", 111222333);
        Repartidor repartidor1 = new Repartidor("Carlos", "carlos@mail.com", 999888777, "Norte");

        // 2. Creamos productos
        Producto pizza = new Producto("Pizza Margarita", 10.50, "Comida");
        Producto agua = new Producto("Agua Mineral", 1.50, "Bebida");
        
        // 3. Creamos un pedido (¡Ahora nace vacío y sin repartidor!)
        Pedido miPedido = new Pedido(13, cliente1);

        System.out.println("--- PRUEBA 1: Asignar sin productos ---");
        // Esto ahora SÍ dará error porque la listaProductos nace vacía
        miPedido.asignarRepartidor(repartidor1);

        System.out.println("\n--- PRUEBA 2: Añadir productos y evitar duplicados ---");
        miPedido.agregaProducto(pizza);
        miPedido.agregaProducto(agua);
        miPedido.agregaProducto(pizza); // Este será el único que dará error de duplicado
        System.out.println("Total a pagar: " + miPedido.calcularTotal() + "€");

        System.out.println("\n--- PRUEBA 3: Entregar antes de tiempo ---");
        // Esto ahora SÍ dará error porque el estado es "pendiente"
        miPedido.entregarPedido();

        System.out.println("\n--- PRUEBA 4: Flujo correcto ---");
        miPedido.asignarRepartidor(repartidor1);
        System.out.println("¿Está libre Carlos? " + repartidor1.isDisponibilidad());
        
        miPedido.entregarPedido();
        System.out.println("¿Está libre Carlos ahora? " + repartidor1.isDisponibilidad());
    }
}