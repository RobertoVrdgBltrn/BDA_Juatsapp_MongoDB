/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Chat;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase interface donde se estableceran los metodos que utlizaran en la clase
 * ChatDAO
 *
 * @author Roberto Verdugo y Angel Servin
 */
public interface IChatDAO {

    /**
     * Metodo para insertar un chat nuevo.
     *
     * @param chat
     */
    void insertar(Chat chat);

    /**
     * Metodo para obtener un chat mediante su id.
     *
     * @param id
     * @return
     */
    Chat obtenerPorId(ObjectId id);

    /**
     * Metodo para agregar participantes a un chat nuevo.
     *
     * @param chatId
     * @param idUsuario
     */
    void agregarParticipante(ObjectId chatId, ObjectId idUsuario);

    /**
     * Metodo para obtener los chats de un usuario mediante su id.
     *
     * @param idUsuario
     * @return
     */
    List<Chat> obtenerChatsDeUsuario(ObjectId idUsuario);

    /**
     * Metodo para obtener el chat mediante los id's de los 2 participantes.
     *
     * @param idU1
     * @param idU2
     * @return
     */
    Chat obtenerChatPorParticipantes(ObjectId idU1, ObjectId idU2);

    /**
     * Metodo para obtener todos los chats.
     *
     * @return
     */
    List<Chat> obtenerTodos();
}
