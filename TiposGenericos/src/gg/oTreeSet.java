package gg;
import java.util.TreeSet;

public class oTreeSet {
	public static void main(String[] args) {
		TreeSet<String> users = new TreeSet<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        
        users.add("Alice");
        
        System.out.println("Usuários registrados em ordem: " + users);
	}

}
