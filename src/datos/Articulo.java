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
public class Articulo {

    private int idArticulo;
    private String nombre;
    private String codigo;
    private int idProveedor;
//    private Proveedor proveedor;
    private int stock;
    private int stockMin;
    private double precioCompraMenor;
    private double precioCompraMayor;
    private double precioVentaMenor;
    private double precioVentaMayor;
    private int idSubRubro;
//    private SubRubro subRubro;

    /**
     * Constructor para crear un objeto desde cero.
     */
    public Articulo() {
    }

    /**
     * Constructor que trae todo el artículo en base el id ingresado
     * @param idArticulo Id de un artículo existente en la DB
     */
    public Articulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    /**
     * Constructor de mapeo. Se usa para crear un nuevo elemento en la base de datos
     * @param nombre
     * @param codigo
     * @param idProveedor
     * @param stock
     * @param stockMin
     * @param precioCompraMenor
     * @param precioCompraMayor
     * @param precioVentaMenor
     * @param precioVentaMayor
     * @param idSubRubro 
     */
    public Articulo(String nombre, String codigo, int idProveedor, int stock, int stockMin, double precioCompraMenor, double precioCompraMayor, double precioVentaMenor, double precioVentaMayor, int idSubRubro) {
        
        this.nombre = nombre;
        this.codigo = codigo;
        this.idProveedor = idProveedor;
        this.stock = stock;
        this.stockMin = stockMin;
        this.precioCompraMenor = precioCompraMenor;
        this.precioCompraMayor = precioCompraMayor;
        this.precioVentaMenor = precioVentaMenor;
        this.precioVentaMayor = precioVentaMayor;
        this.idSubRubro = idSubRubro;
    }

    
//<editor-fold defaultstate="collapsed" desc="Getters y Setters">
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void setStockMin(int stockMin) {
        this.stockMin = stockMin;
    }
    
    public void setPrecioCompraMenor(double precioCompraMenor) {
        this.precioCompraMenor = precioCompraMenor;
    }
    
    public void setPrecioCompraMayor(double precioCompraMayor) {
        this.precioCompraMayor = precioCompraMayor;
    }
    
    public void setPrecioVentaMenor(double precioVentaMenor) {
        this.precioVentaMenor = precioVentaMenor;
    }
    
    public void setPrecioVentaMayor(double precioVentaMayor) {
        this.precioVentaMayor = precioVentaMayor;
    }
    
    public int getIdArticulo() {
        return idArticulo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }
    
    public int getStock() {
        return stock;
    }
    
    public int getStockMin() {
        return stockMin;
    }
    
    public double getPrecioCompraMenor() {
        return precioCompraMenor;
    }
    
    public double getPrecioCompraMayor() {
        return precioCompraMayor;
    }
    
    public double getPrecioVentaMenor() {
        return precioVentaMenor;
    }
    
    public double getPrecioVentaMayor() {
        return precioVentaMayor;
    }
    
    public int getIdSubRubro() {
        return idSubRubro;
    }
//</editor-fold>

    
}
