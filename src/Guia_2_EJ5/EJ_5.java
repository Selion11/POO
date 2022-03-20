package Guia_2_EJ5;

import java.util.Locale;

public class EJ_5 {
    public static void main(String args[]){
        StringBuilder frase = new StringBuilder();
        for (String s : args) {
            frase.append(s.toLowerCase());
        }
        if (palindromo(frase.toString())) {
            System.out.println("ES PALINDROMO");
        } else {
            System.out.println("NO ES PALINDROMO");
        }
    }
    private static boolean palindromo(String palabra){
        for (int i = 0; i < palabra.length()/2; i++) {
            if (palabra.charAt(i) != palabra.charAt(palabra.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
