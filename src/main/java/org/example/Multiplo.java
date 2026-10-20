package org.example;

import java.util.Scanner;

public class Multiplo {

    public static String verificar(int a, int b) {
        if (b == 0) {
            return "Não é possível verificar: divisão por zero.";
        } else if (a % b == 0) {
            return a + " é múltiplo de " + b;
        } else {
            return a + " NÃO é múltiplo de " + b;
        }
    }

    public static void executar(Scanner entrada) {
        System.out.print("Digite o primeiro número: ");
        int a = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = entrada.nextInt();

        System.out.println(verificar(a, b));
    }
}
