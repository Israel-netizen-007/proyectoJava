/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polindromo;

/**
 *
 * @author 52771
 */
public class Palindromo {

    /**
     * Método recursivo que verifica si un texto es palíndromo.
     * @param texto La cadena a evaluar
     * @return true si es palíndromo, false en caso contrario
     */

    // Método Wrapper (público)
    public static boolean esPalindromo(String texto) {
        // Normalización: convertir a minúsculas y quitar espacios
        texto = texto.toLowerCase().replaceAll("\\s+", " ");
        
        // Llamada inicial al método recursivo auxiliar
        return esPalindromoAux(texto, 0, texto.length() - 1);
    }

    // Método Auxiliar (privado y recursivo)
    private static boolean esPalindromoAux(String texto, int inicio, int fin) {
        // Caso base 1: Fallo
        if (texto.charAt(inicio) != texto.charAt(fin)) {
            return false;
        }
        
        // Caso base 2: Éxito
        if (inicio >= fin) {
            return true;
        }

        // Paso recursivo
        return esPalindromoAux(texto, inicio + 1, fin - 1);
    }
     public static void main(String[] args) {
        System.out.println(esPalindromo("radar"));
        System.out.println(esPalindromo("casa"));
    }
}

   