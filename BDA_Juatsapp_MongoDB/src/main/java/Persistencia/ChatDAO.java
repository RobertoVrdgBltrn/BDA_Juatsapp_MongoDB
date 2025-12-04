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
 * Clase donde se establecen los metodos que se utilizaran para la entidad
 * "chats" en la bd.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class ChatDAO implements IChatDAO {

    private MongoCollection<Chat> coleccion;

    /**
     * Contructor con la base de datos enlazada.
     *
     * @param database
     */
    public ChatDAO(MongoDatabase database) {
        this.coleccion = database.getCollection("chats", Chat.class);
    }

    /**
     * Metodo para insertar un chat nuevo
     *
     * @param chat recibe los atributos del chat para que se agregen a mongoDB.
     */
    @Override
    public void insertar(Chat chat) {
        coleccion.insertOne(chat);
    }

    /**
     * Metodo para ingresar un participante al chat.
     *
     * @param chatId recibe el id del chat.
     * @param idUsuario recibe el id del usuario, que es ingresado al chat.
     */
    @Override
    public void agregarParticipante(ObjectId chatId, ObjectId idUsuario) {
        coleccion.updateOne(
                Filters.eq("_id", chatId),
                Updates.addToSet("participantes", idUsuario)
        );
    }

    /**
     * Metodo para obtener los chats del usuario mediante su id.
     *
     * @param idUsuario recibe el id del usuario.
     * @return los chats del usuario mediante una consulta a la bd.
     */
    @Override
    public List<Chat> obtenerChatsDeUsuario(ObjectId idUsuario) {
        return coleccion.find(Filters.in("participantes", idUsuario)).into(new ArrayList<>());
    }

    /**
     * Metodo para obtener el chat mediante su id
     *
     * @param id recibe el id del chat
     * @return los datos del chat consultado.
     */
    @Override
    public Chat obtenerPorId(ObjectId id) {
        Bson filtro = Filters.eq("_id", id);
        return coleccion.find(filtro).first();
    }

    /**
     * Metodo para obtener todos los chats
     *
     * @return informacion de todos los chats de la bd.
     */
    @Override
    public List<Chat> obtenerTodos() {
        return coleccion.find().into(new ArrayList<>());
    }

    /**
     * Metodo para buscar un chat mediante los id's de los 2 participantes.
     *
     * @param idU1 recibe el id de un participante.
     * @param idU2 recibe el id de otro participante.
     * @return los datos del chat consultado.
     */
    @Override
    public Chat obtenerChatPorParticipantes(ObjectId idU1, ObjectId idU2) {
        return coleccion.find(
                Filters.all("participantes", idU1, idU2)
        ).first();
    }

}
