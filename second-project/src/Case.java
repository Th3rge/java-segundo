import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 4: ");
        int number = scanner.nextInt();

        var message = switch (number) {
            case 1,4 ->   {
                var day = number == 1 ? "Sexta" : "Sábado";
                yield String.format("Hoje é %s! Fim de semana!! \n", day);
            }
            case 2 ->   "Hoje é segunda-feira.";
            case 3 ->   "Hoje é terça-feira.";
            default ->  "Você digitou outro dia da semana!";
                };

                
                System.out.println(message);
                
                var condicional = (number != 1 && number != 4);
                if(condicional){
                    System.out.println("\n Não é fim de semana!");
                }

        scanner.close();
    }
}
