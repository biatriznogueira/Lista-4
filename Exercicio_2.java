package Lista4;

import java.util.Arrays;

public class Exercicio_2 {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5};
        int[] V2 = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            V2[i] = 2 * vetor[i];
        }

        System.out.println("V2 = " + Arrays.toString(V2));




    }

}
