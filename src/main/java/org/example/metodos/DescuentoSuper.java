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
    //y total a pagar
    System.out.println("Nombre de Cliente: ");
    String nombreCliente = scanner.nextLine();
    System.out.println("Producto: ");
    String producto = scanner.nextLine();
    System.out.println("Precio: ");
    Double precioProducto = scanner.nextDouble();
    scanner.nextLine();
    System.out.println("Cantidad: ");
    Double cantidadProducto = scanner.nextDouble();
    System.out.println("---------------------------");
    System.out.println("Total: " + (precioProducto * cantidadProducto));
    System.out.println("---------------------------");


}
    // método 20% descuento para compra > 1000
    public void descuento(){
    DescuentoSuper descuentoSuper = new DescuentoSuper();

    }


    public static void main(String[] args) {
        DescuentoSuper cuenta = new DescuentoSuper();
        cuenta.datosCliente();
    }



}
