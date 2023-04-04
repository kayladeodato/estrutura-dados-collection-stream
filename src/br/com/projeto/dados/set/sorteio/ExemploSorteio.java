package br.com.projeto.dados.set.sorteio;

import java.util.*;

public class ExemploSorteio {

    public static void main(String[] args) {

        Set<Participantes> participantesSorteio = new HashSet<>() {{
            add(new Participantes("Amanda", 25, "Rio de Janeiro"));
            add(new Participantes("Maria", 56, "Manaus"));
            add(new Participantes("Jorge", 35, "Recife"));
            add(new Participantes("Sérgio", 65, "Rondônia"));
            add(new Participantes("Juliana", 18, "São Paulo"));
        }};

        System.out.println(participantesSorteio);

        Participantes participante3 = new Participantes("Sabrina", 45, "Macapá");
        participantesSorteio.add(participante3);

        System.out.println("Incluindo mais um participante: ");
        System.out.println(participantesSorteio);

        System.out.println("Dentre os participantes possui Sabrina? " + participantesSorteio.contains(participante3));

        System.out.println("Participante mais novo = " + Collections.min(participantesSorteio));
        System.out.println("Participante com mais idade = " + Collections.max(participantesSorteio));

        System.out.println("Removendo o participante na posição 5 " + participantesSorteio.remove(participante3));

        System.out.println(participantesSorteio);

        System.out.println("Sorteio encerrado. Removendo todos os participantes do sorteio");
        participantesSorteio.clear();

        System.out.println("A lista de participantes está vazia? " + participantesSorteio.isEmpty());

        System.out.println("Mostrando os elementos por ordem de inserção: ");
        Set<Participantes> participantesSorteio2 = new LinkedHashSet<>() {{
            add(new Participantes("Amanda", 25, "Rio de Janeiro"));
            add(new Participantes("Maria", 56, "Manaus"));
            add(new Participantes("Jorge", 35, "Recife"));
            add(new Participantes("Sérgio", 65, "Rondônia"));
            add(new Participantes("Juliana", 18, "São Paulo"));
            add(new Participantes("Sabrina", 45, "Macapá"));
        }};

        for (Participantes participantes: participantesSorteio2) {
            System.out.println(participantes.getNome() + ", " + participantes.getIdade() + ", " + participantes.getCidade());
        }

        System.out.println("\nMostrando os elementos por ordem crescente: ");
        Set<Participantes> participantesSorteio3 = new TreeSet<>() {{
            add(new Participantes("Amanda", 25, "Rio de Janeiro"));
            add(new Participantes("Maria", 56, "Manaus"));
            add(new Participantes("Jorge", 35, "Recife"));
            add(new Participantes("Sérgio", 65, "Rondônia"));
            add(new Participantes("Juliana", 18, "São Paulo"));
            add(new Participantes("Sabrina", 45, "Macapá"));
        }};

        for (Participantes participantes: participantesSorteio3) {
            System.out.println(participantes.getNome() + ", " + participantes.getIdade() + ", " + participantes.getCidade());
        }

    }
}
