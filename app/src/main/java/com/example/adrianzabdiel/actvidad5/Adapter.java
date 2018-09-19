package com.example.adrianzabdiel.actvidad5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    ArrayList<String> usuario;
    public Adapter(ArrayList<String> usuario){
        this.usuario=usuario;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.items,null,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.asignarDatos(usuario.get(i));
    }

    @Override
    public int getItemCount() {
        return usuario.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView datos;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            datos=itemView.findViewById(R.id.iddatos);
        }

        public void asignarDatos(String dato) {
            datos.setText(dato);
        }
    }
    }


