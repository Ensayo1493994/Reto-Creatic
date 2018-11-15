package com.alejandro.retocreatic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by lenovo on 3/09/2018.
 */

public class AdaptadorProductos extends BaseAdapter {
    private Context context;
    ArrayList<Item> list;

    //-----AQUI HAY QU ECAMBIAR "ITEMS" POR EL ARRAY QUE SE TRAE DESDE FIREBASE


    public AdaptadorProductos(Context context, ArrayList<Item> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Item getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item, viewGroup, false);
        }

        ImageView imagenComida = (ImageView) view.findViewById(R.id.imagen_comida);
        TextView nombreComida = (TextView) view.findViewById(R.id.nombre_comida);

        final Item item = getItem(position);
        //imagenComida.setImageResource(item.getIdDrawable());

        Glide.with(imagenComida.getContext()).load(item.getProducto1()).into(imagenComida);
        nombreComida.setText(item.getNombre_tienda());

        return view;
    }
}
