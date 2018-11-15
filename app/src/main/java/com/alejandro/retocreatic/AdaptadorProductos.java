package com.alejandro.retocreatic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by lenovo on 3/09/2018.
 */

public class AdaptadorProductos extends BaseAdapter {
    private Context context;

    //-----AQUI HAY QU ECAMBIAR "ITEMS" POR EL ARRAY QUE SE TRAE DESDE FIREBASE

    public AdaptadorProductos(Context context  ) {
        this.context = context;


    }

    @Override
    public int getCount() {
        return Productos.ITEMS.length;
    }

    @Override
    public Productos getItem(int position) {
        return Productos.ITEMS[position];
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

        final Productos item = getItem(position);
        //imagenComida.setImageResource(item.getIdDrawable());

        Glide.with(imagenComida.getContext()).load(item.getIdDrawable()).into(imagenComida);
        nombreComida.setText(item.getNombre());

        return view;
    }
}
