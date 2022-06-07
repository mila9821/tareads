package com.example.menuprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoHoteles extends AppCompatActivity {
    TextView nombre, info;
    ImageView img;
    String idAgencia;
    String infoArreglo[]=new String[5];
    int agencias [] =new int[5];
    String titulo[]=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_hoteles);
        //titulo
        titulo[0]="Costa del Sol Ramada Cusco";
        titulo[1]="Indian Taste";
        titulo[2]="Hotel Colgante de Ollantaytambo";
        titulo[3]="Golden Inca";
        titulo[4]="Inkayra Hotel Cusco";
        //info

        infoArreglo[0]="La ex casona del Marqués de Picoaga está dividida en un ala colonial y otra contemporánea combina arquerías de piedra, un hermoso patio con pileta y algunos murales propios de la arquitectura del siglo XVII. Costa del sol Ramada Cusco tiene las comodidades de un hotel de estilo contemporáneo a la vez que conserva detalles coloniales, como sus habitaciones con techos altos de vigas y portones de madera. El hotel está a sólo 2 cuadras de la hermosa plaza de armas de Cusco.";
        infoArreglo[1]="Hotel San Agustin El Dorado está en pleno centro de Cusco, a solo diez minutos a pie de Palacio de Justicia y Plaza de Armas. Tendrás un centro de negocios, tintorería y un servicio de recepción las 24 horas a tu disposición. Se ofrece servicio de transporte al aeropuerto (ida y vuelta) de pago (disponible las 24 horas).";
        infoArreglo[2]="Skylodge Adventures Suites es el único hotel colgante que existe en el mundo, ubicado en Cusco, Perú. En este hotel es posible dormir dentro de un refugio completamente transparente, con una impactante vista sobre el mágico Valle Sagrado de los Incas y sus noches adornadas por la vía láctea.\n" +
                "\n" +
                "Las habitaciones se encuentran a 400 metros de altura sobre el espectacular valle y fueron fabricadas en aluminio aero-espacial y policarbonato de alta resistencia.";
        infoArreglo[3]="Hotel Golden Inca es un hotel elegante y moderno, fue inagurado el año 2011 y remodelado en el año 2018, está perfectamente diseñado para convertir en gratos momentos su estadía en la ciudad de Cusco, sea su viaje por turismo, trabajo o algún evento especial.";
        infoArreglo[4]="Es un hotel nuevo, moderno y colonial, ubicado a solo 6 cuadras de la Plaza de Armas del Cusco y a solo 4 cuadras de la estación de tren al Santuario de Machu Picchu; Nuestros equipos de expertos en recursos humanos están bien informados y son versátiles en la prestación de servicios excepcionales que dejan un recuerdo precioso y duradero en el corazón de nuestros huéspedes.";

        //Imagenes
        agencias[0]=R.drawable.hoteluno;
        agencias[1]=R.drawable.hoteldos;
        agencias[2]=R.drawable.hoteltres;
        agencias[3]=R.drawable.hotelcuatro;
        agencias[4]=R.drawable.hotelcinco;


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