import java.util.Scanner;

public class Act7 {
    public static void main(String[] args) {
        // Pedir nombre
        Scanner name = new Scanner(System.in);
        System.out.printf("Valor de atributos a declarar: ");
        int a = name.nextInt();
        PrimeNumbers(a);
        Fibonacci(a);
    }

    //Números primos
    public static int[] PrimeNumbers (int a ){
        int[] primeNumbers = new int[a];
        int x = 2;
        boolean prime = true;
        int j = 2;
        // Llenar el array con los números primos
        for(int i = 0; i < a; i++){
            prime = true;
            j = 2;
            while ((prime) && (j != x)){
                if (x % j == 0){
                    prime = false;
                }
                j++;
            }
            if (prime){
                primeNumbers[i] = x;
            }else{
                i--;
            }
            x++;
        }

        //IMPRIMIR NÚMEROS PRIMOS
        System.out.println("Números Primos:");
        for (int i = 0; i < a; i++){
            System.out.printf(primeNumbers[i]+",");
        }
        System.out.println();
        return primeNumbers;
    }

    //Fibonacci
    public static int[] Fibonacci (int a ){
        int[] fibonacci = new int[a];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i<a; i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]);
        }
        System.out.println("Sucesión de Fibonacci:");
        for (int i = 0; i < a; i++){
            System.out.printf(fibonacci[i]+",");
        }
        return fibonacci;
    }
}
