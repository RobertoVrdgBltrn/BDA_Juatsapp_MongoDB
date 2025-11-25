/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author rober
 */
public class Usuario {

    private ObjectId id;
    private String telefono;
    private String password;
    private String sexo;
    private Date fechaNacimiento;
    private Direccion direccion;
    private List<ObjectId> chats;

    public Usuario() {
    }

    public Usuario(String telefono, String password, String sexo, Date fechaNacimiento, Direccion direccion, List<ObjectId> chats) {
        this.telefono = telefono;
        this.password = password;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.chats = chats;
    }

    public Usuario(ObjectId id, String telefono, String password, String sexo, Date fechaNacimiento, Direccion direccion, List<ObjectId> chats) {
        this.id = id;
        this.telefono = telefono;
        this.password = password;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.chats = chats;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public List<ObjectId> getChats() {
        return chats;
    }

    public void setChats(List<ObjectId> chats) {
        this.chats = chats;
    }

}
