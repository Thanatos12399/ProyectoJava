/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Camilo
 */
public class Artista {
    private long codigoArtista;
    private long cedula;
    private String nombres;
    private String apellidos;
    private Calendar fechaNacimiento;
    private long telefono;
    private ArrayList <Obra> obras;

    public ArrayList<Obra> getObras() {
        return obras;
    }

    public long getCodigoArtista() {
        return codigoArtista;
    }

    public void setCodigoArtista(long codigoArtista) {
        this.codigoArtista = codigoArtista;
    }

    public long getCedula() {
        return cedula;
    }

    public void setCedula(long cedula) {
        this.cedula = cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int año, int mes, int dia) {
         this.fechaNacimiento=new GregorianCalendar();
        this.fechaNacimiento.set(año, mes, dia);
      
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Artista(long codigoArtista, long cedula, String nombres,String apellidos,Calendar fechaNacimeinto,long telefono) {
        this.codigoArtista = codigoArtista;
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimeinto;
        this.telefono = telefono;
        this.obras= new ArrayList<>();
    }
    
    
}
