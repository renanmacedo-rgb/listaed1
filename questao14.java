import java.util.Scanner;

public class questao14{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, soma = 0;

        System.out.println("Digite um número final e um inicial:");
        num1 = ler.nextInt();
        num2 = ler.nextInt();

        for(int i = num1; i <= num2; i++){
            soma += num1;
            num1 += 1;
        }

        System.out.println("Somatório: " + soma);
    }
}
