package com.alejandro.retocreatic;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class Inicio extends Fragment implements GoogleApiClient.OnConnectionFailedListener {
    private GoogleApiClient googleApiClient;
    private FirebaseAuth firebaseAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;
    private FirebaseUser firebaseUser;
    private static final String[] datos =
            new String[]{"Koaj","by Loko","Americanino","Mattelsa","Republica sudaca", "Quest"};
    Spinner spinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =inflater.inflate(R.layout.fragment_inicio, container, false);
        final ImageView imageView = view.findViewById(R.id.fotoperfil);

        firebaseAuth = FirebaseAuth.getInstance();
        spinner=(Spinner) view.findViewById(R.id.spinner);
        FirebaseUser user = firebaseAuth.getCurrentUser();
        Glide.with(getContext()).load(user.getPhotoUrl()).into(imageView);
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,datos);
        spinner.setAdapter(adaptador);






        return view;
    }


    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

}
