package lista;

import java.util.LinkedList;

/*3 - Faça um metodo que retorne uma lista encadeada invertida, o método deve
retornar uma nova lista, sem remover itens da lista anterior.*/

public class Exe3 {

	public static void main(String[] args) {

		LinkedList<Integer> listaInvertida = new LinkedList<Integer>();
		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		for (int i = lista.size() - 1; i >= 0; i--) {
			listaInvertida.add(lista.get(i));

		}
		System.out.println("Lista: " + lista);
		System.out.println("Lista Invertida: " + listaInvertida);
	}
}
