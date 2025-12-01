/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Chat;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public interface IChatDAO {

    void insertar(Chat chat);

    Chat obtenerPorId(ObjectId id);

    void agregarParticipante(ObjectId chatId, ObjectId idUsuario);

    List<Chat> obtenerChatsDeUsuario(ObjectId idUsuario);
    
    Chat obtenerChatPorParticipantes(ObjectId idU1, ObjectId idU2);
    
    List<Chat> obtenerTodos();    
}
