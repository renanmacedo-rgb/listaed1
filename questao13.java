import java.util.Scanner;

public class questao13 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int div = 0, num;

        System.out.println("Digite o número que você quer saber se é primo:");
        num = ler.nextInt();

        for(int i = 1; i <= num; i++){
            if(num%i==0){
                div += 1;
            }
        }

        if(div==2){
            System.out.println("É primo");
        } else{
            System.out.println("Não é primo");
        }

    }
}
