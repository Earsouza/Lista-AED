package lista;

import java.util.LinkedList;

/*4 - Faça um método que inverta uma lista encadeada, o método deve inverter a
própria lista sem retornar uma nova. Pode fazer das duas formas*/

public class Exe4 {
	
	public static void main(String[] args) {
		
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		System.out.println(lista);
		
		for (int i = lista.size() - 1; i >= 0; i--) {
			lista.add(lista.get(i));
		}

		System.out.println(lista);
	}

}
