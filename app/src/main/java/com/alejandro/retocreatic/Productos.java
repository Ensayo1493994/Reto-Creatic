package com.alejandro.retocreatic;

/**
 * Created by lenovo on 3/09/2018.
 */

public class Productos {
    private String Nombre;
    private int idDrawable;

    public Productos(String nombre, int idDrawable) {
        Nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public int getId() {
        return Nombre.hashCode();
    }



    public static Productos[] ITEMS = {
            new Productos("RAGGET",R.drawable.pantalonmujer),
            new Productos("MATTELSA",R.drawable.cran),
            new Productos("QUEST",R.drawable.camisa),
            new Productos("BY LOCO",R.drawable.dre),
            new Productos("KOAJ",R.drawable.koajl),
            new Productos("REPUBLICA SUDACA",R.drawable.seer),


    };

    public static Productos getItem(int id){
        for (Productos item : ITEMS){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }


}
