/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bda_juatsapp_mongodb;

import Persistencia.ChatDAO;
import Persistencia.ConexionMongo;
import Persistencia.IChatDAO;
import Persistencia.IMensajeDAO;
import Persistencia.IUsuarioDAO;
import Persistencia.MensajeDAO;
import Persistencia.UsuarioDAO;
import com.mongodb.client.MongoDatabase;

/**
 *
 * @author rober
 */
public class PruebasChats {

    public static void main(String[] args) {
        MongoDatabase db = ConexionMongo.conectar();

        IUsuarioDAO udao = new UsuarioDAO(db);
        IChatDAO cdao = new ChatDAO(db);
        IMensajeDAO mdao = new MensajeDAO(db);
//
//        Usuario u1 = udao.obtenerPorTelefono("6442286891");
//        Usuario u2 = udao.obtenerPorTelefono("6441234567");
//        
//        Chat chat = new Chat(new ArrayList<>(List.of(u1.getId(), u2.getId())));
//        cdao.insertar(chat);
//        System.out.println("Chat guardado");
//        
//        cdao.obtenerChatsDeUsuario(u1.getId()).forEach(System.out::println);
        cdao.obtenerTodos().forEach(System.out::println);

    }
}
