package org.example;

import java.util.Scanner;

public class AluguelCarro {

    private static final double DIARIA = 100;          // valor da diária (R$)
    private static final double KM_POR_DIA = 100;      // km livres por dia
    private static final double VALOR_KM_EXTRA = 0.5;  // R$ por km acima do limite

    public static String calcular(int dias, double km) {
        double total = dias * DIARIA;
        double limite = dias * KM_POR_DIA;
        String resultado = "";

        if (km > limite) {
            double kmExtra = km - limite;
            double adicional = kmExtra * VALOR_KM_EXTRA;
            total = total + adicional;
            resultado += String.format("Km excedente: %.2f%n", kmExtra);
            resultado += String.format("Adicional: R$ %.2f%n", adicional);
        }

        resultado += String.format("Preço do aluguel: R$ %.2f", total);
        return resultado;
    }

    public static void executar(Scanner entrada) {
        System.out.print("Quantidade de dias: ");
        int dias = entrada.nextInt();

        System.out.print("Quilometragem percorrida: ");
        double km = entrada.nextDouble();

        System.out.println(calcular(dias, km));
    }
}
