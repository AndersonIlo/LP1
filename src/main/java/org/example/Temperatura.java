package org.example;

import java.util.Scanner;

public class Temperatura {

    public static final String[] MESES = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    public static String classificar(double temp) {
        if (temp < 18) {
            return "Frio";
        } else {
            return "Temperatura agradável";
        }
    }

    public static String avaliarAno(double[] temperaturas) {
        StringBuilder relatorio = new StringBuilder();
        double soma = 0;

        for (int i = 0; i < MESES.length; i++) {
            relatorio.append(MESES[i]).append(": ").append(classificar(temperaturas[i])).append("\n");
            soma = soma + temperaturas[i];
        }

        double media = soma / MESES.length;
        relatorio.append(String.format("Média anual: %.1f °C%n", media));

        if (media < 18) {
            relatorio.append("Em geral, em São José dos Campos faz frio.");
        } else {
            relatorio.append("Em geral, a temperatura em São José dos Campos é agradável.");
        }

        return relatorio.toString();
    }

    public static void executar(Scanner entrada) {
        double[] temperaturas = new double[MESES.length];

        for (int i = 0; i < MESES.length; i++) {
            System.out.print("Temperatura média de " + MESES[i] + " (°C): ");
            temperaturas[i] = entrada.nextDouble();
        }

        System.out.println();
        System.out.println(avaliarAno(temperaturas));
    }
}
