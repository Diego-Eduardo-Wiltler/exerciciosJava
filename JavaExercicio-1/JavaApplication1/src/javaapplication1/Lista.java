/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ELG
 */
public class Lista {
    
    public static void maiorVinte(double x){
    if (x > 20){
        System.out.println("O numero " + x +" e maior 20 (exercicio 1)");
    }else if (x < 20) {
        System.out.println("O numero " + x + "e menor que 20 (exercicio 1)");
    }else{
        System.out.println("Ele e igual a 20 (exercicio 1)");
    }
    
   }
    public static void maiorDezSoma(int j, int y, int total){
    total = j + y;
    if (total > 10){
        System.out.println("O numero " + total + " e maior que 10 (exercicio 2)");
        
        }else if(j + y < 10) {
            System.out.println("o numero " + total + " e maior que 10 (exercicio 2)");
        }else{
            System.out.println("E igual a 10 ou foi inserido um valor incorreto (exercicio 2)");
        }
   
    }
     public static void raizPotencia(double d, double resultado){
     if (d > 0){
        resultado = Math.sqrt(d);
         System.out.println("A raiz de " + d + "  e" + resultado);
     }else if (d < 0){
        resultado = Math.pow(d, 2);
        System.out.println("A raiz de " + d + "  e" + resultado);
     }
     
   } 
    
                    
    public static Scanner receberTeclado(){
      Scanner sc = new Scanner(System.in);
      return sc;
  }

}
