/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rober
 */
public class UsuarioDAO implements IUsuarioDAO {

    private MongoCollection<Usuario> coleccion;

    public UsuarioDAO(MongoDatabase database) {
        this.coleccion = database.getCollection("usuarios", Usuario.class);
    }

    @Override
    public void insertar(Usuario usuario) {
        coleccion.insertOne(usuario);
    }

    @Override
    public Usuario obtenerPorTelefono(String telefono) {
        return coleccion.find(Filters.eq("telefono", telefono)).first();
    }

    @Override
    public void actualizar(Usuario usuario) {
        coleccion.replaceOne(Filters.eq("telefono", usuario.getTelefono()), usuario);
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return coleccion.find().into(new ArrayList<>());
    }

}
