/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.teste;
import model.design.Juros;

/**
 *
 * @author edson_home
 */
        public class TesteJuros {
        public static void main(String[] args){
            
            
            Juros j = new Juros();
                        
            j.setCapital(1000);
            j.setTaxa(10);
            j.setPrazo(12);
                        
            //Calculando os justos
            j.calcularJuros();
                        
            //Testando a impresão dos dados 
            System.out.println("Para o capital de R$ "+j.getCapital());
            System.out.println("Será aplicado uma taxa de "+j.getTaxa()+ " % " );
            System.out.println("Por conta do prazo de " +j.getPrazo()+ " meses");
            System.out.println("Será cobrado o jurus de R$ " +j.getJuros());
            
            
            
            
}
}