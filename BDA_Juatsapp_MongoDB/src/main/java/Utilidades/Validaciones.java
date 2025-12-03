/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 *
 * @author rober
 */
public class Validaciones {

    public static boolean validarTelefono(String tel) {
        return tel.matches("^[0-9]{10}$");
    }

    public static boolean validarNombre(String nombre) {
        return nombre.matches("^[A-Za-zÁÉÍÓÚÑáéíóúñ ]{2,40}$");
    }

    public static boolean validarPassword(String pass) {
        return pass.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }

    public static boolean validarMensaje(String msg) {
        return msg.matches(".*\\S.*");
    }
}
