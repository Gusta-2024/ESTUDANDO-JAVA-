import java.util.Scanner;

public class ManipulacaoDeArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--Vetor (Array Unidimensional)--");
        int[] vetor = new int[5];
        System.out.println("Insira 5 números inteiros: ");

        for (int i = 0; i < vetor.length; i++) {     
            System.out.print("Digite o número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        int somaVetor = 0;
        for (int numero : vetor) {
            somaVetor += numero;
        }
        System.out.println("\n=> A soma dos valores do vetor é: " + somaVetor);
        System.out.println("\n----------------------------------------\n");

        System.out.println("---Matriz 3 x 3 (Array bidimensional)---");
        int[][] matriz = new int[3][3];

        System.out.println("Insira 9 valores para preencher a matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Insira o valor para a posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nValores da Matriz no formato tabular:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        int somaMatriz = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                somaMatriz += matriz[i][j];
            }
        }
        System.out.println("\n=> A soma de todos os elementos da matriz é: " + somaMatriz);

        scanner.close();
    }
}
