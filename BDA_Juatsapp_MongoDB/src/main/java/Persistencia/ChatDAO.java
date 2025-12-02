/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Chat;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class ChatDAO implements IChatDAO {

    private MongoCollection<Chat> coleccion;

    public ChatDAO(MongoDatabase database) {
        this.coleccion = database.getCollection("chats", Chat.class);
    }

    @Override
    public void insertar(Chat chat) {
        coleccion.insertOne(chat);
    }

    @Override
    public void agregarParticipante(ObjectId chatId, ObjectId idUsuario) {
        coleccion.updateOne(
                Filters.eq("_id", chatId),
                Updates.addToSet("participantes", idUsuario)
        );
    }

    @Override
    public List<Chat> obtenerChatsDeUsuario(ObjectId idUsuario) {
        return coleccion.find(Filters.in("participantes", idUsuario)).into(new ArrayList<>());
    }

    @Override
    public Chat obtenerPorId(ObjectId id) {
        Bson filtro = Filters.eq("_id", id);
        return coleccion.find(filtro).first();
    }

    @Override
    public List<Chat> obtenerTodos() {
        return coleccion.find().into(new ArrayList<>());
    }

    @Override
    public Chat obtenerChatPorParticipantes(ObjectId idU1, ObjectId idU2) {
        return coleccion.find(
                Filters.all("participantes", idU1, idU2)
        ).first();
    }

}
