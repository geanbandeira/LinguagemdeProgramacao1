package gg;
import java.util.HashMap;

public class oHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> inventory = new HashMap<>();
        inventory.put("Limão", 50);
        inventory.put("Banana", 30);
        inventory.put("Laranja", 20);
        
        int limao = inventory.get("Limão");
        System.out.println("Quantidade de Limão: " + limao);
	}

}
