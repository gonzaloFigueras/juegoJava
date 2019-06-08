package juegogonzalofigueras.entidades;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.utiles.Opciones;
import java.util.ArrayList;

/**
 *
 * @author gonzalo
 */
public class nivel extends LugarBase {
    public ArrayList <preguntasyrespuestas> ArrayQyA;
    private int contador;
    
    
    public nivel(String nombre, String descripcion) {
        super(nombre, descripcion);
        ArrayQyA = new ArrayList ();
        
    }

 
    public int getContador() {
        return contador;
    }

  
    public void setContador() {
        this.contador = contador + 1;
    }

 @Override
    public Opciones opciones(String mensaje) {
        Opciones ops = new Opciones(mensaje);
        if (this.tieneVecinos()) {
            ops.agregar("vecinos", "Ir al siguiente nivel.");
        }
        if (this.tienePortal()) {
            ops.agregar("portal", "Ir a un lugar conectado por el portal de la zona.");
        }
        if (this.tieneLuchadores()) {
            ops.agregar("luchadores", "Combatir con los enemigos de lugar.");
        }
        if (this.tieneComerciantes()) {
            ops.agregar("comerciantes", "Comerciar con los mercaderes del lugar.");
        }
        if (this.tieneHabladores()) {
            ops.agregar("habladores", "Hablar con los habitantes de la zona.");
        }
        if (this.tieneMisiones()) {
            ops.agregar("misiones", "Buscar misiones de la gente del lugar.");
        }
if (this.tieneItems()) {
    ops.agregar("items", "Responder las preguntas de este nivel");
}
            
        
        return ops;
    }
}
