package com.example.menuprincipal.adaptadores;

import com.example.menuprincipal.R;

import java.util.ArrayList;
import java.util.List;

public class MuseoItems {
    // declaro el arreglo
    private static final List<MuseoItems.museosItems> ITEMS = new ArrayList<museosItems>();
    //contenido del arreglo
    static {
        addItem(new MuseoItems.museosItems("1","Museo Inka", R.drawable.museouno,"aventura"));
        addItem(new MuseoItems.museosItems("2","Museo de Santa Catalina",R.drawable.museodos,"aventura"));
        addItem(new MuseoItems.museosItems("3","Museo de Sitio Qoricancha", R.drawable.museotres,"aventura"));
        addItem(new MuseoItems.museosItems("4","Convento de la Merced", R.drawable.museocuatro,"aventura"));
        addItem(new MuseoItems.museosItems("5","Convento de San Francisco", R.drawable.museocinco,"aventura"));

    }
    //metodo que contruye el arreglo , metodo principal
    static void addItem(MuseoItems.museosItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<MuseoItems.museosItems> ArregloLista (){
        ArrayList<MuseoItems.museosItems> d = new ArrayList<MuseoItems.museosItems>();
        for(MuseoItems.museosItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static MuseoItems.museosItems getMuseoItems(String id){
        for(MuseoItems.museosItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }
    // crear arreglo
    public static class museosItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String tipoTurismo;

        public museosItems(String id, String titulo, Integer imagen, String tipoTurismo) {
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
