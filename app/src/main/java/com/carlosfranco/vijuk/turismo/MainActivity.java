package com.carlosfranco.vijuk.turismo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.JsonObjectRequest;

public class MainActivity extends AppCompatActivity {

    JsonObjectRequest array;
    RequestQueue mRequestQueue;
    private final String url = "http://192.168.1.22:8080/Proyecto/public/jugador";
    private final String TAG = "Hope";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
