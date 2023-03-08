package br.com.projeto.dados.list.playlist;

public class Musica implements Comparable<Musica> {
    private String nomeMusica;
    private String artista;
    private double duracao;

    public Musica(String nomeMusica, String artista, double duracao) {
        this.nomeMusica = nomeMusica;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Música: " + nomeMusica + ", Artista: " + artista + ", Duração: " + duracao + "\n";
    }


    @Override
    public int compareTo(Musica musica) {
        if (this.duracao > musica.getDuracao()) {
            return 1;
        }
        if (this.duracao < musica.getDuracao()) {
            return -1;
        }
        return 0;
    }
}

