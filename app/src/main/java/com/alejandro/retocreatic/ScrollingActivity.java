package com.alejandro.retocreatic;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ScrollingActivity extends AppCompatActivity {
    private GridView gridView;
    private AdaptadorProductos adaptador;
    public static final String EXTRA_PARAM_ID = "com.herprogramacion.comidas20184K.extra.ID";
    private Item itemdetallado;
    ArrayList<Item> listaropa = new ArrayList<Item>();
    public static String url;
    ImageView imagenExtendida;
    Item item;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(Lista_Tienda.nombret);
        setSupportActionBar(toolbar);
        imagenExtendida = (ImageView) findViewById(R.id.imagen_extendida);

        itemdetallado = Item.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        url = itemdetallado.getUrl();



        listaropa = Lista_Tienda.mlist2;

        gridView = findViewById(R.id.lista_productos);
        adaptador = new AdaptadorProductos(this,listaropa);
        gridView.setAdapter(adaptador);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Redirigiendo pagnia web", Snackbar.LENGTH_LONG)

                        .setAction("Action", null).show();
                Intent intent = new Intent(ScrollingActivity.this,PaginaB.class);
                startActivity(intent);
            }
        });
        Glide.with(imagenExtendida.getContext())
                .load(Lista_Tienda.ph)
                .into(imagenExtendida
                );


    }
}
