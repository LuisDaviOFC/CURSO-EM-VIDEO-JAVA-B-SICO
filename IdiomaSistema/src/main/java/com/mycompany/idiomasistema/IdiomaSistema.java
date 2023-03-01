package com.mycompany.idiomasistema;

import java.util.Locale;



public class IdiomaSistema {
    
    public static void main(String[] args) {
        Locale loc = Locale.getDefault();
        String idioma = loc.getDisplayLanguage();
        
        System.out.println("O idioma do aparelho é: ");
        System.out.println(idioma);
    }
}
