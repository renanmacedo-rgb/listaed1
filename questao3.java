import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");
        num = ler.nextInt();

        if(num%2==0){
            System.out.println("Esse número é par");
        }
        else{
            System.out.println("Esse número é ímpar");
        }
    }
}
