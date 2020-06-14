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
            
            j.capital = 1000;
            j.taxa = 10;
            j.prazo = 12;
                        
            
            
            //Testando a impresão dos dados 
            System.out.println("Para o capital de R$ "+j.capital);
            System.out.println("Será aplicado uma taxa de "+j.taxa+ " % " );
            System.out.println("Por conta do prazo de " +j.prazo+ " meses");
            System.out.println("Será cobrado o jurus de R$ " +j.jurus);
 
}
}