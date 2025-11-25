/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Mensaje;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public interface IMensajeDAO {

    void insertar(ObjectId idChat, Mensaje mensaje);

    List<Mensaje> obtenerPorChat(String idChat);
    
    List<Mensaje> obtenerMensajesDeChat(ObjectId idChat);
}
