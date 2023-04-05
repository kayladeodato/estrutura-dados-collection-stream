package br.com.projeto.dados.map;

import java.util.*;

public class ExemploCardapio {
    public static void main(String[] args) {

        Map<String, Double> cardapio = new HashMap<>() {{
            put("Risoto", 39.90);
            put("Espaguete", 29.90);
            put("Lasanha", 49.90);
            put("Salada", 25.90);
            put("Filé à Parmegiana", 19.90);
            put("Torta de Chocolate", 14.90);
        }};

        System.out.println(cardapio.toString());

        System.out.println("\nO restaurante possui Feijoada no cardápio? " + cardapio.containsKey("Feijoada"));
        System.out.println("O restaurante possui Lasanha no cardápio? " + cardapio.containsKey("Lasanha"));
        System.out.println("O restaurante possui algum prato no valor de R$ 15.90? " + cardapio.containsValue(15.90));
        System.out.println("O restaurante possui algum prato no valor de R$ 19.90? " + cardapio.containsValue(19.90));

        System.out.println("\nQuais as possibilidades de refeição? " + cardapio.keySet());
        System.out.println("Quais as possibilidades de valores do cardápio? " + cardapio.values());
        System.out.println("Quantas opções de refeição existe no restaurante? " + cardapio.size());

        System.out.println("\nQual o prato mais barato? " + Collections.min(cardapio.values()));
        System.out.println("Qual o prato mais barato? " + Collections.max(cardapio.values()));

        System.out.println("\nMostrando o cardápio pela ordem de inserção");
        Map<String, Double> cardapioOrdemInsercao = new LinkedHashMap<>() {{
            put("Risoto", 39.90);
            put("Espaguete", 29.90);
            put("Lasanha", 49.90);
            put("Salada", 25.90);
            put("Filé à Parmegiana", 19.90);
            put("Torta de Chocolate", 14.90);
        }};

        System.out.println(cardapioOrdemInsercao.toString());

        System.out.println("\nMostrando o cardápio pela ordem alfabética");
        Map<String, Double> cardapioOrdemAlfabetica = new TreeMap<>(cardapio);
        System.out.println(cardapioOrdemAlfabetica.toString());

    }
}

