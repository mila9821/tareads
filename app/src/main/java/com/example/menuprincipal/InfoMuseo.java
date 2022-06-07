package com.example.menuprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoMuseo extends AppCompatActivity {

    TextView nombre, info;
    ImageView img;
    String idAgencia;
    String infoArreglo[]=new String[5];
    int agencias [] =new int[5];
    String titulo[]=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_museo);
        //titulo
        titulo[0]="Museo Inka";
        titulo[1]="Museo de Santa Catalina";
        titulo[2]="Museo de Qoricancha";
        titulo[3]="Museo del convento de la Merced";
        titulo[4]="Museo del convento de San Francisco";
        //info

        infoArreglo[0]="Es una de las más notables casonas coloniales cusqueñas. Edificada a principios del siglo XVII, con piedras incas, por el teniente corregidor Francisco Aldrete Maldonado, llamado el Almirante este la habitó hasta su muerte en 1643. Reconstruida por Pedro Peralta de los Ríos luego del terremoto de 1650 y nuevamente fue restaurada por la Universidad San Antonio Abad del Cusco después del terremoto de 1950. Actualmente ostenta el escudo de armas de sus reconstructores, que agregaron la atractiva portada plateresca que hoy luce, así como su gran patio de arquerías y los salones artesonados.";
        infoArreglo[1]="El recinto que actualmente ocupa este museo, fue llamado en la época Inca el Acllawasi o Casa de las Escogidas. En él se recluían a las mujeres más bellas del imperio, las que debían dedicarse unas al culto del sol y otras al servicio del Inca, así como a labores de textilería y al arte culinario.\n" +
                "\n" +
                "El Monasterio de Santa Catalina fue fundado en 1601 en la ciudad de Arequipa, pero pronto fue trasladado al Cusco a causa de una serie de devastadoras catástrofes naturales que sucedieron en esa ciudad a comienzos del siglo XVII. La iniciativa de la fundación pertenecía a la viuda doña Lucía Rivera de Padilla, poseedora de una gran fortuna. En febrero del 1605 llegaron al Cusco las primeras 25 monjas profesas.";
        infoArreglo[2]="Se trata de un pequeño museo que posee cinco salas donde se explica didácticamente la historia de los antepasados que vivieron en estas tierras, con piezas pre-incas, incas y coloniales, en su mayoría procedentes de las excavaciones efectuadas en el Koricancha (en quechua Qorikancha, patio de oro\"), durante el período 1992-1995.";
        infoArreglo[3]="El Museo del Convento de La Merced es una colección histórico-artística, el convento de arquitectura colonial considerado Patrimonio Cultural de la Nación. El museo se encuentra distribuido en cinco salas que muestran una colección de pinturas, esculturas, ornamentos e indumentaria religiosa; así como mobiliario y objetos litúrgicos, donde resalta la Custodia de La Merced>, de estilo barroco, elaborada en oro con incrustaciones de piedras preciosas.";
        infoArreglo[4]="El conjunto monumental que integra el Convento de San Francisco de Jesús El Grande de Lima se empezó a construir en el año 1546 y fue inaugurado en 1672, como sede principal de la Provincia Franciscana de los XII Apóstoles del Perú que regía todo el Virreinato. Está declarado como Patrimonio Cultural de la Nación. Desde 1968, el museo exhibe y conserva uno de los acervos históricos y artísticos más representativos del arte virreinal peruano, pues los fondos museográficos reunidos a través de más de 400 años por la orden franciscana en las diversas salas de exposición permanente adyacentes al convento constituyen pruebas documentales de su presencia e importancia. ";
        //Imagenes
        agencias[0]=R.drawable.museouno;
        agencias[1]=R.drawable.museodos;
        agencias[2]=R.drawable.museotres;
        agencias[3]=R.drawable.museocuatro;
        agencias[4]=R.drawable.museocinco;


        nombre = findViewById(R.id.idNombre);
        info = findViewById(R.id.idInfo);
        img = findViewById(R.id.idImagen);

        Bundle bundle = this.getIntent().getExtras();
        idAgencia =bundle.getString("id");

        for (int i=0;i<5;i++){
            if (Integer.parseInt(idAgencia)==i+1){
                info.setText(infoArreglo[i]);
                img.setImageResource(agencias[i]);
                nombre.setText(titulo[i]);
            }
        }
    }
}