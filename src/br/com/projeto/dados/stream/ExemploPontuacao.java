package br.com.projeto.dados.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ExemploPontuacao {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador("João", 855);
        Jogador jogador2 = new Jogador("Marcelo", 715);
        Jogador jogador3 = new Jogador("Júnior", 582);
        Jogador jogador4 = new Jogador("Paulo", 1001);

        List<Jogador> jogadores = Arrays.asList(jogador1, jogador2, jogador3, jogador4);

        Predicate<Jogador> maiorScore = a -> a.getPontuacao() > 1000;
        Function<Jogador, String> apenasNome = a -> a.getNome();
        Function<Jogador, String> mensagem = a -> "Parabéns, " + a.getNome() +
            "! Você está com a maior pontuação! " + "Pontos: " + a.getPontuacao();

        jogadores.stream()
                .filter(maiorScore)
                .map(mensagem)
                .forEach(System.out::println);

        System.out.println("\nMostrando apenas os nomes: ");
        jogadores.stream()
                .map(apenasNome)
                .forEach(System.out::println);

    }
}
