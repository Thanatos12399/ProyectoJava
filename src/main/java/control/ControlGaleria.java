/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Artista;
import entity.Cliente;
import entity.Compra;
import entity.Obra;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class ControlGaleria {
      
    private GestionObras gestionProductos;
    private GestionCliente gestionCliente;
    private ArrayList <Artista> listaArtistas;
    private ArrayList <Obra> listaObras;
    private ArrayList <Compra> compras;
    private ArrayList <Cliente> listaClientes;

    public ControlGaleria() {
        this.gestionProductos= new GestionObras();
        this.gestionCliente= new GestionCliente();
        this.listaArtistas= new ArrayList<>();
        this.listaObras=new ArrayList<>();
        this.compras=new ArrayList<>();
        this.listaClientes=new ArrayList<>();
        for (Obra n:this.gestionProductos.GestionarObras()) {
            this.listaObras.add(n);
        }
       listaClientes=this.gestionCliente.GestionarClientes();
       
       
    }
    public void insertar_obra(Obra ob){
        for(Obra aux:listaObras ){
            if(aux.getTitulo().contains(ob.getTitulo())&& aux.getPid()==ob.getPid()){
                System.out.println("No se puede agregar la obra porque ya existe");
            }else{
                listaObras.add(ob);
           }         
        }       
    }
    
   public boolean eliminar_obra(long codigo){
       for(Obra aux:listaObras){
           if(aux.getPid()==codigo){
               listaObras.remove(aux);
               return true;
           }
       }   
       return false;
   }
   
    public void lista_obras(){
      for(Obra obr:listaObras){
         System.out.println(obr.toString());
            
      }
     
           
     
  }
    
  public void lista_clientes(){
      for(Cliente cli:listaClientes){
          cli.toString();
      }
      
  }
  
  public void insertar_cliente(Cliente cl){
        for(Cliente aux:listaClientes){
            if(aux.getCedula()==cl.getCedula()){
                
                System.out.println("No se puede agregar el cliente porque ya existe");
            }else{
                listaClientes.add(cl);
           }         
        }       
    }
  
    public boolean eliminar_cliente(Long cedula){
        for(Cliente aux:listaClientes){
            if(aux.getCedula()==cedula){
                listaClientes.remove(aux);
               return true;
            }          
        }       
        return false;
      
    }

    public boolean realizarCompra(Long pid,Long codigoc){
        boolean aux1=false;
        boolean aux2=false;
        for(Cliente cl:listaClientes){
            if(cl.getCedula()==codigoc){
                aux1=true;
            }
        }
        for(Obra ob:listaObras){
            if(ob.getPid()==pid){
                aux2=true;
            }
        }
        if((aux1==true)&&(aux2==true)){
            int numero = (int) (Math.random() * 100) + 1;
            return true;
        }else
            return false;
    }


    public Cliente EliminarCliente() {
        Scanner scan = new Scanner(System.in);
        long numIdent;
        System.out.println("Ingrese el número de identificación del cliente a eliminar: ");
        numIdent = scan.nextLong();
        for (Cliente listaCliente : listaClientes) {
            if (listaCliente.getCedula() == numIdent) {
                listaClientes.remove(listaCliente);
                System.out.println("El cliente se ha eliminado de manera correcta.");
                return listaCliente;
            }
        }
        System.out.println("El cliente en cuestión no existe");
        return null;
    }
    
 public void buscar_obra(){

gestionProductos.Buscar(listaObras, listaArtistas);

}

    public Cliente modificarDatosCliente(ArrayList<Cliente> listaClientes) {
        long codCliente;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el número de identificacion del cliente:");
        codCliente = scan.nextLong();
        for (int i = 0; i < listaClientes.size(); i++) {
            if (listaClientes.get(i).getCodigoCliente() == codCliente) {
                listaClientes.toString();

                System.out.println("\nIngrese el dato que se quiere modificar:");
                System.out.println("1. Codigo Cliente");
                System.out.println("2. Cedula");
                System.out.println("3. Nombres");
                System.out.println("4. Apellidos");
                System.out.println("5. Direccion de entrega");
                System.out.println("6. Teléfono");
                int dato = scan.nextInt();

                switch (dato) {

                    case 1: {
                        System.out.println("Ingrese el nuevo valor del código del cliente:");
                        long aux = scan.nextLong();
                        for (Cliente listaCliente : listaClientes) {
                            if (listaCliente.getCodigoCliente() == aux) {
                                System.out.println("No puede asinar el mismo código a dos clientes");
                            } else {
                                this.listaClientes.get(i).setCodigoCliente(aux);
                            }
                        }
                    }

                    case 2: {
                        System.out.println("Ingrese el nuevo valor de la cedula:");
                        this.listaClientes.get(i).setCedula(scan.nextLong());
                    }

                    case 3: {
                        System.out.println("Ingrese el nuevo valor de los nombres:");
                        this.listaClientes.get(i).setNombres(scan.nextLine());
                    }
                    case 4: {
                        System.out.println("Ingrese el nuevo valor de los apellidos:");
                        this.listaClientes.get(i).setApellidos(scan.nextLine());
                    }
                    case 5: {
                        System.out.println("Ingrese el nuevo valor de la dirección de entrega");
                        this.listaClientes.get(i).setDireccionEntrega(scan.nextLine());
                    }
                    case 6: {
                        System.out.println("Ingrese el nuevo valor del teléfono");
                        this.listaClientes.get(i).setTelefono(scan.nextLong());
                    }
                }
            }
        }
        System.out.println("Cliente no existente");
        return null;
    }

}

    public boolean realizarCompra(Long pid,Long codigoc){
        boolean aux1=false;
        boolean aux2=false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el codigo de la obra");
        long pid=scan.nextLong();
        System.out.println("Ingrese el codigo del cliente");
        long cp=scan.nextLong();
        galer.galeria.realizarCompra(pid, cp);
        for(Cliente cl:listaClientes){
            if(cl.getCedula()==codigoc){
                aux1=true;
            }
        }
        for(Obra ob:listaObras){
            if(ob.getPid()==pid){
                aux2=true;
            }
        }
        if((aux1==true)&&(aux2==true)){
            int numero = (int) (Math.random() * 100) + 1;
            return true;
        }else
            return false;
    }
}
