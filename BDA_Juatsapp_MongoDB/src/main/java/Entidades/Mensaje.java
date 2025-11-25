/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class Mensaje {

    private String texto;
    private ObjectId emisor;
    private Date fecha;

    public Mensaje() {
    }

    public Mensaje(String texto, ObjectId emisor, Date fecha) {
        this.texto = texto;
        this.emisor = emisor;
        this.fecha = fecha;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ObjectId getEmisor() {
        return emisor;
    }

    public void setEmisor(ObjectId emisor) {
        this.emisor = emisor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "texto=" + texto + ", emisor=" + emisor + ", fecha=" + fecha + '}';
    }

}
