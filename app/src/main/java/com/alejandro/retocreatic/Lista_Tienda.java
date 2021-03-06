package com.alejandro.retocreatic;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Lista_Tienda extends Fragment {
    int a;
    public static ArrayList<Item> mlist =  new ArrayList<>();
    public static ArrayList<Item> mlist2 =  new ArrayList<>();
    String nombre, direccion;
    int imagen, marca;
    public  static  ArrayList<Item> listaropatienda = new ArrayList<>();
    public static  List<Item> lista;
    public static String url ,nombret;
    public static int ph;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_lista__tienda, container, false);
        Button btnver = vista.findViewById(R.id.btn_ver);




        RecyclerView recyclerView = vista.findViewById(R.id.Lista_tienda);

        //mlist.add(new Item(R.drawable.game,R.drawable.clavero,"clavero","españa"));
        mlist.add(new Item(R.drawable.descuento1,R.drawable.byloko,R.drawable.dre,"BY LOCO","Centro Comercial Campanario Local 130", "https://www.bylokony.com/"));
        mlist.add(new Item(R.drawable.descuento4,R.drawable.koaj,R.drawable.koajl,"KOAJ","Calle 6ta No 7-42", "http://www.koaj.co/"));
        mlist.add(new Item(R.drawable.descuento2,R.drawable.quests,R.drawable.camisa,"QUESTS","Cra 9 24a-21, Popayán", "https://www.quest.com.co/"));
        mlist.add(new Item(R.drawable.descuento3,R.drawable.mattelsa,R.drawable.cran,"MATTELSA","Cra 7 # 3 – 22 C.C Plaza Colonial Local 101", "https://www.mattelsa.net/"));
        mlist.add(new Item(R.drawable.descuento2,R.drawable.ragged,R.drawable.pantalonmujer,"RAGGED","Cra 9 24 AN 21 - LOCAL 2-3", "https://www.ragged.com.co/"));
        mlist.add(new Item(R.drawable.descuento1,R.drawable.sudaca,R.drawable.seer,"REPUBLICA SUDACA","Cra. 7 Nte. #7-34", "https://www.facebook.com/RepublicaSudaca/"));
        Adapter adapter = new Adapter(getContext(),mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter.setMlistener(new Adapter.OnItemClickListener() {
            @Override
            public void itemClick(int position) {





                Item item = mlist.get(position);
                ph= item.getFototineda();
                nombret = item.getNombre_tienda();
                mlist2.clear();
                mlist2.add(item);




                Intent intent = new Intent(getContext(), ScrollingActivity.class);
                intent.putExtra(ScrollingActivity.EXTRA_PARAM_ID, item.getId());
                startActivity(intent);

                /*switch (position) {
                    case 0:
                        Intent intent = new Intent(getContext(), ScrollingActivity.class);
                        startActivity(intent);
                        break;
                }*/
            }
        });





        return vista;
    }


}
