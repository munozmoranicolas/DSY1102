/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sce;

/**
 *
 * @author munoz
 */
public class SCE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Electronico electronico1 = new Electronico("Midea", 12, "E0001", "Microhondas", 15000);
        Ropa ropa1 = new Ropa("L", "Rojo", "R0001", "Polera", 12000);
        
        System.out.println(electronico1.calcularDescuento(1000));
        System.out.println(ropa1.calcularDescuento(1000));
        
        Cliente cliente1 = new Cliente("C0001", "Juan");
        
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        
        pedido1.agregarProducto(ropa1);
        pedido1.agregarProducto(electronico1);
        
        pedido2.agregarProducto(ropa1);
        pedido2.agregarProducto(electronico1);
        pedido2.agregarProducto(electronico1);
        
        cliente1.agregarPedido(pedido1);
        cliente1.agregarPedido(pedido2);
        
        for(Pedido pedido : cliente1.getPedidosRealizados()){
            System.out.println("Total Pedido "+pedido.toString()+ " " +pedido.calcularTotal());
        }        
        
    }
    
}
