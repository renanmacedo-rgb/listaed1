import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double altura;
        double peso;
        double imc;

        System.out.println("Digite o seu peso em KG:");
        peso = ler.nextDouble();

        do {
            System.out.println("Digite a sua altura em CM:");
            altura = ler.nextDouble();

            if (altura <= 0){
                System.out.println("Altura inválida, não se pode dividir por 0");
            }
        }while(altura <= 0);

        imc = peso/Math.pow(altura,2);

        System.out.println("O seu imc é "+ imc);
    }
}
