/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

/**
 * Metodo para las validaciones en la capa de presentacion.
 *
 * @author rober
 */
public class Validaciones {

    /**
     * Metodo para validar el telefono (10 digitos).
     *
     * @param tel el telefono
     * @return una confirmacion (true/false) si la validacion se cumple.
     */
    public static boolean validarTelefono(String tel) {
        return tel.matches("^[0-9]{10}$");
    }

    /**
     * Metodo para validar el nombre (Solo letras y espacios).
     *
     * @param nombre
     * @return una confirmacion (true/false) si la validacion se cumple.
     */
    public static boolean validarNombre(String nombre) {
        return nombre.matches("^[A-Za-zÁÉÍÓÚÑáéíóúñ ]{2,40}$");
    }

    /**
     * Metodo para validar la contrasenia (Al menos una letra, un numero y
     * minimo 8 caracteres).
     *
     * @param pass la contrasenia
     * @return una confirmacion (true/false) si la validacion se cumple.
     */
    public static boolean validarPassword(String pass) {
        return pass.matches("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
    }

    /**
     * Metodo para validar el mensaje (que no este vacio).
     *
     * @param msg el mensaje a enviar
     * @return una confirmacion (true/false) si la validacion se cumple.
     */
    public static boolean validarMensaje(String msg) {
        return msg.matches(".*\\S.*");
    }
}
