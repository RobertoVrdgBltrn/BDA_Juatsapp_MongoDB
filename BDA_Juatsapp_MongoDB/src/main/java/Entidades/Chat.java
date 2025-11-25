/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class Chat {

    private ObjectId id;
    private List<ObjectId> participantes;
    private List<Mensaje> mensajes;

    public Chat() {
    }

    public Chat(List<ObjectId> participantes, List<Mensaje> mensajes) {
        this.participantes = participantes;
        this.mensajes = mensajes;
    }

    public Chat(ObjectId id, List<ObjectId> participantes, List<Mensaje> mensajes) {
        this.id = id;
        this.participantes = participantes;
        this.mensajes = mensajes;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public List<ObjectId> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List<ObjectId> participantes) {
        this.participantes = participantes;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "Chat{" + "id=" + id + ", participantes=" + participantes + ", mensajes=" + mensajes + '}';
    }

}
