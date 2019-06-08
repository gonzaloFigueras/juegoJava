/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegogonzalofigueras.sistemas;

import ifts16.pp.juego.entidades.LugarBase;
import ifts16.pp.juego.sistemas.IOBase;
import ifts16.pp.juego.sistemas.NavegacionBase;
import ifts16.pp.juego.sistemas.RepositorioPrincipal;
import juegogonzalofigueras.entidades.nivel;
import juegogonzalofigueras.entidades.preguntasyrespuestas;

/**
 *
 * @author gonzalo
 */
public class Navegacion extends NavegacionBase {
    
    public static void recolectarItems(LugarBase ubicacion) {
        
        
        nivel nivelActual = (nivel) ubicacion;
        IOBase.borrar();
        IOBase.mostrarTexto("Llego a recolectar");
        int i = 0;
        boolean respondioBien = true;
        while (i < 2) {
            preguntasyrespuestas pregs = (preguntasyrespuestas) RepositorioPrincipal.traer(nivelActual.getItems().traer(i).refiereA());
            respondioBien = melomanoalgoritmo.mispreguntas(pregs);
            if (respondioBien) {
                i++;
            }
            
        }
        
        
    }
}
