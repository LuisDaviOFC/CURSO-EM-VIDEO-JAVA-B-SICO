package com.mycompany.notaaluno;

import java.util.Scanner;

public class NotaAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        System.out.println("Sua média foi " + m);
        if(m>9){
            System.out.println("Parabéns, pequeno gafanhoto!");
        } else if(m>6 && m<9){
            System.out.println("Boa, pequeno gafanhoto!");
    }else{
            System.out.println("Reprovado. Tente Novamente gafanhoto!");
     }
    }
}
