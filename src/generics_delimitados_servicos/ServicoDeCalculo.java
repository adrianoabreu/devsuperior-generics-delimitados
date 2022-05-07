package generics_delimitados_servicos;

import java.util.List;

public class ServicoDeCalculo {
	
	// a letra T representa um tipo genérico. Neste caso é um Produto instanciado no programa principal.
	// Porém um método ou classe genérica pode representar qualquer classe instanciada ou classe wraper(String, Integer, Double, etc.)
	public static <T extends Comparable<T>> T max(List<T> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista não pode ser vazia!");
		}
		T max = lista.get(0);
		for(T item : lista) {
			if(item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
		
	}
	
}
