import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double raio;
        double area;

        System.out.println("Digite o valor do raio:");
        raio = ler.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.println("A área do círculo é:"+ area);
    }
}
