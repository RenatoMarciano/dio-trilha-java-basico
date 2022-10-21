package loops;

import java.util.Scanner;

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fatorial;
        int multiplicacao = 1;

        System.out.println("Informe o fatorial: ");
        fatorial = scan.nextInt();

        System.out.print(fatorial + " != ");

        for(int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;            
        }
        System.out.print(multiplicacao);
    }
}
