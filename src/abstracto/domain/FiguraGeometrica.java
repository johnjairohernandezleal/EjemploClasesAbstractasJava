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
public abstract class FiguraGeometrica {
    
    private String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        
        this.tipoFigura = tipoFigura;
    }
    
    /**
     * la clase padre no define comportamiento
     */
    public abstract void dibujar();

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
    
    
}
