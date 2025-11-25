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

    void agregarParticipante(String chatId, String telefonoUsuario);

    List<Chat> obtenerChatsDeUsuario(String telefono);
    
    List<Chat> obtenerTodos();    
}
