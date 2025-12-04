/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Clase que implementaran los metodos que utilizara la clase UsuarioDAO
 *
 * @author Roberto Verdugo y Angel Servin
 */
public interface IUsuarioDAO {

    /**
     * Metodo para ingresar un nuevo usuario
     *
     * @param usuario .
     */
    void insertar(Usuario usuario);

    /**
     * Metodo para obtener un usuario mediante su telefono
     *
     * @param telefono .
     * @return .
     */
    Usuario obtenerPorTelefono(String telefono);

    /**
     * Metodo para actualizar los datos de un usuario.
     *
     * @param usuario .
     */
    void actualizar(Usuario usuario);

    /**
     * Metodo para obtener un usuario mediante su id.
     *
     * @param id .
     * @return .
     */
    Usuario obtenerPorId(ObjectId id);

    /**
     * Metodo para obtener todos los usuarios
     *
     * @return .
     */
    List<Usuario> obtenerTodos();

    /**
     * Metodo para iniciar sesion en el programa.
     *
     * @param telefono .
     * @param password .
     * @return .
     * @throws Exception .
     */
    boolean iniciarSesion(String telefono, String password) throws Exception;
}
