/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Usuario;
import java.util.List;

/**
 *
 * @author rober
 */
public interface IUsuarioDAO {

    void insertar(Usuario usuario);

    Usuario obtenerPorTelefono(String telefono);

    void actualizar(Usuario usuario);

    List<Usuario> obtenerTodos();
}
