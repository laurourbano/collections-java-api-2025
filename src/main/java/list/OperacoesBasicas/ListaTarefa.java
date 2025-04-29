package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(tarefa);
            }
        }
        tarefaList.removeIf(tarefa -> tarefasParaRemover.contains(tarefa));
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        for(Tarefa tarefa : tarefaList) {
            System.out.println(tarefa.getDescricao());
        }
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("Descrições das tarefas:");
        listaTarefa.obterDescricoesTarefas();
        listaTarefa.removerTarefa("Tarefa 2");

        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        System.out.println("Descrições das tarefas:");
        listaTarefa.obterDescricoesTarefas();
    }

}
