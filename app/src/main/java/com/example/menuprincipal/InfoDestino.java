package com.example.menuprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoDestino extends AppCompatActivity {
    TextView nombre, info;
    ImageView img;
    String idAgencia;
    String infoArreglo[]=new String[5];
    int agencias [] =new int[5];
    String titulo[]=new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_destino);
        //titulo
        titulo[0]="Iglesia de Andahuaylias";
        titulo[1]="Chinchero";
        titulo[2]="Laguna de Humantay";
        titulo[3]="Salineras de Maras";
        titulo[4]="Cerro de 7 colores";
        //info

        infoArreglo[0]="Andahuaylillas es un pequeño pueblo situado en la provincia de Quispicanchi, a no más de 45 kilómetros de la ciudad del Cusco. Al parecer, por los restos de construcciones todavía no muy bien estudiadas, fue un asentamiento inca de cierta importancia. Su fértil campiña, en las cercanías del Vilcanota, hizo que en los primeros tiempos de la colonia, se instalaran allí vecinos de cierta importancia, de que son testimonios las casonas que todavía se conservan, pero luego el pueblo se estancó e incluso su nombre (\"pradera cobriza\", en quechua) tuvo que aceptar un diminutivo castellano, pues tenía un homónimo más grande, la Andahuaylas de Apurímac.\n" +
                "\n" +
                "Ahora Andahuaylillas es un acogedor poblado de más o menos 5 000 habitantes que recibe al viajero en su inmensa y serena plaza de armas, poblada de añosos pisonayes. Su iglesia, desde fuera, no deja de ser hermosa, pese a su sencillez: levantada sobre una plataforma a la que accede por gradas. Tiene, como muchos templos andinos, una capilla abierta en forma de balcón, custodiada por un sólido campanario de maciza planta cuadrada. Desde el atrio, tres desnudas cruces de piedra se encasquetan de altura sublime. Posiblemente, fue erigida sobre el emplazamiento de una construcción prehispánica, una guaca, quizá; pues en su interior hay rastros de muretes incaicos.";
        infoArreglo[1]="Los orígenes de Chinchero se pierden en la noche de los tiempos. Hay vestigios que datan de hace dos mil años aproximadamente. Los primeros habitantes de la región fueron los ayarmacas quienes, al llegar los primeros gobernadores cusqueños, defendieron su territorio y ofrecieron seria resistencia antes de ser incorporados al imperio. Chinchero fue el lugar elegido por el inca Túpac Inca Yupanqui para establecer su residencia. Él mandó construir bellos palacetes para su uso personal y el de su panaca.\n" +
                "\n" +
                "Hacia 1536, en plena invasión, Manco Inca inició su rebelión incendiando Chinchero para que los españoles no renovaran sus provisiones y dejaran de perseguirlo en su retirada hacia regiones selváticas desconocidas. Cuando el virrey Toledo visitó Cusco, se detuvo en Chinchero. Aquí estableció una reducción de indios y mandó construir la actual iglesia, que fue levantada sobre hermosas salas incaicas. Más tarde, durante la revolución de Túpac Amaru II, el curaca de Chinchero, Mateo García Pamacahua, se levantó en favor del Rey de España para combatir al rebelde. El triunfo de Pumacahua fue eternizado en un mural en el que hoy figura un puma derrotando a una serpiente (amaru).\n" +
                "\n" +
                "Oficialmente, el distrito de Chinchero fue creado el 9 de septiembre de 1905 mediante Ley No. 59 dada en el gobierno del Presidente José Pardo y Barreda.2\u200B\n" +
                "\n" +
                "Aquí está lo que en la época incaica fue la hacienda real de Túpac Inca Yupanqui, así como un templo colonial construido sobre basamentos de dicha civilización, especialmente las típicas puertas o ventanas más anchas abajo y más angostas arriba, lo que fue una característica de la arquitectura incaica.";
        infoArreglo[2]="La Laguna Humantay toma su nombre del nevado cercano a ella (Humantay, 5.473 m) y es considerada una de las lagunas más hermosas y sagradas de Cusco. Sus aguas turquesas adornadas con nevados del Salkantay (6.270 m) te susurran directamente el porqué de su popularidad. \n" +
                "\n" +
                "Además de los turistas que realizan excursiones de un día a la laguna, están los turistas más aventureros que realizan la llamada “Salkantay Trek”, la cual es una caminata de 5 días a Machu Picchu y donde tienen la chance de visitar esta laguna a su paso. \n" +
                "\n" +
                "Por cierto, ¿te atreverías a dar un recorrido por el PeruRail Expedition? Este servicio es ideal para visitantes que buscan llegar a Machu Picchu en tren al menor costo posible, pero sin dejar de lado las comodidades que pueden encontrar a bordo de un tren.";
        infoArreglo[3]="Para visitar las Salineras de Maras, se recomienda hacerlo a través de una agencia turística o por cuenta propia, debido a que no hay transporte público directo hacia la zona. Los operadores salen diariamente de la ciudad del Cusco por las mañanas y toman la ruta Chinchero-Urubamba en dirección a la comunidad de Maras, con un pequeño desvío hacia a las salineras. El ingreso al lugar tiene un costo aproximado de 10 soles por persona.\n" +
                "\n" +
                " \n" +
                "\n" +
                "La mejor temporada para visitar este hermoso atractivo es durante la estación seca, entre abril y octubre, donde predominan los cielos azules y despejados. Durante esta época, de constante luz solar (que evapora el agua y, por lo tanto, produce más sal), es más común observar a los lugareños atendiendo sus salinas y extrayendo las sales de las pozas.";
        infoArreglo[4]="La montaña de los 7 Colores (también llamado Vinicunca o simplemente ‘montaña arcoíris’) es una de las nuevas y mejores atracciones del Perú. Ubicada a más de 100 kilómetros de la ciudad del Cusco, en una cumbre altitudinal situada a 5,200 metros sobre el nivel del mar (m.s.n.m.). Se trata de una formación montañosa teñida de varias tonalidades producto de la compleja combinación de minerales. Las laderas y la cumbre están teñidas de diversas tonos que incluyen el rojo, morado, verde, amarillo, rosado y otras variaciones. Este atractivo turístico estuvo rodeado de hielo hace no muchos años. Desde el 2016, este lugar recibe a cientos de visitantes al día convirtiéndose, junto con Machu Picchu, en uno de los lugares más visitados en Cusco-Perú. A continuación toda la información sobre la Montaña de 7 Colores.";

        //Imagenes
        agencias[0]=R.drawable.destinouno;
        agencias[1]=R.drawable.destinodos;
        agencias[2]=R.drawable.destinotres;
        agencias[3]=R.drawable.destinocuatro;
        agencias[4]=R.drawable.destinocinco;


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