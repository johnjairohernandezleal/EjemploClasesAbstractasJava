/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploclasesabstractas;
import abstracto.domain.*;

/**
 *
 * @author john hernandez
 */
public class EjemploClasesAbstractas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /**
         * creacion de objetos
         */
        
        FiguraGeometrica rectangulo = new Rectangulo("Rectangulo");
        FiguraGeometrica triangulo = new Triangulo("Triangulo");
        FiguraGeometrica circulo = new Circulo("Circulo");
        
        
        System.out.println("Rectangulo = " + rectangulo);
        rectangulo.dibujar();
        
        System.out.println("Triangulo = " + triangulo);
        triangulo.dibujar();
        
        System.out.println("Circulo = " + circulo);
        circulo.dibujar();
    }
    
}
