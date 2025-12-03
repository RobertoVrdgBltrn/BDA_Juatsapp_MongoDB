/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import Utilidades.Seguridad;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import java.util.ArrayList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase donde se establecen los metodos que se utilizaran para la entidad
 * "usuarios" en la bd.
 *
 * @author rober
 */
public class UsuarioDAO implements IUsuarioDAO {

    private MongoCollection<Usuario> coleccion;

    /**
     * Constructor con la conexion a la bd.
     *
     * @param database
     */
    public UsuarioDAO(MongoDatabase database) {
        this.coleccion = database.getCollection("usuarios", Usuario.class);
    }

    /**
     * Metodo para ingresar un nuevo usuario
     *
     * @param usuario recibe los datos del usuario a registrar, ademas de encriptar la contrasenia para que no se vea en la bd.
     */
    @Override
    public void insertar(Usuario usuario) {
        usuario.setPassword(Seguridad.encriptar(usuario.getPassword()));
        coleccion.insertOne(usuario);
    }

    /**
     * Metodo para obtener un usuario mediante su id.
     * @param id recibe el id del usuario.
     * @return los datos del usuario.
     */
    @Override
    public Usuario obtenerPorId(ObjectId id) {
        return coleccion.find(Filters.eq("_id", id)).first();
    }

    /**
     * Metodo para obtener un usuario mediante su telefono.
     * @param telefono recibe el numero de telefono del usuario.
     * @return los datos del usuario a quien coincida el numero.
     */
    @Override
    public Usuario obtenerPorTelefono(String telefono) {
        return coleccion.find(Filters.eq("telefono", telefono)).first();
    }

    /**
     * Metodo para actualizar los datos de un usuario.
     * @param usuario los datos del usuario actualizados.
     */
    @Override
    public void actualizar(Usuario usuario) {
        coleccion.replaceOne(Filters.eq("telefono", usuario.getTelefono()), usuario);
    }

    /**
     * Metodo para obtener todos los usuarios.
     * @return todos los usuarios.w
     */
    @Override
    public List<Usuario> obtenerTodos() {
        return coleccion.find().into(new ArrayList<>());
    }

    /**
     * Metodo booleano para iniciar sesion.
     * @param telefono recibe el telefono de un usuario registrado.
     * @param password recibe la contrasena de un usuario registrado.
     * @return una confirmacion de inicio de sesion (true/false) dependiento si los datos esta bien y/o esta registrado.
     * @throws Exception 
     */
    @Override
    public boolean iniciarSesion(String telefono, String password) throws Exception {
        Usuario usuario = obtenerPorTelefono(telefono);
        if (usuario == null) {
            return false;
        }

        return Seguridad.verificar(password, usuario.getPassword()); //Desencripta la contrasenia
    }

}
