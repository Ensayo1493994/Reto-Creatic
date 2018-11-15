package com.alejandro.retocreatic;

/**
 * Created by Sánchez on 14/11/2018.
 */

public class Item {
    int background,fototineda,producto1;
    String nombre_tienda,direccion;

    public Item(int background, int fototineda, int producto1, String nombre_tienda, String direccion) {
        this.background = background;
        this.fototineda = fototineda;
        this.producto1 = producto1;
        this.nombre_tienda = nombre_tienda;
        this.direccion = direccion;
    }

    public Item() {
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

    public int getProducto1() {
        return producto1;
    }

    public void setProducto1(int producto1) {
        this.producto1 = producto1;
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

    public int getId() {
        return nombre_tienda.hashCode();
    }
    public static Item getItem(int id){
        for (Item item : Lista_Tienda.mlist){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }
}
