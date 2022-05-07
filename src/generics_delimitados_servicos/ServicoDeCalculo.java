package generics_delimitados_servicos;

import java.util.List;

public class ServicoDeCalculo {
	
	// a letra T representa um tipo gen�rico. Neste caso � um Produto instanciado no programa principal.
	// Por�m um m�todo ou classe gen�rica pode representar qualquer classe instanciada ou classe wraper(String, Integer, Double, etc.)
	public static <T extends Comparable<T>> T max(List<T> lista) {
		if(lista.isEmpty()) {
			throw new IllegalStateException("Lista n�o pode ser vazia!");
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
