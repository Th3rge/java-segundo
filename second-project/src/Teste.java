import java.util.Scanner;

public class Teste {

    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);

        for(int numBase = 0; numBase <= 10; numBase++){
            if(numBase == 5){
                System.out.println("\n Pulando o número 5... \n");
                continue;
            } else {
                System.out.printf("Tabuada do %d: \n", numBase);
                for(int i = 0; i <= 10; i++){
                    System.out.printf("%d x %d = %d \n", numBase, i, numBase * i);
                }
                System.out.println("==============================================================");
            }
        }

        scanner.close();
    }

}
