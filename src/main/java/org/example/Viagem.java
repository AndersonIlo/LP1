package org.example;

import java.util.Scanner;

public class Viagem {

    private static final double CONSUMO = 12; // km por litro

    public static String calcular(double distancia, double preco) {
        double litros = distancia / CONSUMO;
        double custo = litros * preco;
        String resultado = "";

        if (distancia > 500) {
            custo = custo - (custo * 0.05);
            resultado = "Desconto de 5% aplicado.\n";
        }

        resultado += String.format("Litros necessários: %.2f%n", litros);
        resultado += String.format("Custo da viagem: R$ %.2f", custo);
        return resultado;
    }

    public static void executar(Scanner entrada) {
        System.out.print("Distância da viagem (km): ");
        double distancia = entrada.nextDouble();

        System.out.print("Preço do combustível (R$ por litro): ");
        double preco = entrada.nextDouble();

        System.out.println(calcular(distancia, preco));
    }
}
