package generics_delimitados_entidades;

public class Produto implements Comparable<Produto>{

	private String nome;
	private Double valor;
	
	public Produto(String nome, Double valor) {
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return nome + ", " + String.format("%.2f", valor);
	}
	
	@Override
	public int compareTo(Produto outroProduto) {
		return valor.compareTo(outroProduto.getValor());
	}
	
}
