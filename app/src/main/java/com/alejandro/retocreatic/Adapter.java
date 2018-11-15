package com.alejandro.retocreatic;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Sánchez on 14/11/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.miViewholder>{

    Context mContex;
    List<Item> mData;
    private OnItemClickListener mlistener;
    public interface OnItemClickListener{
        void itemClick(int position);
    }

    public Adapter(Context mContex, List<Item> mData) {
        this.mContex = mContex;
        this.mData = mData;
    }

    public void setMlistener(OnItemClickListener mlistener) {
        this.mlistener = mlistener;
    }

    @Override
    public miViewholder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContex);
        View v = layoutInflater.inflate(R.layout.card_item,parent,false);
        return new miViewholder(v,mlistener);
    }

    @Override
    public void onBindViewHolder(miViewholder holder, int position) {

        holder.images_backgroud.setImageResource(mData.get(position).getBackground());
        holder.img_logo.setImageResource(mData.get(position).getFototineda());
        holder.txttitulo.setText(mData.get(position).getNombre_tienda());
        holder.txtdireccion.setText(mData.get(position).getDireccion());




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class miViewholder extends RecyclerView.ViewHolder{

        ImageView images_backgroud,img_logo;
        TextView txttitulo,txtdireccion;


        public miViewholder(View itemView, final OnItemClickListener mlistener) {
            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (mlistener!=null){
                        int position = getAdapterPosition();
                        if (position!=RecyclerView.NO_POSITION){
                            mlistener.itemClick(position);
                        }
                    }
                }
            });
            images_backgroud = itemView.findViewById(R.id.images_backgroud);
            img_logo = itemView.findViewById(R.id.img_logo);
            txttitulo = itemView.findViewById(R.id.txt_titulo);
            txtdireccion = itemView.findViewById(R.id.txt_direccion);
        }
    }
}
