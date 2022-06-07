package com.example.menuprincipal.adaptadores;

import com.example.menuprincipal.R;

import java.util.ArrayList;
import java.util.List;

public class AgenciaItems {

    // declaro el arreglo
    private static final List<agenciasItems> ITEMS = new ArrayList<agenciasItems>();
    //contenido del arreglo
    static {
        addItem(new AgenciaItems.agenciasItems ("1","TaytaIntiTours", R.drawable.agenciauno,"aventura"));
        addItem(new AgenciaItems.agenciasItems("2","MachuppicchuAgency",R.drawable.agenciados,"aventura"));
        addItem(new AgenciaItems.agenciasItems("3","Amaru", R.drawable.agenciatres,"aventura"));
        addItem(new AgenciaItems.agenciasItems("4","Viajes", R.drawable.agenciacuatro,"aventura"));
        addItem(new AgenciaItems.agenciasItems("5","ViajesCusco", R.drawable.agenciacinco,"aventura"));

    }
    //metodo que contruye el arreglo , metodo principal
    static void addItem(AgenciaItems.agenciasItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<AgenciaItems.agenciasItems> ArregloLista (){
        ArrayList<AgenciaItems.agenciasItems> d = new ArrayList<AgenciaItems.agenciasItems>();
        for(AgenciaItems.agenciasItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static AgenciaItems.agenciasItems getAgenciasItems(String id){
        for(AgenciaItems.agenciasItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }
    // crear arreglo
    public static class agenciasItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String tipoTurismo;

        public agenciasItems(String id,String titulo,Integer imagen,String tipoTurismo){
            this.id = id;
            this.titulo = titulo;
            this.imagen = imagen;
            this.tipoTurismo = tipoTurismo;
        }
        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Integer getImagen() {
            return imagen;
        }

        public void setImagen(Integer imagen) {
            this.imagen = imagen;
        }

        public String getTipoTurismo() {
            return tipoTurismo;
        }

        public void setTipoTurismo(String tipoTurismo) {
            this.tipoTurismo = tipoTurismo;
        }
    }
}

