package com.alejandro.retocreatic;

/**
 * Created by lenovo on 15/11/2018.
 */

public class Ropa_Tienda {
    private String tienda,direccion;
    private int imagen, imagentienda;

    public Ropa_Tienda(String tienda, String direccion, int imagen, int imagentienda) {
        this.tienda = tienda;
        this.direccion = direccion;
        this.imagen = imagen;
        this.imagentienda = imagentienda;
    }

    public String getTienda() {
        return tienda;
    }

    public void setTienda(String tienda) {
        this.tienda = tienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public int getImagentienda() {
        return imagentienda;
    }

    public void setImagentienda(int imagentienda) {
        this.imagentienda = imagentienda;
    }
}
