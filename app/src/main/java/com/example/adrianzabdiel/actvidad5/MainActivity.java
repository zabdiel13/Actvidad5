package com.example.adrianzabdiel.actvidad5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> usuario;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText nombre= (EditText) findViewById(R.id.editText);
        final EditText apellido= (EditText) findViewById(R.id.editText2);
        final EditText edad= (EditText) findViewById(R.id.editText3);


        recyclerView=findViewById(R.id.recycleid);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        Usuario usuario = new Usuario (nombre.getText().toString(), apellido.getText().toString(),edad.getText().toString());

    }
    Adapter adapter=new Adapter(usuario);
    recyclerView.setAdapter(adapter);
}
