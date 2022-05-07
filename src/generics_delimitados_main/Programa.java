package generics_delimitados_main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import generics_delimitados_entidades.Produto;
import generics_delimitados_servicos.ServicoDeCalculo;

public class Programa {
	/*
	 * Uma empresa de consultoria deseja avaliar a performance de produtos,
	 * funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
	 * o maior dentre um conjunto de elementos. Fazer um programa que leia um
	 * conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
	 * mostre o mais caro deles.
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto> lista = new ArrayList<>();
		
		String diretorio = "C:\\Users\\adria\\OneDrive\\Documentos\\CURSOS UDEMY\\REFAZENDO - Java COMPLETO 2020 Programação Orientada a Objetos + Projetos\\19 Generics, Set e Map\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(diretorio))){
			
			String linha = br.readLine();
			while(linha !=  null){
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0],Double.parseDouble(campos[1])));
				linha = br.readLine();
			}
			
			Produto x = ServicoDeCalculo.max(lista);
			System.out.println("Mais caro:");
			System.out.println(x);
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
