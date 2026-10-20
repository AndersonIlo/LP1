package org.example;

import loja.Loja;
import loja.Manequim;
import loja.Roupa;
import manga.Cabelo;
import manga.Personagem;
import manga.Rosto;
import mascaras.Exposicao;
import mascaras.Mascara;
import mascaras.Painel;
import trilha.Bicicleta;
import trilha.Ciclista;
import trilha.Trilha;

public class Principal {

    public static void main(String[] args) {
        testarLoja();
        testarTrilha();
        testarMascaras();
        testarManga();
    }

    public static void testarLoja() {
        System.out.println("===== IMAGEM 1: LOJA DE ROUPAS =====");

        Loja loja = new Loja("Dorinho's", "São José dos Campos", 50);
        Roupa camisa = new Roupa("Camisa social azul", "M", 129.90);
        Roupa terno = new Roupa("Terno cinza", "48", 599.00);
        Manequim manequim = new Manequim("masculino", 1.85);

        System.out.println(loja.exibirInformacoes());
        System.out.println(manequim.vestir(terno));
        System.out.println(manequim.exibir());

        camisa.ajustarTamanho("G");
        camisa.aplicarDesconto(10);
        System.out.println(camisa.exibirEtiqueta());

        System.out.println(loja.vender(camisa));
        System.out.println(loja.receberProdutos(20));
        System.out.println(manequim.despir());
        System.out.println(manequim.exibir());
        System.out.println(loja.exibirInformacoes());
        System.out.println();
    }

    public static void testarTrilha() {
        System.out.println("===== IMAGEM 2: TRILHA DE BICICLETA =====");

        Trilha trilha = new Trilha("Trilha da Mata", 8, "terra batida");
        Bicicleta bikeVermelha = new Bicicleta("Caloi", "vermelha");
        Bicicleta bikeAzul = new Bicicleta("Oggi", "azul");
        Ciclista ana = new Ciclista("Ana", bikeVermelha);
        Ciclista bruno = new Ciclista("Bruno", bikeAzul);

        System.out.println(trilha.exibirDados());
        System.out.printf("Tempo estimado a 16 km/h: %.1f h%n", trilha.calcularTempo(16));

        System.out.println(bikeVermelha.trocarMarcha(7));
        System.out.println(ana.pedalar(trilha));
        System.out.println(bruno.pedalar(trilha));
        System.out.println(bikeVermelha.frear());
        System.out.println(ana.descansar());

        System.out.println(ana.exibirDados());
        System.out.println(bruno.exibirDados());
        System.out.println();
    }

    public static void testarMascaras() {
        System.out.println("===== IMAGEM 3: MÁSCARAS AFRICANAS =====");

        Mascara m1 = new Mascara("Congo", "madeira", "marrom");
        Mascara m2 = new Mascara("Gabão", "madeira", "branca");
        Mascara m3 = new Mascara("Mali", "bronze", "dourada");
        Painel painel = new Painel("palha", 2);
        Exposicao exposicao = new Exposicao("Arte Africana", "Museu Afro Brasil");

        System.out.println(exposicao.abrir());
        System.out.println(painel.pendurar(m1));
        System.out.println(painel.pendurar(m2));
        System.out.println(painel.pendurar(m3));
        System.out.println(painel.retirar(m1));
        System.out.println(painel.pendurar(m3));

        System.out.println(m2.pintar("vermelha e branca"));
        System.out.println(m3.catalogar("AFR-003"));
        System.out.println(painel.exibirDados());

        exposicao.registrarVisitante();
        exposicao.registrarVisitante();
        exposicao.registrarVisitante();
        System.out.println(exposicao.exibirDados());
        System.out.println();
    }

    public static void testarManga() {
        System.out.println("===== IMAGEM 4: DESENHO DE MANGÁ =====");

        Cabelo espetado = new Cabelo("espetado", "curto", "preto");
        Cabelo franja = new Cabelo("com franja", "longo", "castanho");
        Rosto rosto = new Rosto("oval", "grandes");
        Personagem personagem = new Personagem("Hikari", rosto, espetado);

        System.out.println(personagem.apresentar());
        System.out.println(personagem.desenhar());

        System.out.println(rosto.sorrir());
        System.out.println(personagem.trocarCabelo(franja));
        System.out.println(franja.cortar());
        System.out.println(franja.pentear("liso"));
        System.out.println(rosto.mudarExpressao("determinada"));
        System.out.println(personagem.desenhar());
    }
}
