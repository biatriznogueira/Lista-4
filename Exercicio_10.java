package Lista4;

import java.util.Scanner;

public class Exercicio_10 {


    public static int digitos(int numeros) {
        int digitos;
        for(digitos = 1; numeros >= 10; ++digitos) {
            numeros /= 10;
        }

        return digitos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um numero:");
        int usuario = input.nextInt();
        int resultados = digitos(usuario);
        System.out.println("A quantidade de digitos e: " + resultados);


    }
}




