package Lista4;

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] nomes = new String[5];
        System.out.println("Digite os nomes:");

        for(int i = 0; i < nomes.length; ++i) {
            nomes[i] = input.nextLine();
        }

        System.out.println("Digite o nome que queira achar:");
        String achado = input.nextLine();
        boolean achei = false;
        String[] var5 = nomes;
        int var6 = nomes.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            String nome = var5[var7];
            if (achado.equals(nome)) {
                achei = true;
            }
        }

        if (achei) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }

        input.close();
    }
}


