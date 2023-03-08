package br.com.projeto.dados;

public class ListaTarefa {
    private String tarefa;
    private NivelPrioridade prioridade;

    public ListaTarefa(String tarefa, NivelPrioridade prioridade) {
        this.tarefa = tarefa;
        this.prioridade = prioridade;
    }

    public ListaTarefa() {

    }

    public String getTarefa() {
        return tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public NivelPrioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(NivelPrioridade prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "\n" + tarefa + ", prioridade=" + prioridade ;
    }
}
