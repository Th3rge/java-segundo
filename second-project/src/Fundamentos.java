import java.util.Scanner;

public class Fundamentos {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Recebe o nome via prompt
        System.out.println("Digite seu nome: ");
        var nome = scanner.next();

        //Recebe a idade via prompt
        System.out.println("Digite sua idade: ");
        var idade = scanner.nextInt();
        
        //Confirmação de emanciapação 
        System.out.println("Você é emancipado? (s/n) ");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        var canDrive = idade >= 18 || isEmancipated && idade >= 16; //Condicional de idade e para saber se já é emancipado
        
        //Confirma se a pessoa está habilitada a dirigir
        var  message = canDrive ? 
        "%s, você pode dirigir! \n".formatted(nome) : 
        "%s, você não pode dirigir! \n".formatted(nome);

        System.out.print(message); //Imprime a mensagem de acordo com a condição
        System.out.println("=============================================================="); //Fim da execução do programa
        scanner.close();
    }
}
