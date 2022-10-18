public class Operadores {

    public static void main (String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
    
        System.out.println(nomeCompleto);

        
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);


        int numero = 5;

        numero = -numero;
        System.out.println(numero);

        numero = numero * -1;
        System.out.println(numero);


        int number = 5;
        //x repeticao
        number++;
        //number = number + 1;

        System.out.println(number);


        int number01 = 5;
        //x repeticao
        number01--;
        //number = number + 1;

        System.out.println(number01);


        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        //Ternário
        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);

        int resul = a==b ? 1 : 0;

        System.out.println(resul);

        //Operadores relacionais
        int nota1 = 1;
        int nota2 = 2;

        boolean simNao = nota1 == nota2;

        if(nota1 < nota2){
            System.out.println("A nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois " + simNao);

        simNao = nota1 != nota2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = nota1 > nota2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        String nomeUm = "GLEYSON";
        String nomeDois = "GLEYSON";

        System.out.println(nomeUm == nomeDois);


        String nome1 = "GLEYSON";
        String nome2 = new String ("GLEYSON");

        System.out.println(nome1.equals(nome2));


        //Operadores lógicos
        boolean condicao1 = true;
        boolean condicao2 = true;


        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        System.out.println("Fim");

        if(condicao1 && (7 > 4 )){
            System.out.println("As duas condições são verdadeiras");
        }

    }
    
}
