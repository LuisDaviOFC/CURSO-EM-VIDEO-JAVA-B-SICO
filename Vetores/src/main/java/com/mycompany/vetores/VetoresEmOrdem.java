package com.mycompany.vetores;

import java.util.Arrays;

public class VetoresEmOrdem {
    public static void main(String[] args) {
            double v[] = {3.5, 2.75, 9, -4.5};
            Arrays.sort(v);
            for(double valor: v){
                System.out.println(valor + " ");
            }
    }
}
