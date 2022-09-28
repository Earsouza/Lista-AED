package lista;

import java.util.LinkedList;

/*
2 - Faça uma método que busque um objeto X de uma lista e ao encontrar a
primeira ocorrência do objeto o método deverá retornar o objeto encontrado e
remover da lista na mesma posição que foi encontrado.
*/
public class Exe2 {

	public static void main(String[] args) {

		Integer x = 3;

		LinkedList<Integer> lista = new LinkedList<Integer>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(3);
		lista.add(4);
		lista.add(5);

		int index = lista.indexOf(x);
		if (index > -1) {
			int removido = lista.remove(index);
			System.out.println("Removido: " + removido);
		}
		System.out.println(lista);

	}

}
