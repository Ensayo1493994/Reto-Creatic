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

import java.util.ArrayList;
import java.util.List;


public class Lista_Tienda extends Fragment {
    int a;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_lista__tienda, container, false);
        Button btnver = vista.findViewById(R.id.btn_ver);




        RecyclerView recyclerView = vista.findViewById(R.id.Lista_tienda);
        final List<Item> mlist =  new ArrayList<>();
        mlist.add(new Item(R.drawable.game,R.drawable.clavero,"clavero","españa"));
        mlist.add(new Item(R.drawable.game,R.drawable.byloko,"BY LOCO","Centro Comercial Campanario Local 130"));
        mlist.add(new Item(R.drawable.game,R.drawable.koaj,"KOAJ","Calle 6ta No 7-42"));
        mlist.add(new Item(R.drawable.game,R.drawable.quests,"QUESTS","Cra 9 24a-21, Popayán"));
        mlist.add(new Item(R.drawable.game,R.drawable.mattelsa,"MATTELSA","Cra 7 # 3 – 22 C.C Plaza Colonial Local 101"));
        mlist.add(new Item(R.drawable.game,R.drawable.ragged,"RAGGED","Cra 9 24 AN 21 - LOCAL 2-3"));
        mlist.add(new Item(R.drawable.game,R.drawable.sudaca,"REPUBLICA SUDACA","Cra. 7 Nte. #7-34"));
        Adapter adapter = new Adapter(getContext(),mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter.setMlistener(new Adapter.OnItemClickListener() {
            @Override
            public void itemClick(int position) {
                a=position;

                /*
                Item item = mlist.get(position);
                Intent intent = new Intent(getContext(), ScrollingActivity.class);
                intent.putExtra(ScrollingActivity.EXTRA_PARAM_ID, item.getId());*/

                switch (position) {
                    case 0:
                        Intent intent = new Intent(getContext(), ScrollingActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        });





        return vista;
    }


}
