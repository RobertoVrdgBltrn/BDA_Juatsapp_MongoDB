/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * Clase donde se crearan los Mensajes, mismos que se almacenaran en la bd de
 * MongoDB.
 *
 * @author rober
 */
public class Mensaje {

    private ObjectId id;
    private ObjectId idEmisor;
    private String contenido;
    private Date fechaEnvio;

    public Mensaje() {
    }

    public Mensaje(ObjectId idEmisor, String contenido, Date fechaEnvio) {
        this.idEmisor = idEmisor;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }

    public Mensaje(ObjectId id, ObjectId idEmisor, String contenido, Date fechaEnvio) {
        this.id = id;
        this.idEmisor = idEmisor;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getIdEmisor() {
        return idEmisor;
    }

    public void setIdEmisor(ObjectId idEmisor) {
        this.idEmisor = idEmisor;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "id=" + id + ", idEmisor=" + idEmisor + ", contenido=" + contenido + ", fechaEnvio=" + fechaEnvio + '}';
    }

}
