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
            System.out.println("Agregar primero los usuarios");
            return;
        }
//
//        // Buscar chat existente
//        Chat chatExistente = cdao.obtenerChatPorParticipantes(u1.getId(), u2.getId());
//
//        Chat chatActual;
//        if (chatExistente == null) {
//            System.out.println("No existe chat, creando uno nuevo");
//
//            List<ObjectId> participantes = new ArrayList<>();
//            participantes.add(u1.getId());
//            participantes.add(u2.getId());
//
//            chatActual = new Chat(participantes);
//            cdao.insertar(chatActual);
//
//            System.out.println("Chat creado: " + chatActual.getId());
//        } else {
//            chatActual = chatExistente;
//            System.out.println("Chat encontrado: " + chatActual.getId());
//        }
//
//        // Crear mensajes NUEVOS
//        Mensaje msgNuevo1 = new Mensaje(u1.getId(), "Otro mensaje", new Date());
//        Mensaje msgNuevo2 = new Mensaje(u2.getId(), "Recibido️", new Date());
//
//        // Insertar mensajes
//        mdao.insertar(chatActual.getId(), msgNuevo1);
//        mdao.insertar(chatActual.getId(), msgNuevo2);
//
//        System.out.println("Mensajes agregados");
//
//        // Mostrar mensajes actuales del chat
//        System.out.println("Mensajes del chat:");
//        mdao.obtenerMensajesDeChat(chatActual.getId()).forEach(System.out::println);
    }
}
