/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author ELG
 */
public class Lista2 {
   /* private double raiz;
        public double exerTrês(double d){
        double a;
        if(d > 10){
        a = Math.sqrt(d);
        raiz = a;
        return a;
        }*/
    
    public static void Divisivel(double a){
        if(a % 3 == 0){
            System.out.println("O numero " + a + " e divisivel (exercicio 4)");
        }else{
            System.out.println("O numero " + a + " nao e divisivel (exercicio 4)");
        }
    }
    
    public static void Divisive2(double b){
        if (b % 3 == 0 && b % 7 == 0){
            System.out.println("O numero " + b + " e divisivel por 3 e 7 (exercicio 5)");
        }else if (b % 3 == 0 && 7 != 0){
            System.out.println("O numero " + b + " e divisivel por 3 mas n por 7 (exercicio 5)");
        } else if (b % 7 == 0 && 3 != 0){
            System.out.println("O numero " + b + " e divisivel por 7 mas n por 3 (exercicio 5)");
        }else{
            System.out.println("Ele n e divisivel por nenhum (exercicio 5)" );
        }
    }
    
        public static void Divisive3(double c   ){
        if (c % 10 == 0 && c % 5 == 0 && c % 2 == 0){
            System.out.println("O numero " + c + " e divisivel por 10, 5, 2 (exercicio 6)");
        }else if (c % 10 == 0 && c % 5 == 0 && c % 2 != 0){
            System.out.println("O numero " + c + " e divisivel por 10, 5 mas n por 2 (exercicio 6)");
        } else if (c % 10 == 0 && c % 5 != 0 && c % 2 != 0){
            System.out.println("O numero " + c + " e divisivel por 10 mas n por 5, 2 (exercicio 6)");
        }else if (c % 10 != 0 && c % 5 == 0 && c % 2 == 0){
            System.out.println("O numero " + c + " e divisivel por 5, 2 mas n por 10 (exercicio 6)");
        }else if (c % 10 != 0 && c % 5 != 0 && c % 2 == 0){
            System.out.println("O numero " + c + " e divisivel por  2 mas n por 10,5 (exercicio 6)");
        }
         else if (c % 10 != 0 && c % 5 != 0 && c % 2 == 0){
            System.out.println("O numero " + c + " e divisivel por  2 mas n por 10,5 (exercicio 6)");
         }
        else{
            System.out.println("Ele n e divisivel por nenhum (exercicio 6)" );
        }
    }
            }

  
    

    