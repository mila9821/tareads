package com.example.menuprincipal.adaptadores;


import com.example.menuprincipal.R;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsItems {
    // declaro el arreglo
    private static final List<RestaurantsItems.restaurantesItems> ITEMS = new ArrayList<restaurantesItems>();
    //contenido del arreglo
    static {
        addItem(new RestaurantsItems.restaurantesItems("1","La Retama", R.drawable.gastrouno,"aventura"));
        addItem(new RestaurantsItems.restaurantesItems("2","Tanupa Restaurant",R.drawable.gastrodos,"aventura"));
        addItem(new RestaurantsItems.restaurantesItems("3","La republica del Pisco" ,R.drawable.gastrotres,"aventura"));
        addItem(new RestaurantsItems.restaurantesItems("4","Inca Grill", R.drawable.gastrocuatro,"aventura"));
        addItem(new RestaurantsItems.restaurantesItems("5","La quimera", R.drawable.gastrocinco,"aventura"));

    }
    //metodo que contruye el arreglo , metodo principal
    static void addItem(RestaurantsItems.restaurantesItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<RestaurantsItems.restaurantesItems> ArregloLista (){
        ArrayList<RestaurantsItems.restaurantesItems> d = new ArrayList<RestaurantsItems.restaurantesItems>();
        for(RestaurantsItems.restaurantesItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static RestaurantsItems.restaurantesItems getRestaurantsItems(String id){
        for(RestaurantsItems.restaurantesItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }

    // crear arreglo
    public static class restaurantesItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String tipoTurismo;

        public restaurantesItems(String id,String titulo,Integer imagen,String tipoTurismo){
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
