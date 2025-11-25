/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Mensaje;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rober
 */
public class MensajeDAO implements IMensajeDAO {

    private MongoCollection<Mensaje> coleccion;

    public MensajeDAO(MongoCollection coleccion) {
        this.coleccion = coleccion;
    }

    @Override
    public void insertar(Mensaje mensaje) {
        coleccion.insertOne(mensaje);
    }

    @Override
    public List<Mensaje> obtenerPorChat(String idChat) {
        return coleccion.find(Filters.eq("idChat", idChat)).into(new ArrayList<>());
    }

}
