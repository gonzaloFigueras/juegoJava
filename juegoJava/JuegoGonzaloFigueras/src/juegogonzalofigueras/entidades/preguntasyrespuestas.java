package juegogonzalofigueras.entidades;

import ifts16.pp.juego.entidades.ItemAbstracto;
import juegogonzalofigueras.componentes.pregunta;
import juegogonzalofigueras.componentes.respuestas;


/**
 *
 * @author gonzalo
 */
public class preguntasyrespuestas extends ItemAbstracto {

    public preguntasyrespuestas() {
        super();
        this.miPreg = new pregunta ();
        this.miResp = new respuestas ();
    }
    
    
    public pregunta miPreg;
    public respuestas miResp;
}
