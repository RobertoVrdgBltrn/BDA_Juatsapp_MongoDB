/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public interface IUsuarioDAO {

    void insertar(Usuario usuario);

    Usuario obtenerPorTelefono(String telefono);

    void actualizar(Usuario usuario);
    
    Usuario obtenerPorId(ObjectId id);

    List<Usuario> obtenerTodos();
    
    boolean iniciarSesion(String telefono, String password) throws Exception;
}
