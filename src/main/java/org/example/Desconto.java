package org.example;

import java.util.Scanner;

public class Desconto {

    public static final String[] ITENS = {
            "Arroz (5 kg)", "Feijão (1 kg)", "Óleo de soja (900 ml)", "Açúcar (1 kg)",
            "Café (500 g)", "Macarrão (500 g)", "Farinha (1 kg)", "Fubá (500 g)",
            "Molho de tomate (300 g)", "Sal (1 kg)"
    };

    public static String calcular(int[] quantidades, double[] precos) {
        StringBuilder cupom = new StringBuilder();
        cupom.append("===== CUPOM DO CAIXA =====\n");
        cupom.append("Item | Quantidade | Parcial\n");

        double total = 0;
        for (int i = 0; i < ITENS.length; i++) {
            double parcial = quantidades[i] * precos[i];
            total = total + parcial;
            cupom.append(String.format("%s | %d | R$ %.2f%n", ITENS[i], quantidades[i], parcial));
        }

        double valorFinal = total;
        cupom.append("--------------------------\n");
        cupom.append(String.format("Subtotal: R$ %.2f%n", total));
        if (total > 100) {
            valorFinal = total - (total * 0.10);
            cupom.append(String.format("Desconto (10%%): R$ %.2f%n", total * 0.10));
        }
        cupom.append(String.format("TOTAL A PAGAR: R$ %.2f", valorFinal));

        return cupom.toString();
    }

    public static void executar(Scanner entrada) {
        int[] quantidades = new int[ITENS.length];
        double[] precos = new double[ITENS.length];

        for (int i = 0; i < ITENS.length; i++) {
            System.out.println(ITENS[i]);
            System.out.print("Quantidade: ");
            quantidades[i] = entrada.nextInt();
            System.out.print("Preço unitário: ");
            precos[i] = entrada.nextDouble();
        }

        System.out.println();
        System.out.println(calcular(quantidades, precos));
    }
}
