package org.example;

import java.util.Scanner;

public class Camelos {

    public static String dividir(int camelos, int divisor1, int divisor2, int divisor3) {
        int total = camelos + 1;

        int maisVelho = total / divisor1;
        int hamed = total / divisor2;
        int harim = total / divisor3;

        int sobra = total - (maisVelho + hamed + harim);

        return "=== PARTILHA DOS CAMELOS ===\n"
                + "Camelos com o emprestado: " + total + "\n"
                + "Filho mais velho: " + maisVelho + " camelos\n"
                + "Hamed: " + hamed + " camelos\n"
                + "Harim: " + harim + " camelos\n"
                + "Sobraram: " + sobra + " camelos (1 é o emprestado, que volta para Beremiz, e "
                + (sobra - 1) + " fica de recompensa)";
    }


    public static void executar(Scanner entrada) {
        System.out.print("Quantidade de camelos da herança: ");
        int camelos = entrada.nextInt();

        System.out.print("Divisor do filho mais velho (ex: 2 para 1/2): ");
        int divisor1 = entrada.nextInt();

        System.out.print("Divisor do segundo filho, Hamed (ex: 3 para 1/3): ");
        int divisor2 = entrada.nextInt();

        System.out.print("Divisor do filho mais novo, Harim (ex: 9 para 1/9): ");
        int divisor3 = entrada.nextInt();

        System.out.println();
        System.out.println(dividir(camelos, divisor1, divisor2, divisor3));
    }
}
