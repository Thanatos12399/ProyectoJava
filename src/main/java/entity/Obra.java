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
public class Obra {
    private long pid;
    private String titulo;
    private Calendar fecha;
    private Double precioRef;
    private String dimensiones;
    private ArrayList <Artista> artistas;

    public long getPid() {
        return pid;
    }

    public Obra() {
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(int año,int mes, int dia) {
        this.fecha=new GregorianCalendar();
        this.fecha.set(año, mes, dia);
       
       
    }

    public Double getPrecioRef() {
        return precioRef;
    }

    public void setPrecioRef(Double precioRef) {
        this.precioRef = precioRef;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Obra(long pid, String titulo, Calendar fecha, Double precioRef, String dimensiones) {
        this.pid = pid;
        this.titulo = titulo;
        this.fecha = fecha;
        this.precioRef = precioRef;
        this.dimensiones = dimensiones;
        this.artistas= new ArrayList<>();
     
    }

    @Override

    
    public String toString() {
        return "Obra{" + "titulo=" + titulo + ", precioRef=" + precioRef + ", dimensiones=" + dimensiones + '}';
    }
  

   
   
    
    
    
    
    
}
