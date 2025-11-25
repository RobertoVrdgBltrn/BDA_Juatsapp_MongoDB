/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bda_juatsapp_mongodb;

import Entidades.Chat;
import Entidades.Mensaje;
import Entidades.Usuario;
import Persistencia.ChatDAO;
import Persistencia.ConexionMongo;
import Persistencia.IChatDAO;
import Persistencia.IMensajeDAO;
import Persistencia.IUsuarioDAO;
import Persistencia.MensajeDAO;
import Persistencia.UsuarioDAO;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class PruebasMensajes {

    public static void main(String[] args) {
        MongoDatabase db = ConexionMongo.conectar();
        System.out.println("Se conecto");

        IUsuarioDAO udao = new UsuarioDAO(db);
        IChatDAO cdao = new ChatDAO(db);
        IMensajeDAO mdao = new MensajeDAO(db);

        Usuario u1 = udao.obtenerPorTelefono("6442286891");
        Usuario u2 = udao.obtenerPorTelefono("6441234567");

        if (u1 == null || u2 == null) {
            System.out.println("agregalos primero");
            return;
        }

        List<ObjectId> participantes = new ArrayList<>();
        participantes.add(u1.getId());
        participantes.add(u2.getId());

//        Chat chat = new Chat(participantes);
//        cdao.insertar(chat);
//        System.out.println("Chat creado correctamente");

//        // Recuperar el chat recién insertado (último en la lista)
        List<Chat> chats = cdao.obtenerTodos();
        Chat chatCreado = chats.get(chats.size() - 1);
//        System.out.println("Chat obtenido: " + chatCreado.getId());

//        // Crear mensajes y agregarlos al chat
//        Mensaje msg1 = new Mensaje(u1.getId(), "Hola, ¿cómo estás?", new Date());
//        Mensaje msg2 = new Mensaje(u2.getId(), "Todo bien bro, ¿y tú?", new Date());
//
//        // Insertar mensajes
//        mdao.insertar(chatCreado.getId(), msg1);
//        mdao.insertar(chatCreado.getId(), msg2);
//
//        System.out.println("Mensajes insertados correctamente");
        
        mdao.obtenerMensajesDeChat(chatCreado.getId()).forEach(System.out::println);
        
    }
}
