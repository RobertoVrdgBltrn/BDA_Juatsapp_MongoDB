
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 * Representa una dirección física asociada a un usuario dentro del sistema. La
 * dirección contiene información de calle, colonia y ciudad, y se almacena como
 * parte de los datos en MongoDB.
 *
 * @author Roberto Verdugo y Angel Servin
 */
public class Direccion {

    private String calle;
    private String colonia;
    private String ciudad;

    /**
     * Constructor por defecto. Crea una dirección vacía.
     */
    public Direccion() {
    }

    /**
     * Constructor que inicializa todos los atributos de la dirección.
     *
     * @param calle Nombre de la calle.
     * @param colonia Nombre de la colonia.
     * @param ciudad Nombre de la ciudad.
     */
    public Direccion(String calle, String colonia, String ciudad) {
        this.calle = calle;
        this.colonia = colonia;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return Valor de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Establece el nombre de la calle.
     *
     * @param calle Nueva calle para la dirección.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la colonia.
     *
     * @return Valor de la colonia.
     */
    public String getColonia() {
        return colonia;
    }

    /**
     * Establece el nombre de la colonia.
     *
     * @param colonia Nueva colonia para la dirección.
     */
    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    /**
     * Obtiene el nombre de la ciudad.
     *
     * @return Valor de la ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece el nombre de la ciudad.
     *
     * @param ciudad Nueva ciudad para la dirección.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Devuelve una representación en texto de la dirección.
     *
     * @return Cadena con los valores de la calle, colonia y ciudad.
     */
    @Override
    public String toString() {
        return "Direccion{"
                + "calle=" + calle
                + ", colonia=" + colonia
                + ", ciudad=" + ciudad
                + '}';
    }
}
