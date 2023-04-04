package br.com.projeto.dados.set.sorteio;

public class Participantes implements Comparable<Participantes>{

    private String nome;
    private int idade;
    private String cidade;

    Participantes(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cidade='" + cidade + '\'' +
                "}\n";
    }

    @Override
    public int compareTo(Participantes participantes) {
        if (this.idade > participantes.getIdade()) {
            return 1;
        } else if (this.idade < participantes.getIdade()) {
            return -1;
        }

        return 0;
    }
}
