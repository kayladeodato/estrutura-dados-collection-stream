package br.com.projeto.dados.list.playlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Musica> playlist1 = new ArrayList<>() {{
            add(new Musica("Arabella", "Arctic Monkeys", 3.4));
            add(new Musica("Dani California", "Red Hot Chilli Peppers", 3.57));
            add(new Musica("Land of Confusion", "Disturbed", 4.78));
            add(new Musica("The Man Who Sold The World", "Nirvana", 4.35));
            add(new Musica("Ritual", "Ghost", 4.48));
            add(new Musica("Arabella", "Arctic Monkeys", 3.4));
        }};;


        System.out.println(playlist1);

        //System.out.println("A posição da música Ritual do Ghost:" + playlist1.indexOf());
        System.out.println("Substituindo a última música: " + playlist1.set(5, new Musica("Hysteria", "Muse", 3.78)));

        System.out.println("Playlista atualizada: \n" + playlist1);

        System.out.println("A playlist contém a música Help! dos Bealtes? " + playlist1.contains("Help!"));

        System.out.println("A música que está na posição 5 da playlist: " + playlist1.get(4));

        System.out.println("A música que contém a menor duração (em minutos): " + Collections.min(playlist1));

        System.out.println("A música que contém a maior duração (em minutos): " + Collections.max(playlist1));

        Collections.shuffle(playlist1);

        System.out.println("Tocando a playlist em modo aleatório: " + (playlist1));

        System.out.println("A música na posição 2 " + playlist1.get(1));
        System.out.println("Removendo a música da playlista na posiçao 3: " + playlist1.remove(1));
        System.out.println("Playlista atualizada: \n" + playlist1);

        Iterator<Musica> iterator =  playlist1.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next().getDuracao();
            soma += next;
        }

        System.out.println("A duração total da playlist é de " + soma + " minutos.");

        playlist1.clear();
        System.out.println("Apagando toda a playlist. Playlist atualizada: \n" + playlist1);

        System.out.println("A playslist está vazia? " + playlist1.isEmpty());

    }
}
