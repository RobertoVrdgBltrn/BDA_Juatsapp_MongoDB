/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 * Representa un chat dentro del sistema. Cada chat contiene una lista de
 * participantes identificados por su ObjectId y una lista de mensajes
 * intercambiados. Esta entidad se almacena en la base de datos MongoDB.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class Chat {

    private ObjectId id;
    private List<ObjectId> participantes;
    private List<Mensaje> mensajes;

    /**
     * Constructor por defecto. Inicializa las listas de participantes y
     * mensajes.
     */
    public Chat() {
        this.participantes = new java.util.ArrayList<>();
        this.mensajes = new java.util.ArrayList<>();
    }

    /**
     * Constructor que crea un chat con los participantes especificados.
     *
     * @param participantes Lista de identificadores de los usuarios que
     * conforman el chat.
     */
    public Chat(List<ObjectId> participantes) {
        this.participantes = participantes;
        this.mensajes = new java.util.ArrayList<>();
    }

    /**
     * Constructor que inicializa un chat con participantes y mensajes.
     *
     * @param participantes Lista de participantes del chat.
     * @param mensajes Lista de mensajes existentes en el chat.
     */
    public Chat(List<ObjectId> participantes, List<Mensaje> mensajes) {
        this.participantes = participantes;
        this.mensajes = mensajes;
    }

    /**
     * Constructor completo para inicializar todos los atributos del chat.
     *
     * @param id Identificador único del chat.
     * @param participantes Lista de participantes.
     * @param mensajes Lista de mensajes del chat.
     */
    public Chat(ObjectId id, List<ObjectId> participantes, List<Mensaje> mensajes) {
        this.id = id;
        this.participantes = participantes;
        this.mensajes = mensajes;
    }

    /**
     * Obtiene el identificador del chat.
     *
     * @return ObjectId del chat.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el identificador del chat.
     *
     * @param id Nuevo ObjectId para el chat.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene la lista de participantes.
     *
     * @return Lista de ObjectId de los participantes del chat.
     */
    public List<ObjectId> getParticipantes() {
        return participantes;
    }

    /**
     * Establece la lista de participantes del chat.
     *
     * @param participantes Nueva lista de ObjectId.
     */
    public void setParticipantes(List<ObjectId> participantes) {
        this.participantes = participantes;
    }

    /**
     * Obtiene la lista de mensajes del chat.
     *
     * @return Lista de mensajes del chat.
     */
    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    /**
     * Establece la lista de mensajes del chat.
     *
     * @param mensajes Nueva lista de mensajes.
     */
    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    /**
     * Devuelve una representación en texto del chat.
     *
     * @return Cadena con los atributos del chat.
     */
    @Override
    public String toString() {
        return "Chat{"
                + "id=" + id
                + ", participantes=" + participantes
                + ", mensajes=" + mensajes
                + '}';
    }
}
