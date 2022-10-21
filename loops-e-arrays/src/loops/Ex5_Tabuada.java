package loops;

import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int tabuada = 0;

        do {
            System.out.println("Tabuada: ");
            tabuada = scan.nextInt();

        }while(tabuada < 1 || tabuada > 10);

        

        System.out.println("Tabuada de " + tabuada);

        for(int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + "= " + (tabuada*i));
        }
    }
    
}
