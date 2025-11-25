/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Persistencia;

import Entidades.Mensaje;
import java.util.List;

/**
 *
 * @author rober
 */
public interface IMensajeDAO {

    void insertar(Mensaje mensaje);

    List<Mensaje> obtenerPorChat(String idChat);
}
