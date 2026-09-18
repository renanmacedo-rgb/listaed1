import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("Digite o número para descobrir a tabuada:");
        num = ler.nextInt();

        for(int i = 0; i<=10; i++){
            System.out.println(i + " * " + num + " = " + i * num);
        }
    }
}
