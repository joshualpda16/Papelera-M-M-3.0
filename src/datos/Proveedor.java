/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author joshua.d.juanchini
 */
public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String telefono1;
    private String telefono2;
    private String direccion1;
    private String direccion2;
    private String empleado;

    /**
     * Constructor para crear el objeto desde cero
     */
    public Proveedor() {
    }

    /**
     * Constructor de carga. Se usa para crear un nuevo elemento en la DB
     * @param nombre
     * @param telefono1
     * @param telefono2
     * @param direccion1
     * @param direccion2
     * @param empleado 
     */
    public Proveedor(String nombre, String telefono1, String telefono2, String direccion1, String direccion2, String empleado) {
        this.nombre = nombre;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.direccion1 = direccion1;
        this.direccion2 = direccion2;
        this.empleado = empleado;
    }

    /**
     * Constructor que trae un proveedor de la base de datos en base al id ingresado.
     * @param idProveedor Id de un proveedor existente en DB.
     */
    public Proveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    
    //<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public int getIdProveedor() {
        return idProveedor;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono1() {
        return telefono1;
    }
    
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }
    
    public String getTelefono2() {
        return telefono2;
    }
    
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }
    
    public String getDireccion1() {
        return direccion1;
    }
    
    public void setDireccion1(String direccion1) {
        this.direccion1 = direccion1;
    }
    
    public String getDireccion2() {
        return direccion2;
    }
    
    public void setDireccion2(String direccion2) {
        this.direccion2 = direccion2;
    }
    
    public String getEmpleado() {
        return empleado;
    }
    
    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }
//</editor-fold>
    
}
