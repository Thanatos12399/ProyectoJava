
package control;

import entity.Artista;
import entity.Obra;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author Camilo
 */
public class GestionObras {
    
    public GestionObras(){
        
    }

    public ArrayList<Obra> GestionarObras() {

        Obra obra1 = new Obra(6341485, "La Mona Lisa",null, 500000000.00, "120-150");
        obra1.setFecha(2020, 6, 15);
        Obra obra2 = new Obra(2214741, "La ronda de Noche", null, 90000.00, "130-150");
        obra2.setFecha(2015,4,23);
        Obra obra3 = new Obra(5582984, "El nacimiento de Venus", null, 58600000.00, "110-150");
        obra3.setFecha(1998, 06, 23);
        Obra obra4 = new Obra(9274841, "La noche estrellada", null, 50585900000.00, "100-150");
        obra4.setFecha(1545, 11,2);
        ArrayList<Obra> temp = new ArrayList<>();
        temp.add(obra1);
        temp.add(obra2);
        temp.add(obra3);
        temp.add(obra4);
        return temp;
    }

    public ArrayList<Artista>  GestionObras(){
        Artista artista1 = new Artista(2134545,1019132035,"PEPE","BUENDIA",null,4225132);
        artista1.setFechaNacimiento(1996,12,28);
        Artista artista2 = new Artista(2141313,1019132036,"REMBRANDT","MEYOR",null,4225532);
        artista2.setFechaNacimiento(1984,12,18);
        Artista artista3 = new Artista(2141417,1019532036,"SANDRO","BOTTICELLI",null,4224532);
        artista3.setFechaNacimiento(1951,11,26);
        Artista artista4 = new Artista(2142417,1029532036,"PABLO","PICASSO",null,4234532);
        artista4.setFechaNacimiento(1948,10,26);
        ArrayList<Artista> artistasTemp = new ArrayList<>();
        artistasTemp.add(artista1);
        artistasTemp.add(artista2);
        artistasTemp.add(artista3);
        artistasTemp.add(artista4);
        return artistasTemp;
    }


    public boolean verListaObras(ArrayList<Obra> obras) {
        if (obras.isEmpty()) {
            System.out.println("Lista vacia");
            return false;
        } else {
            int i = 1;
            for (Obra obr : obras) {
                System.out.println("Obra " + i + " :");
                System.out.println("Pid :" + obr.getPid());
                System.out.println("Titulo :" + obr.getTitulo());
                System.out.println("Fecha :" + obr.getFecha());
                System.out.println("Precio :" + obr.getPrecioRef());
                System.out.println("Precio :" + obr.getPrecioRef() + "\n");
                i++;
            }
        }
        return true;
    }

    public boolean Buscar(ArrayList<Obra> obras, ArrayList<Artista> artistas) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por que metodo desea buscar:");
        System.out.println("1. Titulo.");
        System.out.println("2. Artista.");
        System.out.println("3. Año");
        System.out.println("4. Salir");
        System.out.println("Digite el numero que desea ingresar");
        int numer = scanner.nextInt();
        switch (numer) {
            case 1:
                System.out.println("Que titulo desea buscar");
                String titulo = scanner.nextLine();
                for(Obra aux: obras){
                
                if (aux.getTitulo().contains(titulo)) {
                    System.out.println("Si se encuentra la obra");
                }else 
                     System.out.println("No se encuentra la obra");
                }
                break;
                
            
                case 2:
                System.out.println("Que Artista desea buscar");
                String artista = scanner.nextLine();
                for(Artista aux: artistas){
                
                if (aux.getNombres().contains(artista)) {
                    System.out.println("Si se encuentra el artista");
                    for(Obra ob: aux.getObras()) {
                        System.out.println(ob.toString());
                    }
                }else 
                    System.out.println("No se encuentra el artista");
              
                }
                break;
            case 3:
                ArrayList<Obra> obray= new ArrayList<>();
                System.out.println("Ingrese el año de la obra que desea buscar:");
                System.out.println("Ingrese año:");
                int anio=scanner.nextInt();
                for(Obra aux: obras) {

                    if (aux.getFecha().get(Calendar.YEAR) == (anio)) {
                        obray.add(aux);

                    }
                }
                for(Obra aux2: obray){
                    System.out.println("Titulo"+aux2.getTitulo());
                    System.out.println("anho"+aux2.getFecha().get(Calendar.YEAR));
                }
                if(obray.isEmpty())
                {
                    System.out.println("no se encontraron obras en este año");
                }
                break;
      
 
            default:
                System.out.println("No selecciono una opcion valida");
                return false;
               
        }
        return false;
    


    }

}




