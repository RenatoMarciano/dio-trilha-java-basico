package loops;

import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int media;

        int count = 0;
        do{
        System.out.println("Entre com o número: ");
        numero = scan.nextInt();

        if (numero > maior) maior = numero;
        soma = soma + numero;
        count++;

        } while(count < 5);

        System.out.println("Maior número: " + maior);
        media = soma / 5;
        System.out.println("Média: " + media);
    }
}
