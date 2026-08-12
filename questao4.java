import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n1,n2,n3, media;

        System.out.println("Digite a primeira nota do aluno:");
        n1 = ler.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        n2 = ler.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        n3 = ler.nextDouble();

        media = (n1+n2+n3)/3;

        System.out.println("Média: " + media);

        if(media>=7){
            System.out.println("Aprovado");
        }
        else if(media >= 3.5 && media < 7){
            System.out.println("O aluno vai para a final");
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
