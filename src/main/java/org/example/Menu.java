package org.example;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println();
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1-Exercícios Java");
            System.out.println("2-Classes a partir de imagens");
            System.out.println("0-Sair");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    menuExercicios(entrada);
                    break;
                case 2:
                    menuImagens(entrada);
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        entrada.close();
    }

    static void menuExercicios(Scanner entrada) {
        int opcao;

        do {
            System.out.println();
            System.out.println("Qual você deseja executar?");
            System.out.println("1-Verificação de Múltiplo");
            System.out.println("2-Sistema de Login Simplificado");
            System.out.println("3-Compra com desconto");
            System.out.println("4-Temperatura");
            System.out.println("5-Os trinta e cinco camelos");
            System.out.println("6-Calculadora de viagem");
            System.out.println("7-Aluguel de carro");
            System.out.println("0-Voltar ao menu principal");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    Multiplo.executar(entrada);
                    break;
                case 2:
                    Login.executar(entrada);
                    break;
                case 3:
                    Desconto.executar(entrada);
                    break;
                case 4:
                    Temperatura.executar(entrada);
                    break;
                case 5:
                    Camelos.executar(entrada);
                    break;
                case 6:
                    Viagem.executar(entrada);
                    break;
                case 7:
                    AluguelCarro.executar(entrada);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    static void menuImagens(Scanner entrada) {
        int opcao;

        do {
            System.out.println();
            System.out.println("Qual imagem você deseja visualizar?");
            System.out.println("1-Loja de roupas");
            System.out.println("2-Trilha de bicicleta");
            System.out.println("3-Máscaras africanas");
            System.out.println("4-Desenho de mangá");
            System.out.println("5-Todas");
            System.out.println("0-Voltar ao menu principal");
            System.out.print("Opção: ");
            opcao = entrada.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    Principal.testarLoja();
                    break;
                case 2:
                    Principal.testarTrilha();
                    break;
                case 3:
                    Principal.testarMascaras();
                    break;
                case 4:
                    Principal.testarManga();
                    break;
                case 5:
                    Principal.main(new String[0]);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }
}
