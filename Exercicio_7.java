package Lista4;

import java.util.Scanner;

public class Exercicio_7 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numero = new int[10];

        int valor;
        for(valor = 0; valor < numero.length; ++valor) {
            System.out.println("informe o numero: " + (valor + 1) + ":");
            numero[valor] = input.nextInt();
        }

        int i;
        for(i = 0; i < numero.length; ++i) {
            for(int j = 0; j < numero.length; ++j) {
                if (numero[i] < numero[j]) {
                    valor = numero[j];
                    numero[j] = numero[i];
                    numero[i] = valor;
                }
            }
        }

        System.out.println("Os valores em ordem são:");

        for(i = 0; i < numero.length; ++i) {
            System.out.println(numero[i] + ":");
        }

        input.close();
    }


}
