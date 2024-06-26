/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conferencia;

import Analizadores.Lexico;
import Analizadores.Sintactico;
import java.io.StringReader;

/**
 *
 * @author Douglas
 */
public class Conferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Interfaz_Grafica ig = new Interfaz_Grafica();
        ig.setVisible(true);
    }
    
    public static void Analizar(String texto) {
        StringReader st = new StringReader(texto);
        Lexico aL = new Lexico(st);
        Sintactico aS = new Sintactico(aL);
        
        try {
            aS.parse();
        } catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}