package juegogonzalofigueras.sistemas;

import ifts16.pp.juego.sistemas.FabricaPrincipal;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import juegogonzalofigueras.entidades.premios;
import juegogonzalofigueras.entidades.jugador;
import juegogonzalofigueras.entidades.nivel;
import juegogonzalofigueras.entidades.preguntasyrespuestas;

/**
 *
 * @author gonzalo figueras
 */
public class fabrica extends FabricaPrincipal {
    public static void crearLugares() {
        
        nivel Marquee = new nivel("Marquee", "Descripcion");
        nivel Palladium = new nivel("Palladium", "Descripcion");
        nivel Babilonia = new nivel("Babilonia", "Descripcion");
        nivel Obras = new nivel("Obras", "Descripcion");
        nivel Estadio = new nivel("Estadio", "Descripcion");
        
        Marquee.agregarVecino(Palladium.referencia());
        Palladium.agregarVecino(Babilonia.referencia());
        Babilonia.agregarVecino(Obras.referencia());
        Obras.agregarVecino(Estadio.referencia());
        
        RepositorioPrincipal.agregar(Marquee, "marquee");
        RepositorioPrincipal.agregar(Palladium, "palladium");
        RepositorioPrincipal.agregar(Babilonia, "babilonia");
        RepositorioPrincipal.agregar(Obras, "obras");
        RepositorioPrincipal.agregar(Estadio, "estadio");   
    }
    public static void crearPersonajeJugador() {
        
        jugador Jugador1 = new jugador ("Jugador1");
        jugador Jugador2 = new jugador ("Jugador2");
        
        RepositorioPrincipal.agregar (Jugador1);
        RepositorioPrincipal.agregar (Jugador2);   
    }
    
    public static void crearItem() {
        
        premios premio1 = new premios ("Ginebra de Luca");
        premios premio2 = new premios ("Púa de Skay");
        premios premio3 = new premios ("Lista de Temas de La Renga");
        premios premio4 = new premios ("Autografos de Los Piojos");
        premios premio5 = new premios ("Guitarra de Mollo");
        
        RepositorioPrincipal.agregar(premio1);
        RepositorioPrincipal.agregar(premio2);
        RepositorioPrincipal.agregar(premio3);
        RepositorioPrincipal.agregar(premio4);
        RepositorioPrincipal.agregar(premio5);
        
        
    }
    
    public static void preguntasyrespuestas1() {
        nivel marquee = (nivel) RepositorioPrincipal.traer("marquee");
        
        //pregunta 1
        preguntasyrespuestas preg1 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 1, pregunta 1";
        preg1.miPreg.pregunta = "Donde tocaron los Redondos por primera vez?";
        preg1.miResp.ArrayResp.add("Boca");
        preg1.miResp.ArrayResp.add("Palladium");
        preg1.miResp.ArrayResp.add("Cemento");
        preg1.miResp.correcta = "Palladium";
        
       
       // marquee.agregarItem(preg1);
        
        RepositorioPrincipal.agregar(preg1, "preg1_1");
        marquee.agregarItem(preg1.referencia("Nivel 1, pregunta 1"));
        //fabrica.agregarItemsAMundo();
        
        //Pregunta 2
        preguntasyrespuestas preg2 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 1, pregunta 2";
        preg1.miPreg.pregunta = "Cual fue la primera banda donde toco Pappo?";
        preg1.miResp.ArrayResp.add("Los Gatos");
        preg1.miResp.ArrayResp.add("Pappo's Blues");
        preg1.miResp.ArrayResp.add("Pescado Rabioso");
        preg1.miResp.correcta = "Los Gatos";
        
        
        RepositorioPrincipal.agregar(preg2, "preg1_2");
        marquee.agregarItem(preg2.referencia("Nivel 1, pregunta 2"));
        //fabrica.agregarItemsAMundo();
    }
        
        public static void preguntasyrespuestas2() {
        nivel palladium = (nivel) RepositorioPrincipal.traer("palladium");
        
        //pregunta 1
        preguntasyrespuestas preg1 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 2, pregunta 1";
        preg1.miPreg.pregunta = "A que banda pertenece el tema 'La bestia Pop'";
        preg1.miResp.ArrayResp.add("La Renga");
        preg1.miResp.ArrayResp.add("Los Redondos");
        preg1.miResp.ArrayResp.add("Divididos");
        preg1.miResp.correcta = "Los Redondos";
        
     
        RepositorioPrincipal.agregar(preg1, "preg2_1");
        palladium.agregarItem(preg1.referencia("Nivel 2, pregunta 1"));
        
        //Pregunta 2
        preguntasyrespuestas preg2 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 2, pregunta 2";
        preg1.miPreg.pregunta = "Como se llama el bajista de Divididos";
        preg1.miResp.ArrayResp.add("Juan Perez");
        preg1.miResp.ArrayResp.add("Semilla Bucciarelli");
        preg1.miResp.ArrayResp.add("Diego Arnedo");
        preg1.miResp.correcta = "Diego Arnedo";
        
       
        RepositorioPrincipal.agregar(preg1, "preg2_2");
        palladium.agregarItem(preg1.referencia("Nivel 2, pregunta 2"));
        
    }
        
