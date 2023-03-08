package br.com.projeto.dados;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ListaTarefa> tarefasDeHoje = new ArrayList<>();

        tarefasDeHoje.add(new ListaTarefa("Ir ao mercado",NivelPrioridade.MEDIA));
        tarefasDeHoje.add(new ListaTarefa("Revisar projetos",NivelPrioridade.ALTA));
        tarefasDeHoje.add(new ListaTarefa("Ligar para o contador",NivelPrioridade.BAIXA));
        tarefasDeHoje.add(new ListaTarefa("Responder os e-mails",NivelPrioridade.MEDIA));
        tarefasDeHoje.add(new ListaTarefa("Ir ao mercado",NivelPrioridade.ALTA));

        System.out.println("Checando as tarefas de hoje: " + tarefasDeHoje);

    }
}
