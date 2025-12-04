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
 * Clase donde se establecen los metodos que se utilizaran para la entidad
 * "mensaje" en la bd.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class MensajeDAO implements IMensajeDAO {

    private final MongoCollection<Chat> coleccionChats;

    /**
     * Constructor vacio con la concexion a la bd.
     *
     * @param database
     */
    public MensajeDAO(MongoDatabase database) {
        this.coleccionChats = database.getCollection("chats", Chat.class);
    }

    /**
     * Metodo para insertar un mensaje al chat seleccionado.
     *
     * @param idChat recibe el id de chat a donde se le mandaran los mensajes.
     * @param mensaje un texto que seria el mensaje en si.
     */
    @Override
    public void insertar(ObjectId idChat, Mensaje mensaje) {
        coleccionChats.updateOne(
                Filters.eq("_id", idChat),
                Updates.push("mensajes", mensaje)
        );
    }

    /**
     * Metodo par obtener todos los mensajes del chat.
     *
     * @param idChat recibe el id del chat.
     * @return todos los mensajes de dicho chat.
     */
    @Override
    public List<Mensaje> obtenerMensajesDeChat(ObjectId idChat) {
        Chat chat = coleccionChats.find(Filters.eq("_id", idChat)).first();
        return chat != null ? chat.getMensajes() : new ArrayList<>();
    }

    /**
     * Metodo para obtener los mensajes de un chat
     *
     * @param idChat recibe el id del chat.
     * @return los mensajes de dicho chat.
     */
    @Override
    public List<Mensaje> obtenerPorChat(String idChat) {
        Chat chat = coleccionChats.find(Filters.eq("_id", new ObjectId(idChat))).first();
        return chat != null ? chat.getMensajes() : new ArrayList<>();
    }

}
