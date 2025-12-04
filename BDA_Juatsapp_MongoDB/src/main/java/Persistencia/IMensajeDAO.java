/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Mensaje;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * donde se estableceran los metodos que utlizaran en la clase MensajesDAO
 *
 * @author Roberto Verdugo y Angel Servin
 */
public interface IMensajeDAO {

    /**
     * Metodo para insertar un mensaje al chat.
     *
     * @param idChat.
     * @param mensaje.
     */
    void insertar(ObjectId idChat, Mensaje mensaje);

    /**
     * Metodo para obtener los mensajes de un chat.
     *
     * @param idChat.
     * @return .
     */
    List<Mensaje> obtenerPorChat(String idChat);

    /**
     * Metodo para obtener todos los mensajes del chat.
     *
     * @param idChat.
     * @return .
     */
    List<Mensaje> obtenerMensajesDeChat(ObjectId idChat);
}
