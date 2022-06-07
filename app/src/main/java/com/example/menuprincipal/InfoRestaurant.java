package com.example.menuprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoRestaurant extends AppCompatActivity {
    TextView nombre, info;
    ImageView img;
    String idAgencia;
    String infoArreglo[]=new String[5];
    int agencias [] =new int[5];
    String titulo[]=new String[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_restaurant);
        //titulo
        titulo[0]="La Retama";
        titulo[1]="Tanupa Restaurant";
        titulo[2]="La Republica del Pisco";
        titulo[3]="Inca Grill";
        titulo[4]="La Quimera";
        //info

        infoArreglo[0]="“La Retama” Restaurant, que este año celebró su XXVII aniversario atendiendo al mercado turístico, se encuentra ubicado en la Plaza de Armas de Cusco, lugar privilegiado que desde sus balcones coloniales podrán apreciar la Catedral, la iglesia de la Compañía de Jesús, el Majestuoso nevado Ausangate y la hermosa Plaza de Armas.";
        infoArreglo[1]="A principios del milenio, la idea de poner nuestro granito de arena en la historia de la gastronomía en la ciudad del Cusco, se hizo realidad. Nuestro primer restaurante daría sus frutos a través de la entrega de todo nuestro esfuerzo con un único propósito, volcar toda nuestra experiencia e innumerables insumos a nuestros platos para despertar el placer en los paladares de nuestros visitantes.\n" +
                "\n" +
                "La energía del Valle Sagrado nos susurró los oídos, nos envolvió, nos enamoramos y logramos capturarnos. Nueve meses después, una antigua casa colonial abriría sus puertas a nuestro segundo restaurante, dejando claro que nuestro trabajo tenía su recompensa.\n" +
                "\n" +
                "Estamos convencidos de que el día a día, nos permite aprender. Que cada paso que damos nos da una nueva experiencia y sobre todo la oportunidad de transmitir todo lo que nuestra querida tierra nos ha dado, a las próximas generaciones y a cada persona que acude a nuestros restaurantes.";
        infoArreglo[2]="Si bien la buena comida y el excelente servicio al cliente son cruciales para el regreso del negocio, el ambiente de un restaurante también es importante. Quiere que los clientes se sientan cómodos y disfruten de sus comidas. El diseño del restaurante prepara el escenario para la experiencia gastronómica del cliente. La música fuerte, las mesas de fórmica y los vasos de plástico crean un ambiente completamente diferente al del jazz, los manteles de lino y la porcelana fina.";
        infoArreglo[3]="Uno del primer restaurante de esta cadena que se encuentra en la majestuosa Plaza de Armas de Cusco desde 1998.\n" +
                "Menú internacional creado por la fusión de los sabores peruanos y adecuado para todos los gustos, lo que subraya la quinua.\n" +
                "Reinventa platos internacionales en su concepto original, pastas, pizzas y sándwiches. Platos vegetarianos y postres para usted.";
        infoArreglo[4]="La empresa Quimera Cusco son consciente de la importancia y de las grandes expectativas que tienen puestas en su matrimonio. Razón por la cual están dispuestos a colaborarles en toda la planeación y ejecución de su celebración, con servicios y atenciones adecuadas y eficientes para el total éxito de su festejo.";

        //Imagenes
        agencias[0]=R.drawable.gastrouno;
        agencias[1]=R.drawable.gastrodos;
        agencias[2]=R.drawable.gastrotres;
        agencias[3]=R.drawable.gastrocuatro;
        agencias[4]=R.drawable.gastrocinco;


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