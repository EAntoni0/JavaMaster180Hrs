package com.poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------------");
        System.out.println("# Bienvenido a la tienda de productos electrónicos #".toUpperCase());
        System.out.println("-------------------------------------------------------------------");

        int numeroOrdenes = 3;

        OrdenCompra[] ordenes = new OrdenCompra[numeroOrdenes];

        for (int i = 0; i < numeroOrdenes; i++) {
            System.out.println("ingrese el nombre del cliente " + (i + 1) + ":");
            String nombreCliente = scanner.nextLine();
            System.out.println("ingrese el apellido del cliente " + (i + 1) + ":");
            String apellidoCliente = scanner.nextLine();
            // Crear un objeto de la clase Cliente
            Cliente cliente = new Cliente(nombreCliente, apellidoCliente);

            // Crear un objeto de la clase OrdenCompra
            OrdenCompra ordenCompra = new OrdenCompra(
                    "Orden de compra de " + cliente.getNombre() + " " + cliente.getApellido());

            ordenCompra.setCliente(cliente);
            ordenCompra.setFecha(new java.util.Date());

            // Agregar productos a la orden de compra
            for (int j = 0; j < ordenCompra.getProductos().length; j++) {
                System.out.println("Ingrese el nombre del producto " + (j + 1) + ":");
                String nombreProducto = scanner.nextLine();
                System.out.println("Ingrese el fabricante del producto " + (j + 1) + ":");
                String fabricanteProducto = scanner.nextLine();
                System.out.println("Ingrese el precio del producto " + (j + 1) + ":");
                double precioProducto = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto
                ordenCompra.agregarProducto(new Producto(fabricanteProducto, nombreProducto, precioProducto));

            }

            ordenes[i] = ordenCompra;

        }

        // Mostrar el resumen de la orden de compra

        for (int i = 0; i < ordenes.length; i++) {
            System.out.println("Descripcion: " + ordenes[i].getDescripcion());
            System.out.println("No. de Orden: " + ordenes[i].getIdentificador());
            System.out.println("Cliente: " + ordenes[i].getCliente().getNombre() + " "
                    + ordenes[i].getCliente().getApellido());
            System.out.println("Fecha: " + ordenes[i].getFecha());
            System.out.println("Productos:");
            for (Producto producto : ordenes[i].getProductos()) {
                if (producto != null) {
                    System.out.println("- " + producto.getNombre() + " (" + producto.getFabricante() + ") - $"
                            + producto.getPrecio());
                }
            }

            System.out.println("\ntotal: $"
                    + (ordenes[i].totalOrdenCompra()));
            System.out.println("-------------------------------------------------------------------");

        }

    }
}