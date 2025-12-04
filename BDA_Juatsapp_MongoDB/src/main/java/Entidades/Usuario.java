/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 * Representa a un usuario dentro del sistema de mensajería. Cada usuario
 * contiene información personal, su dirección y la lista de chats en los que
 * participa. Esta entidad se almacena en MongoDB.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class Usuario {

    private ObjectId id;
    private String telefono;
    private String password;
    private String sexo;
    private Date fechaNacimiento;
    private Direccion direccion;
    private List<ObjectId> chats;

    /**
     * Constructor por defecto. Crea un usuario vacío.
     */
    public Usuario() {
    }

    /**
     * Constructor que inicializa un usuario sin especificar ID.
     *
     * @param telefono Número telefónico único del usuario.
     * @param password Contraseña asociada al usuario.
     * @param sexo Sexo del usuario (por ejemplo: "M", "F", "Otro").
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     * @param direccion Dirección del usuario.
     * @param chats Lista de identificadores de chats en los que participa.
     */
    public Usuario(String telefono, String password, String sexo, Date fechaNacimiento, Direccion direccion, List<ObjectId> chats) {
        this.telefono = telefono;
        this.password = password;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.chats = chats;
    }

    /**
     * Constructor que inicializa todos los atributos del usuario.
     *
     * @param id Identificador único del usuario en la base de datos.
     * @param telefono Número telefónico único del usuario.
     * @param password Contraseña asociada al usuario.
     * @param sexo Sexo del usuario.
     * @param fechaNacimiento Fecha de nacimiento del usuario.
     * @param direccion Dirección del usuario.
     * @param chats Lista de IDs de chats en los que participa.
     */
    public Usuario(ObjectId id, String telefono, String password, String sexo, Date fechaNacimiento, Direccion direccion, List<ObjectId> chats) {
        this.id = id;
        this.telefono = telefono;
        this.password = password;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.chats = chats;
    }

    /**
     * Obtiene el ID del usuario.
     *
     * @return Identificador único del usuario.
     */
    public ObjectId getId() {
        return id;
    }

    /**
     * Establece el ID del usuario.
     *
     * @param id Nuevo identificador único.
     */
    public void setId(ObjectId id) {
        this.id = id;
    }

    /**
     * Obtiene el número telefónico del usuario.
     *
     * @return Teléfono del usuario.
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número telefónico del usuario.
     *
     * @param telefono Teléfono nuevo del usuario.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return Contraseña almacenada.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param password Nueva contraseña.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene el sexo del usuario.
     *
     * @return Sexo del usuario.
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Establece el sexo del usuario.
     *
     * @param sexo Sexo actualizado.
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * Obtiene la fecha de nacimiento del usuario.
     *
     * @return Fecha de nacimiento.
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Establece la fecha de nacimiento del usuario.
     *
     * @param fechaNacimiento Nueva fecha de nacimiento.
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Obtiene la dirección del usuario.
     *
     * @return Dirección completa.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección del usuario.
     *
     * @param direccion Nueva dirección.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la lista de IDs de chats asociados al usuario.
     *
     * @return Lista de identificadores de chats.
     */
    public List<ObjectId> getChats() {
        return chats;
    }

    /**
     * Establece la lista de chats del usuario.
     *
     * @param chats Nueva lista de IDs de chats.
     */
    public void setChats(List<ObjectId> chats) {
        this.chats = chats;
    }

    /**
     * Devuelve una representación en texto del usuario.
     *
     * @return Cadena con los valores del usuario.
     */
    @Override
    public String toString() {
        return "Usuario{"
                + "id=" + id
                + ", telefono=" + telefono
                + ", password=" + password
                + ", sexo=" + sexo
                + ", fechaNacimiento=" + fechaNacimiento
                + ", direccion=" + direccion
                + ", chats=" + chats
                + '}';
    }
}
