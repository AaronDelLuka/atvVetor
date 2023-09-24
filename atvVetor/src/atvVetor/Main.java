package atvVetor;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1)
		Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        int[] numeros = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.print("Vetor: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        int somaPares = 0;
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
            }
        }
        
        System.out.println("Soma dos números pares: " + somaPares);
        */
		/* 2)
		Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        double[] numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
        }

        scanner.close();

        System.out.print("Vetor: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Posições com números negativos: ");
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] < 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        */
		/* 3)
		Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        double[] numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
        }

        scanner.close();

        System.out.print("Vetor: [");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i]);
            if (i < tamanho - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        double menor = numeros[0];
        double maior = numeros[0];

        for (int i = 1; i < tamanho; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("Menor número: " + menor);
        System.out.println("Maior número: " + maior);
        */
		/* 4)
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        double[] numeros = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o " + (i + 1) + "º número real: ");
            numeros[i] = scanner.nextDouble();
        }

        System.out.print("Elementos nas posições pares: ");
        for (int i = 0; i < tamanho; i += 2) {
            System.out.print(numeros[i]);
            if (i < tamanho - 2) {
                System.out.print(", ");
            }
        }
        System.out.println();
        */
	}

}
