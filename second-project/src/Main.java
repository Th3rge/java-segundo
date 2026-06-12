import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args, String string){
        // Exercicio 1
        String nome = "Apolo";
        var baseYear = OffsetDateTime.now().getYear();
        int anoNascimento = 2017;
        System.out.printf("Olá, %s! Você tem %d anos. \n", nome, baseYear - anoNascimento);

        System.out.println("==============================================================");

        // Exercicio 2
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do lado do quadrado: \n");
        double lado = scanner.nextDouble();
        double area = lado * lado;
        System.out.printf("A área do quadrado é: %.2f \n", area);

        System.out.println("==============================================================");
        
        // Exercicio 3
        System.out.print("Digite o valor da base do triângulo: \n");
        double base = scanner.nextDouble();
        System.out.print("Digite o valor da altura do triângulo: \n");
        double altura = scanner.nextDouble();
        double areaTriangulo = (base * altura) / 2;
        System.out.printf("A área do triângulo é: %.2f \n", areaTriangulo);

        System.out.println("==============================================================");

        // Exercicio 4
        System.out.print("Digite o nome da primeira pessoa: \n");
        String nome1 = scanner.next();
        System.out.print("Digite a idade da primeira pessoa: \n");
        int idade1 = scanner.nextInt();
        System.out.print("Digite o nome da segunda pessoa: \n");
        String nome2 = scanner.next();
        System.out.print("Digite a idade da segunda pessoa: \n");
        int idade2 = scanner.nextInt();
        System.out.printf(string, nome1, nome2, Math.abs(idade1 - idade2));

        System.out.println("==============================================================");

        scanner.close();
    }

}
