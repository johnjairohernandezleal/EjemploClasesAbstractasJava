/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracto.domain;

/**
 *
 * @author john hernandez
 */
public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    public void dibujar(){
         /**
         * comportamiento de la subclase
         */
        System.out.println("aqui deberia dibujar un : " + this.getClass().getSimpleName());
    }
    
}
