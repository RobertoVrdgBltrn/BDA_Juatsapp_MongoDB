/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 * Representa un mensaje enviado dentro de un chat. Cada mensaje contiene
 * información del emisor, su contenido y la fecha en que fue enviado. Esta
 * entidad se almacena dentro de MongoDB como parte de un Chat.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class Mensaje {

    private ObjectId id;
    private ObjectId idEmisor;
    private String contenido;
    private Date fechaEnvio;

    /**
     * Constructor por defecto. Crea un mensaje vacío.
     */
    public Mensaje() {
    }

    /**
     * Constructor que inicializa un mensaje sin especificar ID.
     *
     * @param idEmisor Identificador del usuario que envió el mensaje.
     * @param contenido Texto del mensaje enviado.
     * @param fechaEnvio Fecha y hora en que se envió el mensaje.
     */
    public Mensaje(ObjectId idEmisor, String contenido, Date fechaEnvio) {
        this.idEmisor = idEmisor;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * Constructor que inicializa todos los atributos del mensaje.
     *
     * @param id Identificador único del mensaje en la base de datos.
     * @param idEmisor Identificador del usuario que envió el mensaje.
     * @param contenido Texto del mensaje enviado.
     * @param fechaEnvio Fecha y hora en que se envió el mensaje.
     */
    public Mensaje(ObjectId id, ObjectId idEmisor, String contenido, Date fechaEnvio) {
        this.id = id;
        this.idEmisor = idEmisor;
        this.contenido = contenido;
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * Obtiene el identificador del mensaje.
     *
     * @return ID del mensaje.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del mensaje.
     *
     * @param id Nuevo valor del ID del mensaje.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el ID del usuario que envió el mensaje.
     *
     * @return ID del emisor.
     */
    public ObjectId getIdEmisor() {
        return idEmisor;
    }

    /**
     * Establece el ID del usuario que envió el mensaje.
     *
     * @param idEmisor Identificador del emisor del mensaje.
     */
    public void setIdEmisor(ObjectId idEmisor) {
        this.idEmisor = idEmisor;
    }

    /**
     * Obtiene el contenido textual del mensaje.
     *
     * @return Texto del mensaje.
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Establece el contenido textual del mensaje.
     *
     * @param contenido Texto que representará el mensaje.
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Obtiene la fecha en la que el mensaje fue enviado.
     *
     * @return Fecha de envío.
     */
    public Date getFechaEnvio() {
        return fechaEnvio;
    }

    /**
     * Establece la fecha de envío del mensaje.
     *
     * @param fechaEnvio Nueva fecha del mensaje.
     */
    public void setFechaEnvio(Date fechaEnvio) {
        this.fechaEnvio = fechaEnvio;
    }

    /**
     * Devuelve una representación en texto del mensaje.
     *
     * @return Cadena con los valores del mensaje.
     */
    @Override
    public String toString() {
        return "Mensaje{"
                + "id=" + id
                + ", idEmisor=" + idEmisor
                + ", contenido=" + contenido
                + ", fechaEnvio=" + fechaEnvio
                + '}';
    }
}
