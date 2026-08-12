import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int a,b,c,x1,x2;

        System.out.println("Digite o valor do A:");
        a = ler.nextInt();

        System.out.println("Digite o valor do B:");
        b = ler.nextInt();

        System.out.println("Digite o valor do C:");
        c = ler.nextInt();

        int delta=delts(a,b,c);

        System.out.println("O delta é: " +delta);

        x1=(int)((-b+Math.sqrt(delta))/(2*a));
        x2=(int)((-b-Math.sqrt(delta))/(2*a));

        System.out.println("A raiz x1 é: " +x1);
        System.out.println("A raiz x2 é: " +x2);
    }
    public static int delts(int a, int b, int c){
        return (int)(Math.pow(b,2)-4*a*c);
    }
}
