/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import entity.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Camilo
 */
public class GestionCliente {
    
    public ArrayList<Cliente> GestionarClientes() {
        
        Cliente cnt1 = new Cliente(234567,422739,"SAUL","PERAZA","CALLE4#45-67",6578900);
        Cliente cnt2 = new Cliente(235678,41536570,"ROSA","OVALLE","CALLE76#4-67",5578909);
        Cliente cnt3 = new Cliente(42727,561536570,"LAURA","RIOS","CALLE100#64-67",5568980);
        Cliente cnt4 = new Cliente(13345,79557983,"LUIS","PEDRAZA","CALLE103#45-67",6261567);
        ArrayList<Cliente> temp = new ArrayList<>();
        temp.add(cnt1);
        temp.add(cnt2);
        temp.add(cnt3);
        temp.add(cnt4);
        
        return temp;
        
    }  
        
    
        
        
   
}
