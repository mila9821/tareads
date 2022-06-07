package com.example.menuprincipal.adaptadores;

import com.example.menuprincipal.R;

import java.util.ArrayList;
import java.util.List;

public class DestinoItems {
  private static final List<destinosItems> ITEMS = new ArrayList<destinosItems>();
  static {
    addItem(new DestinoItems.destinosItems ("1","Iglesia de Andahuaylilas", R.drawable.destinouno,"aventura"));
    addItem(new DestinoItems.destinosItems("2","Chinchero",R.drawable.destinodos,"aventura"));
    addItem(new DestinoItems.destinosItems("3","Laguna de Humantay", R.drawable.destinotres,"aventura"));
    addItem(new DestinoItems.destinosItems("4","Salineras de Maras", R.drawable.destinocuatro,"aventura"));
    addItem(new DestinoItems.destinosItems("5","Cerro de 7 colores", R.drawable.destinocinco,"aventura"));

  }
  //metodo que contruye el arreglo , metodo principal
  static void addItem(DestinoItems.destinosItems item){
    ITEMS.add(item);
  }
  // metodo para agregar objetos
  public static ArrayList<DestinoItems.destinosItems> ArregloLista (){
    ArrayList<DestinoItems.destinosItems> d = new ArrayList<DestinoItems.destinosItems>();
    for(DestinoItems.destinosItems obj:ITEMS){
      d.add(obj);
    }
    return d;
  }
  // metodo para traer datos
  public static DestinoItems.destinosItems getDestinoItems(String id){
    for(DestinoItems.destinosItems obj:ITEMS){
      if (obj.id.equals(id)){
        return obj;
      }
    }
    return ITEMS.get(1); // busqueda título
  }
  public static class destinosItems {

    private String id;
    private String titulo;
    private Integer imagen;
    private String tipoTurismo;

    public destinosItems(String id,String titulo,Integer imagen,String tipoTurismo){
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
