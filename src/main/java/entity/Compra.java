/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Calendar;

/**
 *
 * @author Camilo
 */
public class Compra {
    private long numeroPedido;
    private Calendar fechaRecibido;
    private boolean pagado;
    private String nombreRepartidor;
    private Obra compraObra;
    private Cliente compraCliente;

    public Compra(long numeroPedido){
        this.numeroPedido = numeroPedido;
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Calendar getFechaRecibido() {
        return fechaRecibido;
    }

    public void setFechaRecibido(Calendar fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public String getNombreRepartidor() {
        return nombreRepartidor;
    }

    public void setNombreRepartidor(String nombreRepartidor) {
        this.nombreRepartidor = nombreRepartidor;
    }

    public Obra getCompraObra() {
        return compraObra;
    }

    public void setCompraObra(Obra compraObra) {
        this.compraObra = compraObra;
    }

    public Compra(long numeroPedido, Calendar fechaRecibido, boolean pagado, String nombreRepartidor, Obra compraObra) {
        this.numeroPedido = numeroPedido;
        this.fechaRecibido = fechaRecibido;
        this.pagado = pagado;
        this.nombreRepartidor = nombreRepartidor;
        this.compraObra = compraObra;
    }
    
    
    
}
