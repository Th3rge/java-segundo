package Exercicios;
import java.io.PrintStream;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Digite o primeiro número: ");
        int primeiroNum = scanner.nextInt();
        
        System.out.println("\n Digite o segundo número: ");
        int segundoNum = scanner.nextInt();
        int resultado = calcularSoma(primeiroNum, segundoNum);
        System.out.printf("\n A soma dos números é: %d".formatted(resultado));

        System.out.println("\n Digite um número para verificar se é par: ");
        int numero = scanner.nextInt();
        
        int resultadoPar = calcularPar(numero);
        System.out.printf("\n O número digitado foi o %d".formatted(resultadoPar));
        
        scanner.close();

        
    }
    



    private static int calcularSoma( int primeroNum, int segundoNum){        
        return primeroNum + segundoNum;
    }


    private static int calcularPar(int numero){
        PrintStream resultado = null;
        if(numero % 2 == 0){
            resultado = System.out.printf("\n O número digitado é par: %d".formatted(numero));
        }else{
            System.out.println("\n O número digitado é ímpar.");
        }
        return resultado.hashCode();
    }
    
}
