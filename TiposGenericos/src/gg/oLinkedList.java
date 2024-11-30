package gg;
import java.util.LinkedList;


public class oLinkedList {
	public static void main(String[] args) {
		LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Estudar Java");
        tasks.add("Fazer exercícios");
        tasks.add("Revisar anotações");
        tasks.remove("Fazer exercícios");
        System.out.println("Tarefas pendentes: " + tasks);
	}
}
