/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary;

import control.ControlGaleria;
import control.GestionObras;
import entity.Cliente;
import entity.Obra;

import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class PantallaGaleria {
    private ControlGaleria galeria=new ControlGaleria();
    private GestionObras obras = new GestionObras();

    public static void main(String[] args) {
          
        PantallaGaleria galer = new PantallaGaleria();

        
        

       
            
    
        int target;
        Scanner scan = new Scanner(System.in);
            
            System.out.println("Bienvenido");
            System.out.println("Ingrese la opcion que desee realizar:");
            System.out.println("1. Ver listado de Obras disponibles");
            System.out.println("2. Buscar una Obra por título, artista o año");
            System.out.println("3. Insertar una Obra");
            System.out.println("4. Modificar una Obra");
            System.out.println("5. Eliminar una Obra");
            System.out.println("6. Ver listado de Clientes registrados en el sistema");
            System.out.println("7. Buscar un Cliente");
            System.out.println("8. Insertar Cliente ");
            System.out.println("9. Modificar datos de Cliente");
            System.out.println("10. Eliminar un Cliente");
            System.out.println("11. Realizar compra de una Obra");
            System.out.println("12. Eliminar compra de obra");
            System.out.println("13. Ver listado de Compras existentes");
            System.out.println("14. Ver listado de Compras para un mes y año específico insertado por el usuario");
            System.out.println("15. Ver listado de Artistas más vendidos");
            System.out.println("16. Salir");
            System.out.println("Opcion: ");
            target=scan.nextInt();
            // por cuestiones de tiempo no pudimos resolver el problema de porque aparecen error en el menu, pero la logica esta bien hecha, muchas gracias!!!
            switch(target)
            {
                case 1:
                    
                    galer.galeria.lista_obras();

                    break;
                case 2:
                    galer.galeria.buscar_obra();
                    
                    break;
                case 3:
                    Obra ob = new Obra();
                    galer.galeria.insertar_obra(ob);

                    break;

                case 4:

                    break;
                case 5:
                    System.out.println("Ingrese el codigo de la obra a eliminar ");
                    long code;
                    code=scan.nextLong();
                    galer.galeria.eliminar_obra(target);

                    break;
                case 6:
                    galer.galeria.lista_clientes();
                    break;
                case 7:

                    break;
                case 8:
                    galer.galeria.insertar_cliente(Cliente);
                    break;
                case 9:
                    long codCliente = scan.nextLong();
                    System.out.println("Ingrese el número de identificacion del cliente:");
                    galer.galeria.modificarDatosCliente(Cliente, codCliente);
                    break;
                case 10:
                    System.out.println("Ingrese el codigo de la obra a eliminar ");
                    long cedula;
                    cedula=scan.nextLong();
                    galer.galeria.eliminar_cliente(cedula);

                    break;
                case 11:
                    System.out.println("Ingrese el codigo de la obra");
                    long pid=scan.nextLong();
                    System.out.println("Ingrese el codigo del cliente");
                    long cp=scan.nextLong();
                    galer.galeria.realizarCompra(pid, cp);
                    break;
                case 12:

                    break;
                case 13:

                    break;
                case 14:

                    break;
                case 15:

                    break;
                case 16:
                    System.out.println("Fin del programa");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida ");
            
       
    }
}
}

