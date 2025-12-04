/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bda_juatsapp_mongodb;

import Entidades.Usuario;
import Persistencia.ConexionMongo;
import Persistencia.IUsuarioDAO;
import Persistencia.UsuarioDAO;
import com.mongodb.client.MongoDatabase;

/**
 * Pruebas para el inicio de sesion
 *
 * @author rober
 */
public class PurebaInicioSesion {

    /**
     * .
     * @param args .
     * @throws Exception .
     */
    public static void main(String[] args) throws Exception {
        MongoDatabase db = ConexionMongo.conectar();
        IUsuarioDAO udao = new UsuarioDAO(db);

        boolean sesion = udao.iniciarSesion("6441234567", "juegosfriv");
        if (sesion) {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }
}
