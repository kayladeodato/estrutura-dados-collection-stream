package br.com.projeto.dados.set.sorteio;

import java.util.*;

public class ExemploSimples {
    public static void main(String[] args) {
        Set<String> participantesSorteio = new HashSet<>(Arrays.asList("Amanda", "Maria", "Jorge", "Sérgio", "Juliana"));

        System.out.println(participantesSorteio.toString());;

        System.out.println("\nAdicionando um valor repetido: Maria");
        participantesSorteio.add("Maria");

        System.out.println(participantesSorteio.toString());

        System.out.println("\nDentre os participantes possui João? " + participantesSorteio.contains("João"));
        System.out.println("\nDentre os participantes possui Amanda? " + participantesSorteio.contains("Amanda"));

        System.out.println("\nParticipante mais novo = " + Collections.min(participantesSorteio));
        System.out.println("\nParticipante com mais idade = " + Collections.max(participantesSorteio));

        System.out.println("\nRemovendo o participante Jorge " + participantesSorteio.remove(("Jorge")));

        System.out.println(participantesSorteio.toString());

        System.out.println("\nMostrando os elementos por ordem de inserção: ");
        Set<String> participantesSorteio2 = new LinkedHashSet<>(Arrays.asList("Amanda", "Maria", "Jorge", "Sérgio", "Juliana"));
        System.out.println(participantesSorteio2.toString());

        System.out.println("\nMostrando os elementos por ordem crescente: ");
        Set<String> participantesSorteio3 = new TreeSet<>(Arrays.asList("Amanda", "Maria", "Jorge", "Sérgio", "Juliana"));
        System.out.println(participantesSorteio3.toString());
    }
}
