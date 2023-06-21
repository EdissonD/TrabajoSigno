/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.clases.trabajo2estructura;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Trabajo2Estructura {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cadena:");
        String cadena = teclado.nextLine();
        Queue<Character> cola = new LinkedList<>();
        for (char caracter : cadena.toCharArray()) {
            if (caracter == '{' || caracter == '[' || caracter == '(') {
                cola.add(caracter);
                System.out.println(cola);
            } else if (caracter == '}' || caracter == ']' || caracter == ')') {
                if (cola.isEmpty()) {
                    System.out.println("La cadena está balanceada.");
                    return;
                }
                char simboloEntrada = obtenerSimboloEntrada(caracter);
                if (cola.peek() == simboloEntrada) {
                    cola.poll();
                    System.out.println(cola);
                } else {
                    System.out.println("La cadena no está balanceada.");
                    return;
                }
            }
        }
        if (cola.isEmpty()) {
            System.out.println("La cadena está balanceada.");
        } else {
            System.out.println("La cadena no está balanceada.");
        }
    }

    private static char obtenerSimboloEntrada(char simboloSalida) {
        switch (simboloSalida) {
            case '}':
                return '{';
            case ']':
                return '[';
            case ')':
                return '(';
            default:
                return '\0';
        }
    }
}
