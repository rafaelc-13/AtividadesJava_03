package Arrays_Exercicios;
import java.util.Scanner;

public class Exerc_2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Double[] notas;
		notas = new Double[5];
		for (int i = 0; i < 5 ; i++) {
		System.out.printf("Digite a %da nota: ",i+1);
		notas[i] = entrada.nextDouble();		
		}
		double soma = 0;
		for (int i = 0; i < 5; i++) {
		soma += notas[i];
		}
		double media = soma/5;
		System.out.println("A media das notas eh "+ media);

}
}