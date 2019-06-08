/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogonzalofigueras.sistemas;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.Sistema;
import ifts16.pp.juego.utiles.Opcion;
import juegogonzalofigueras.entidades.preguntasyrespuestas;

/**
 *
 * @author gonzalo
 */
public class melomanoalgoritmo extends Sistema{
    
    public static boolean mispreguntas (preguntasyrespuestas pr){
           
           
           IOBase.mostrarTexto(pr.miPreg.titulo);
           Opcion elegida = IOBase.elegirOpcion(pr.miResp.opciones(pr.miPreg.pregunta));
           if (elegida.getComando().equalsIgnoreCase(pr.miResp.correcta)) {
               IOBase.mostrarTexto("Correcta");
               return true;
           }
           return false;
        
    }
    
}
