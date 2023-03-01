package com.mycompany.calculousandometodos;

public class CalculoUsandoMetodos {
   
    static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma é " + s);
    }
    
    static int soma2 (int a, int b){
        int s = a + b;
        return s;
    }
    
    public static void main(String[] args) {
        System.out.println("Começou o programa. ");
        soma(5, 2);
        int sm =  soma2(5, 3);
        System.out.println("A soma é " + sm);
    }
}
