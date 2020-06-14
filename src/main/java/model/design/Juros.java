/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.design;

/**
 *
 * @author edson_home
 */

public class Juros {
    private double capital;
    private double taxa;
    private double prazo;
    public double juros;
                   
    public void calcularJuros(){
       
            setJuros(100 / (getCapital() * getTaxa() * getPrazo()));
                    
                               } 
    /**
     * @return the capital
     */
    public double getCapital() {
        return capital;
    }

    /**
     * @param capital the capital to set
     */
    public void setCapital(double capital) {
        this.capital = capital;
    }

    /**
     * @return the taxa
     */
    public double getTaxa() {
        return taxa;
    }

    /**
     * @param taxa the taxa to set
     */
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    /**
     * @return the prazo
     */
    public double getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(double prazo) {
        this.prazo = prazo;
    }

    /**
     * @return the juros
     */
    public double getJuros() {
        return juros;
    }

    /**
     * @param juros the juros to set
     */
    public void setJuros(double juros) {
        this.juros = juros;
    }

 }


