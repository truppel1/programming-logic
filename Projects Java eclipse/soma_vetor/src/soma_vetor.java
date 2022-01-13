import java.util.Locale;
import java.util.Scanner;

public class soma_vetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
	
		System.out.println();
		System.out.print("VALORES = ");
		soma = 0;
	
		for ( i= 0; i < n; i++) {
			System.out.print(" " + String.format("%.1f", vet[i]));
			soma = soma + vet[i];
		}
		
		System.out.println("\nSOMA = " + String.format("%.2f", soma));
		
		media = soma / n;
		
		System.out.println("MEDIA = " + String.format("%.2f", media));

	}

}
