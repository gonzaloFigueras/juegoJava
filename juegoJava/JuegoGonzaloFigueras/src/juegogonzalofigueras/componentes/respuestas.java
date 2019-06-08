package juegogonzalofigueras.componentes;

import ifts16.pp.juego.utiles.Opciones;
import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class respuestas {

    public respuestas() {
        this.ArrayResp = new ArrayList <String> ();
    }
    
    public ArrayList <String> ArrayResp;
    
    public String correcta;
    
    public Opciones opciones(String texto) {
        Opciones ops = new Opciones(texto);
        int i = 1;
        for (String resp : ArrayResp) {
            ops.agregar(resp, resp);
            i++;
        } 
        return ops;
    } 
}
