import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float invIn, invMen, saldoAc, txMen, rendMen;
        int qtdMen;

        System.out.println("Digite:\nO investimento inicial;\nO investimento mensal;\nA quantidade de meses;\n" +
                "A taxa de juros mensal (em decimal):");

        invIn = ler.nextFloat();
        invMen = ler.nextFloat();
        qtdMen = ler.nextInt();
        txMen = ler.nextFloat();

        saldoAc = invIn;

        for(int i = 0; i < qtdMen; i++){
            rendMen = saldoAc * txMen;
            saldoAc += rendMen + invMen;
        }

        float total = invIn + (invMen*qtdMen);
        float aqa = saldoAc;

        System.out.println("Lucro total: " + aqa);
    }
}
