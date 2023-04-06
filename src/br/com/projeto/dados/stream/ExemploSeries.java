package br.com.projeto.dados.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploSeries {
    public static void main(String[] args) {

        List<String> series = new ArrayList<>(
                Arrays.asList("Breaking Bad", "The Boys", "The Last of Us", "Vikings", "The Office","Westworld"));

        series.stream()
                .forEach(System.out::println);

        System.out.println("\nColocando as séries em letras maiúsculas: ");
        series.stream()
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);

        System.out.println("\nMostrando as séries que começam com T: ");
        series.stream()
                .filter(n -> n.startsWith("T"))
                .forEach(System.out::println);

        System.out.println("\nMostrando as quatro primeiras séries e colocando dentro de um Set: ");
        series.stream()
                .limit(4)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("\nDeixando a lista de séries em modo aleatório: ");
        series.stream()
                .parallel()
                .forEach(System.out::println);
    }
}