        public static void preguntasyrespuestas3() {
        nivel babilonia = (nivel) RepositorioPrincipal.traer("babilonia");
        
        //pregunta 1
        preguntasyrespuestas preg1 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 3, pregunta 1";
        preg1.miPreg.pregunta = "Como le dicen al cantanto de La Renga";
        preg1.miResp.ArrayResp.add("Dorito");
        preg1.miResp.ArrayResp.add("Lays");
        preg1.miResp.ArrayResp.add("Chizzo");
        preg1.miResp.correcta = "Chizzo";
        
       
        RepositorioPrincipal.agregar(preg1, "preg3_1");
        babilonia.agregarItem(preg1.referencia("Nivel 3, pregunta 1"));
        
        //Pregunta 2
        preguntasyrespuestas preg2 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 3, pregunta 2";
        preg1.miPreg.pregunta = "Como se llama el luthier que le fabricaba las guitarras al 'Flaco' Spinetta";
        preg1.miResp.ArrayResp.add("Miranda");
        preg1.miResp.ArrayResp.add("Mercuri");
        preg1.miResp.ArrayResp.add("Tinelli");
        preg1.miResp.correcta = "Miranda";
        
       
        RepositorioPrincipal.agregar(preg1, "preg3_2");
        babilonia.agregarItem(preg1.referencia("Nivel 3, pregunta 2"));
    }
        
      public static void preguntasyrespuestas4() {
        nivel obras = (nivel) RepositorioPrincipal.traer("obras");
        
        //pregunta 1
        preguntasyrespuestas preg1 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 4, pregunta 1";
        preg1.miPreg.pregunta = "A quien pertenece la frase 'Demoliendo Hoteles'";
        preg1.miResp.ArrayResp.add("Luca Prodan");
        preg1.miResp.ArrayResp.add("Charly Garcia");
        preg1.miResp.ArrayResp.add("Palito Ortega");
        preg1.miResp.correcta = "Charly Garcia";
        
        
        RepositorioPrincipal.agregar(preg1, "preg4_1");
        obras.agregarItem(preg1.referencia("Nivel 4, pregunta 1"));
        
        //Pregunta 2
        preguntasyrespuestas preg2 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 4, pregunta 2";
        preg1.miPreg.pregunta = "De que color son los ojos de la muchacha?";
        preg1.miResp.ArrayResp.add("De lata");
        preg1.miResp.ArrayResp.add("De plastico");
        preg1.miResp.ArrayResp.add("De papel");
        preg1.miResp.correcta = "De Papel";
        
       
        RepositorioPrincipal.agregar(preg1, "preg4_2");
        obras.agregarItem(preg1.referencia("Nivel 4, pregunta 2"));
      }
      
      public static void preguntasyrespuestas5() {
        nivel estadio = (nivel) RepositorioPrincipal.traer("estadio");
        
        //pregunta 1
        preguntasyrespuestas preg1 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 5, pregunta 1";
        preg1.miPreg.pregunta = "Como se llama el hijo de Gustavo Cerati";
        preg1.miResp.ArrayResp.add("Pepito");
        preg1.miResp.ArrayResp.add("Polito");
        preg1.miResp.ArrayResp.add("Benito");
        preg1.miResp.correcta = "Benito";
        
        RepositorioPrincipal.agregar(preg1, "preg5_1");
        estadio.agregarItem(preg1.referencia("Nivel 5, pregunta 1"));
        
        //Pregunta 2
        preguntasyrespuestas preg2 = new preguntasyrespuestas();
        preg1.miPreg.titulo = "Nivel 5, pregunta 2";
        preg1.miPreg.pregunta = "Quien es lider de la banda ALMAFUERTE";
        preg1.miResp.ArrayResp.add("Ricardo Fort");
        preg1.miResp.ArrayResp.add("Ricardo Iorio");
        preg1.miResp.ArrayResp.add("Ricardo Montaner");
        preg1.miResp.correcta = "Ricardo Iorio";
        
       RepositorioPrincipal.agregar(preg2, "preg5_2");
       estadio.agregarItem(preg2.referencia("Nivel 5, pregunta 2"));
    }
}