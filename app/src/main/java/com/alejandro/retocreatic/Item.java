package com.alejandro.retocreatic;

/**
 * Created by Sánchez on 14/11/2018.
 */

public class Item {
    int background,fototineda;
    String nombre_tienda,direccion;

    public Item(int background, int fototineda, String nombre_tienda, String direccion) {
        this.background = background;
        this.fototineda = fototineda;
        this.nombre_tienda = nombre_tienda;
        this.direccion = direccion;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getFototineda() {
        return fototineda;
    }

    public void setFototineda(int fototineda) {
        this.fototineda = fototineda;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
