import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String senha, versenha;

        System.out.println("Cadastre a sua senha: ");
        senha = ler.nextLine();

        System.out.println("Pronto! Agora pode logar. Coloque a sua senha:");
        versenha = ler.nextLine();

        if(senha.equals(versenha)){
            System.out.println("Bem-vindo ao sistema");
        } else{
            while(!senha.equals(versenha)){
                System.out.println("Senha incorreta, tente novamente:");
                versenha = ler.nextLine();
            }
            System.out.println("Bem-vindo ao sistema");
        }

        do {
            System.out.println("Agora tente logar usando Do-While. Coloque a sua senha:");
            versenha = ler.nextLine();

            if(!senha.equals(versenha)){
                System.out.println("Senha incorreta, tente novamente:");
                versenha = ler.nextLine();
            }

        } while(!senha.equals(versenha));

        System.out.println("Bem-vindo ao sistema");
    }
}
