/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author ELG
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = Lista.receberTeclado();
        
        double x, a, b, c,d, resultado = 0;
                
        int y, j, total = 0;
        System.out.println("Digite um valor");
        x = sc.nextDouble();
        
        System.out.println("Digite o 1 valor para a segunda operacao");
        j = sc.nextInt();
        System.out.println("Digite o 1 valor para a segunda operacao");
        y = sc.nextInt();
        
        System.out.println("Digite 1 valor para ver se e divisivel por 3");
        a = sc.nextDouble();
        
        System.out.println("Digite 1 valor para checar divisao por 3 e 7");
        b = sc.nextDouble();
        
        System.out.println("Digite 1 valor para checar divisao por 10, 5 e 2");
        c = sc.nextDouble();
        
        System.out.println("Digite 1 valor para raiz se positivo ");
        d = sc.nextDouble();
        
        Lista.raizPotencia(d, resultado);
        Lista2.Divisive3(c);
        Lista2.Divisive2(b);
        Lista.maiorDezSoma(j, y, total);
        Lista.maiorVinte(x);
        Lista2.Divisivel(a);
    }
 

}
