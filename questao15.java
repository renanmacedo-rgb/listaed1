import java.util.Scanner;

public class questao15 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, fat = 0;

        System.out.println("Digite um número:");
        num = ler.nextInt();

        for(int i = 1; i <= num; i++){
            fat += (num-i)*i;
        }

        System.out.println("O fatorial é:" + fat);
    }
}
