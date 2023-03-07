package Lista4;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int[] A = new int[10];
        int[] M = new int[10];


        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < A.length; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Digite o valor de X:");
        int X = input.nextInt();

        for (int i = 0; i < A.length; i++) {
            M[i] = A[i] * X;
        }

        System.out.println("Vetor M:");
        for (int i = 0; i < M.length; i++) {
            System.out.print(M[i] + " ");
        }
    }
}
