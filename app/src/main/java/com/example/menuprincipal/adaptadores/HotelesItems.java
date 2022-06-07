package com.example.menuprincipal.adaptadores;

import com.example.menuprincipal.R;

import java.util.ArrayList;
import java.util.List;

public class HotelesItems {
    // declaro el arreglo
    private static final List<hotelesItems> ITEMS = new ArrayList<hotelesItems>();
    //contenido del arreglo
    static {
        addItem(new HotelesItems.hotelesItems("1","Costa del Sol Ramada Cusco", R.drawable.hoteluno,"aventura"));
        addItem(new HotelesItems.hotelesItems("2","Indian Taste",R.drawable.hoteldos,"aventura"));
        addItem(new HotelesItems.hotelesItems("3","Hoteles Colgantes en Ollantaytambo", R.drawable.hoteltres,"aventura"));
        addItem(new HotelesItems.hotelesItems("4","Golden Inca", R.drawable.hotelcuatro,"aventura"));
        addItem(new HotelesItems.hotelesItems("5","Inkayra Hotel Cusco", R.drawable.hotelcinco,"aventura"));

    }
    //metodo que contruye el arreglo , metodo principal
    static void addItem(HotelesItems.hotelesItems item){
        ITEMS.add(item);
    }
    // metodo para agregar objetos
    public static ArrayList<HotelesItems.hotelesItems> ArregloLista (){
        ArrayList<HotelesItems.hotelesItems> d = new ArrayList<HotelesItems.hotelesItems>();
        for(HotelesItems.hotelesItems obj:ITEMS){
            d.add(obj);
        }
        return d;
    }
    // metodo para traer datos
    public static HotelesItems.hotelesItems getHotelesItems(String id){
        for(HotelesItems.hotelesItems obj:ITEMS){
            if (obj.id.equals(id)){
                return obj;
            }
        }
        return ITEMS.get(1); // busqueda título
    }
    // crear arreglo
    public static class hotelesItems {

        private String id;
        private String titulo;
        private Integer imagen;
        private String tipoTurismo;

        public hotelesItems(String id,String titulo,Integer imagen,String tipoTurismo){
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
