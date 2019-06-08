package juegogonzalofigueras;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.NavegacionBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import java.awt.EventQueue;
import juegogonzalofigueras.sistemas.Navegacion;
import juegogonzalofigueras.sistemas.fabrica;

/**
 *
 * @author gonzalo
 */
public class JuegoGonzaloFigueras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        IOBase ventana = new IOBase();
        EventQueue.invokeLater(ventana);
        fabrica.crearLugares();
        fabrica.preguntasyrespuestas1();
        fabrica.preguntasyrespuestas2();
        IOBase.mostrarTexto("Bienvenido al Melomano!!!");
        LugarBase marquee = (LugarBase) RepositorioPrincipal.traer("marquee");
        Navegacion.iniciar(marquee);
        
        
    }
    
}
