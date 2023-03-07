package Lista4;

import java.util.Scanner;

public class Exercicio_9 {

    public static char argumento(int numeros) {
        return (char)(numeros > 0 ? 'p' : 'n');
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numeros = input.nextInt();
        char resultado = argumento(numeros);
        argumento(numeros);
        System.out.println("O numero e: " + resultado);
    }




}