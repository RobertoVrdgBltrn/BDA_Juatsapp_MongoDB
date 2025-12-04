/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import org.mindrot.jbcrypt.BCrypt;

/**
 * Metodo para las encriptaciones de la contrasenia.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class Seguridad {

    /**
     * Metodo para encriptar la contrasenia.
     *
     * @param password la contrasenia a encriptar.
     * @return la contrasenia encriptada que seria la que guardaria la bd.
     */
    public static String encriptar(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    /**
     * Metodo para verificar la contrasenia
     *
     * @param password recibe la contrasenia encriptada.
     * @param hash recibe el hash para validar la contrasenia.
     * @return una confirmacion (true/false) dependiendo si es o no la
     * contrasenia.
     */
    public static boolean verificar(String password, String hash) {
        return BCrypt.checkpw(password, hash);
    }
}
