/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Chat;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rober
 */
public class ChatDAO implements IChatDAO {

    private MongoCollection<Chat> coleccion;

    public ChatDAO(MongoCollection coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public void insertar(Chat chat) {
        coleccion.insertOne(chat);
    }

    @Override
    public Chat obtenerPorId(String id) {
        return coleccion.find(Filters.eq("_id", id)).first();
    }

    @Override
    public void agregarParticipante(String chatId, String telefonoUsuario) {
        coleccion.updateOne(
                Filters.eq("_id", chatId),
                Updates.addToSet("participantes", telefonoUsuario)
        );
    }

    @Override
    public List<Chat> obtenerChatsDeUsuario(String telefono) {
        return coleccion.find(Filters.in("participantes", telefono)).into(new ArrayList<>());
    }

}
