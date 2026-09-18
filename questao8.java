import java.util.Scanner;

public class questao8{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, original;

        System.out.println("Digite um número final e um inicial:");
        num1 = ler.nextInt();
        num2 = ler.nextInt();

        original = num1;

        while(num1<=num2){
            System.out.print(" " + num1);
            num1 += 1;
        }

        num1 = original;
        System.out.println("");

        do{
            System.out.print(" " + num1);
            num1++;
        } while(num1<=num2);

        num1 = original;
        System.out.println("");

        for(int i = num1; i <=num2; i++){
            System.out.print(" " + i);
        }
    }
}
