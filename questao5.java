import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double n1,n2,n3,n4,mediap,mediaf;

        System.out.println("Digite a primeira nota do aluno:");
        n1 = ler.nextDouble();

        System.out.println("Digite a segunda nota do aluno:");
        n2 = ler.nextDouble();

        System.out.println("Digite a terceira nota do aluno:");
        n3 = ler.nextDouble();

        mediap = (n1+n2+n3)/3;

        System.out.println("Média: " + mediap);

        if(mediap>=7){
            System.out.println("Aprovado");
        }
        else if(mediap >= 3.5){
            System.out.println("O aluno vai para a final");
            System.out.println("Digite a quarta nota do aluno:");
            n4 = ler.nextDouble();

            mediaf = ((mediap)*6+n4*4)/10;
            System.out.println("Média final: " + mediaf);

            if(mediaf>=5){
                System.out.println("Aprovado");
            }
            else{
                System.out.println("Reprovado");
            }
        }
        else{
            System.out.println("Reprovado");
        }
    }
}
