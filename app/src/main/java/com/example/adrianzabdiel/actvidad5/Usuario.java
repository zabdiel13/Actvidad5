package com.example.adrianzabdiel.actvidad5;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

public class Usuario implements Parcelable {

        public String nombre;
        public String apellido;
        public String edad;

        public Usuario(String nombre, String apellido, String edad) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.edad = edad;
        }

        public String n() {return nombre; }
        public String a() {return apellido; }
        public String f() {return edad; }

        protected Usuario(Parcel in) {
            nombre = in.readString();
            apellido = in.readString();
            edad = in.readString();
        }
        public List<Usuario> usuario;
         public void initializeData(){
            usuario= new ArrayList<>();
            usuario.add(new Usuario("Adrian", "Sanchez", "19"));
            usuario.add(new Usuario("Matthew", "Patel", "21"));
            usuario.add(new Usuario("Francisco", "Belester", "21"));
            usuario.add(new Usuario("Elias", "Sanchez", "17"));
            usuario.add(new Usuario("Mayra", "Treviño", "46"));
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(nombre);
            dest.writeString(apellido);
            dest.writeString(edad);
        }

        @SuppressWarnings("unused")
        public static final Parcelable.Creator<Usuario> CREATOR = new Parcelable.Creator<Usuario>() {

            public Usuario createFromParcel(Parcel in) {
                return new Usuario(in);
            }

            public Usuario[] newArray(int size) {
                return new Usuario[size];
            }
        };
    }


