package com.example.menuprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoAgencia extends AppCompatActivity {
    TextView nombre, info;
    ImageView img;
    String idAgencia;
    String infoArreglo[]=new String[5];
    int agencias [] =new int[5];
    String titulo[]=new String[5];



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_agencia);
        //titulo
        titulo[0]="TaytaIntiTours";
        titulo[1]="MachuppicchuAgency";
        titulo[2]="Amaru";
        titulo[3]="Viajes";
        titulo[4]="ViajesCusco";
        //info

        infoArreglo[0]="En la actualidad las personas suelen decidir a favor de satisfacer sus necesidades, y es que una de esas necesidades más importantes son las de viajar, ya que conlleva momento de distracción, diversión, descubrir sitios turísticos y sobre todo olvidarse del trabajo o de la rutina del día a día, por ello y otros motivos recurrimos a las alternativas de paquetes turisticos que las agencias de viajes nos ofrecen.\n" +
                "\n" +
                "Cabe mencionar que existen diversas agencias de viajes que nos ofrecen las alternativas más tentadoras para viajar, dentro de sus paquetes turísticos suelen ofrecer destinos que jamás hubiéramos pensado conocer, sin embargo ellos traen la novedad de que ahora es posible lograr ir al lugar que queramos, todo dependerá de nuestra propia decisión y la ayuda de nuestro agente de viajes para lograr dias perfectos.";
        infoArreglo[1]="Esta agencia de viajes se destaca por contar con más de 38 años de experiencia brindando programas de viajes nacionales e internacionales. Aquí encontraras la más detallada asesoría e información sobre viajes, además de tarifas en paquetes y venta personalizada de boletos aéreos.\n" +
                "\n" +
                "Su atención personalizada te permitirá armar un paquete turístico orientado únicamente en lo que estas interesado. Motivo por el cual puede ser útil tanto para viajes con fines turísticos como para una luna de miel. El destino lo eliges tú, ingresa a http://www.travelgroup.com.pe/ y entérate de todo lo que te puede ofrecer una de las Mejores Agencias de Viajes en Peru";
        infoArreglo[2]="Si hablamos de agencias de viaje en Perú, entonces no podemos ignorar a AVG Lima. Se trata de una agencia cuya sede principal se encuentra en Lima y que ofrece distintos destinos paquetes turísticos con destinos tanto dentro del Perú como en otros países.\n" +
                "\n" +
                "En http://www.agencia-viajes-lima.com/ podrás encontrar opciones de vuelo hacia la ciudadela inca Machu Picchu con alimentación y guías incluidos a un módico precio. ¿En qué se diferencia de otras? Sin duda, en la variedad de estilos de viaje.";
        infoArreglo[3]="Si quieres disfrutar de unas vacaciones o, por otro lado, quieres pasar una agradable experiencia en tu luna de miel, NM Viajes puede ayudarte a conseguirlo. Esta empresa se encarga de organizar los detalles del viaje como los destinos, hoteles y, por supuesto, el transporte.\n" +
                "\n" +
                "En su sitio web https://www.nmviajes.com/ puedes buscar los distintos paquetes de vuelo, hoteles y seguros. Lo acreditan más de 40 años de experiencia ofreciendo planes de viaje a destinos como Arequipa, Cuzco, Cajamarca, entre otros. Además de destinos internacionales como Cartagena, Bogotá, Buenos aires, Rio de Janeiro y otros con hospedaje de hasta 5 días.";
        infoArreglo[4]="Probablemente esta sea la empresa con menor experiencia de la lista, pero no la de menos calidad de servicio. Catalogada como la mejor empresa del año en el 2016, se trata de una empresa especializada en ofrecer distintos paquetes de tours únicamente a destinos al interior del país.\n" +
                "\n" +
                "Ofrece asistencia personalizada y paquetes de vuelo individuales, en pareja y grupos. En su web https://www.machupicchu-tours-peru.com/ puedes encontrar información de destinos turísticos a Machu Picchu, Camino del Inca, entre otros tours. Asimismo, puedes acceder a tours guiados en el Camino Inca corto y clásico, además de tours de un día en la montaña de colores, Inti Raymi y más.";

        //Imagenes
        agencias[0]=R.drawable.agenciauno;
        agencias[1]=R.drawable.agenciados;
        agencias[2]=R.drawable.agenciatres;
        agencias[3]=R.drawable.agenciacuatro;
        agencias[4]=R.drawable.agenciacinco;


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

//        if (idAgencia.equals("1")) {
//            nombre.setText("ga");
//        }

    }
}