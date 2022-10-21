public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);


        int i, num2 = 5;
        for (i = 0; i < 3; i++) {
            num2 += i;
            System.out.print(i);
        }


        System.out.println();
        int[][] numeros = {{4, 9, 8, 5}, {3, 0, 1, 5}, {1, 2, 7, 4}};
System.out.println(numeros[2][2]);


int num3 = 5, count2 = 1;
        do {
            num3 += count2;
            System.out.println(num3);
        } while (count2 <= 3);

    }

    
}
