import java.util.Scanner;

public class questao9{
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, original;

        System.out.println("Digite um número final e um inicial:");
        num1 = ler.nextInt();
        num2 = ler.nextInt();

        original = num1;

        while(num1<=num2){
            if(num1%2==1){
                System.out.print(" " + num1);
            }
            num1++;
        }

        num1 = original;
        System.out.println("");

        do{
            if(num1%2==1){
                System.out.print(" " + num1);
            }
            num1++;
        } while(num1<=num2);

        num1 = original;
        System.out.println("");

        for(int i = num1; i <=num2; i++){
            if(num1%2==1){
                System.out.print(" " + num1);
            }
        }
    }
}
