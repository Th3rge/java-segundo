package Exercicios;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Exercicio2 ex2 = new Exercicio2();
        ex2.tabuada();
        ex2.imc();
        ex2.parOuImpar();
    }

    // Exercício 2: Escreva um programa que solicite ao usuário um número inteiro e imprima a tabuada desse número de 1 a 10.
    private void tabuada(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
                int numero = sc.nextInt();
        
        for(int i = 1; i <= 10; i++){
            int resultado = numero * i;
            System.out.printf("%d x %d = %d \n".formatted(numero, i, resultado));
        }
        sc.close();    
    }

        
    

    //Exercicio 3: Escreva um programa que solicite ao usuário seu peso e altura, calcule o Índice de Massa Corporal (IMC) e imprima a categoria correspondente (abaixo do peso, peso normal, sobrepeso, obesidade).
    private void imc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu peso (kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite sua altura (m): ");
        double altura = sc.nextDouble();

        double imcTotal = peso / (altura * altura);

        if(imcTotal < 18.5){
            System.out.println("Abaixo do peso");
        } else if(imcTotal >= 18.5 && imcTotal < 24.9){
            System.out.println("Peso ideal");
        } else if(imcTotal >= 25 && imcTotal < 29.9){
            System.out.println("Levemente acima do peso");
        } else if(imcTotal >= 30 && imcTotal < 34.9){
            System.out.println("Obesidade Grau I");
        } else if   (imcTotal >= 35 && imcTotal < 39.9){
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }
        sc.close();
    }

    //Exercicio 4: Escreva um programa que solicite ao usuário um número inteiro e determine se ele é par ou ímpar.
    private void parOuImpar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = sc.nextInt();
        boolean keepVerifying = true;

        while(keepVerifying){
            System.out.println("Digite um número inteiro: ");
            int toVerify = sc.nextInt();

            if(toVerify < numero)   
            keepVerifying = toVerify % numero == 0;
        }
        sc.close();
    }
}
