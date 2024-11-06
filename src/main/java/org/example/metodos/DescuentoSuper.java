package org.example.metodos;

/*En un supermercado se hace un 20% de descuento a los clientes
cuya compra supere los 1000 en las áreas de frutas, verduras y abarrotes.
 ¿ Cual sera el total que pagara una persona por su compra ?,
 se debe mostrar el nombre del cliente , producto, precio , cantidad ,
 descuento y total a pagar….
 */

import java.util.Scanner;

public class DescuentoSuper {

    Scanner scanner = new Scanner(System.in);

public void datosCliente() {
    // datos compra: nombre cliente, producto, precio, cantidad, descuento
    System.out.println("Nombre de Cliente: ");
    String nombreCliente = scanner.nextLine();

    // defino los productos disponibles
    String[] productos ={"Agua", "Lechuga", "Calabacín", "Pan"};

    // muestro los productos disponibles para seleccionar recorriendo el array productos
    System.out.println("Selecciones el Producto: ");
    for (int i = 0; i < productos.length; i++ ){
        System.out.println((i + 1) + ". " + productos[i]);
    }

    //recojo la opcion seleccionada por el usuario
    int opcionProducto = scanner.nextInt();
    scanner.nextLine();

    //valido la opción seleccionada por el usuario
    String productoSeleccionado;
    if (opcionProducto > 0 && opcionProducto <= productos.length) {
        productoSeleccionado = productos[opcionProducto - 1];
    } else {
        System.out.println("Opción no válida. Seleccionando Agua por defecto.");
        productoSeleccionado = "Agua";
    }

    System.out.println("Producto seleccionado: " + productoSeleccionado);

    // Leer el precio y la cantidad del producto
    System.out.println("Precio: ");
    double precioProducto = scanner.nextDouble();
    System.out.println("Cantidad: ");
    double cantidadProducto = scanner.nextDouble();

    // Calcular el total
    double total = precioProducto * cantidadProducto;
    double totalConDescuento = calcularDescuento(total);

    // Mostrar los detalles de la compra
    System.out.println("---------------------------");
    System.out.println("Nombre de Cliente: " + nombreCliente);
    System.out.println("Producto: " + productoSeleccionado);
    System.out.println("Precio: " + precioProducto);
    System.out.println("Cantidad: " + cantidadProducto);
    System.out.println("Descuento aplicado: " + (total - totalConDescuento));
    System.out.println("Total a pagar: " + totalConDescuento);
    System.out.println("---------------------------");
}

    // Método para calcular el descuento si el total supera 1000
    public double calcularDescuento(double total) {
        if (total > 1000) {
            return total * 0.8; // Aplica un 20% de descuento
        } else {
            return total; // Sin descuento
        }
    }



    public static void main(String[] args) {
        DescuentoSuper cuenta = new DescuentoSuper();
        cuenta.datosCliente();
    }



}
