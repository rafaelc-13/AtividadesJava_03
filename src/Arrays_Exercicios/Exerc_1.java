package Arrays_Exercicios;
import java.util.Scanner;

public class Exerc_1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] listaA;
		listaA = new int [10];
		for (int i=0; i<10; i++) {
			System.out.printf("Digite o %do valor da lista: ",i+1);
			listaA[i] = entrada.nextInt();
		}int[] listaB;
		listaB = new int[10];
		for (int i = 0; i<10;i++) {
			System.out.printf("Digite o %do valor da lista: ",i+1);
			listaB[i] = entrada.nextInt();
		}int[] listaC;
		listaC = new int[10];
		for (int i=0; i<= listaC.length - 1; i++) {
			System.out.printf("Digite o %do valor da lista: ",i+1);
			listaC[i] = entrada.nextInt();
		}int[] listaD;
		listaD = new int[10];
		for (int i=0; i<10;i++) {
			System.out.printf("Digite o %do valor da lista: ",i+1);
			listaD[i] = entrada.nextInt();
		}for (int i=0; i <10; i++) {
			System.out.println(listaA[i]+" ");
			System.out.println(listaB[i]+" ");
			System.out.println(listaC[i]+" ");
			System.out.println(listaD[i]+" ");
		}
			
		
	}
}
