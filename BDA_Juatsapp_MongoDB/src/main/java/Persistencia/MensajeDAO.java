/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Chat;
import Entidades.Mensaje;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class MensajeDAO implements IMensajeDAO {

    private final MongoCollection<Chat> coleccionChats;

    public MensajeDAO(MongoDatabase database) {
        this.coleccionChats = database.getCollection("chats", Chat.class);
    }

    @Override
    public void insertar(ObjectId idChat, Mensaje mensaje) {
        coleccionChats.updateOne(
                Filters.eq("_id", idChat),
                Updates.push("mensajes", mensaje)
        );
    }

    @Override
    public List<Mensaje> obtenerMensajesDeChat(ObjectId idChat) {
        Chat chat = coleccionChats.find(Filters.eq("_id", idChat)).first();
        return chat != null ? chat.getMensajes() : new ArrayList<>();
    }

    @Override
    public List<Mensaje> obtenerPorChat(String idChat) {
        Chat chat = coleccionChats.find(Filters.eq("_id", new ObjectId(idChat))).first();
        return chat != null ? chat.getMensajes() : new ArrayList<>();
    }
    
}
