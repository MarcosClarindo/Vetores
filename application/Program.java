package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		// Criando um vetor Product, e passando a variável n como quantidade de
		// elementos.

		Product[] vect = new Product[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine(); // Para dar um quebra de linha que ficou pendente
			// Criando uma variável name
			String name = sc.nextLine();
			double price = sc.nextDouble();
			// Instanciando um novo produto da classe Produto.
			vect[i] = new Product(name, price);

		}

		// Para calcular a média do vetor
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			// Para acessar o vetor e pegar o valor com o getPrive
			sum += vect[i].getPrice();
		}
		double avg = sum / n;

		System.out.printf("AVAREGE PRICE: %.2F%N", avg);

		sc.close();
	}

}
