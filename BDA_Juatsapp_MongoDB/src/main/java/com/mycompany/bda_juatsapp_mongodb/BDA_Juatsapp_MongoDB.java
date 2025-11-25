/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bda_juatsapp_mongodb;

import Entidades.Direccion;
import Entidades.Usuario;
import Persistencia.ConexionMongo;
import Persistencia.IUsuarioDAO;
import Persistencia.UsuarioDAO;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class BDA_Juatsapp_MongoDB {

    public static void main(String[] args) {
        MongoDatabase db = ConexionMongo.conectar();
        System.out.println("Se conecto");
        
        IUsuarioDAO udao = new UsuarioDAO(db);
        
        Direccion d = new Direccion("Laureles", "Machi lopez", "Ciudad Obregon");
        
        Usuario u = new Usuario();
        u.setTelefono("6442286891");
        u.setPassword("juegosfriv");
        u.setSexo("Hombre");
        u.setFechaNacimiento(new Date());
        u.setDireccion(d);
        u.setChats(new ArrayList<ObjectId>());
        
        //udao.insertar(u);
        
        Usuario buscado = udao.obtenerPorTelefono("6442286891");
        //System.out.println(buscado);
        
        //buscado.setSexo("Helicoptero Apache");
        //udao.actualizar(buscado);
        //System.out.println("Se actualizo");

        //udao.obtenerTodos().forEach(System.out::println);
    }
}
