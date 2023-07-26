package dadosteclado;

import java.util.Scanner;

public class DadosTeclado {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, soma = 0;
        final int MEDIA = 60;
        String nome = "", res = "";

        System.out.print("Digite o nome do aluno: ");
        nome = leitor.nextLine();
        System.out.print("Digite a primeira nota: ");
        n1 = leitor.nextInt();
        System.out.print("Digite a segunda nota: ");
        n2 = leitor.nextInt();
        System.out.print("Digite a terceira nota: ");
        n3 = leitor.nextInt();
        System.out.print("Digite a quarta nota: ");
        n4 = leitor.nextInt();
        soma = n1 + n2 + n3 + n4;
        if (soma >= MEDIA) {
            res = "Recuperacao";
        } else {
            res = "Reprovado";
        }
        System.out.printf("Aluno %s foi %s, com nota %d", nome, res, soma);

    }

}
