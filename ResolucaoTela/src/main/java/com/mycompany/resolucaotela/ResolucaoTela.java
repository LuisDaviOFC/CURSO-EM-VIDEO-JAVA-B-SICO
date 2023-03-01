package com.mycompany.resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

public class ResolucaoTela {

    public static void main(String[] args) {
        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        
        int lar = (int) tela.getWidth();
        int alt = (int) tela.getHeight();
        
        System.out.println("A resolução do aparelho é: " + lar + " x " + alt);
    }
}