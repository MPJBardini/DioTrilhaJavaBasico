public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA"; //junção de palavras
        System.out.println(nomeCompleto);  

        //Concatenação
        String concatenacao ="?";

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

        //Operador de negação
        
        //Modelo 1
        int numero = 5;

        System.out.println(- numero);
        System.out.println(numero);

        //Modelo 2

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        //x repetição
        
        //number = number +1;

        int number = 5;

        System.out.println(++ numero);

        System.out.println(numero ++);

        System.out.println(numero);

        System.out.println(numero --);


    }
    
}
