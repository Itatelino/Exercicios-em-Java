package mediaaluno;

public class MediaAluno {

    public static void main(String[] args) {

        int nota = 50;
        int media = 60;

        if (nota >= media) {
            System.out.println("Aprovado");
        } else if (nota >= 40) {
            System.out.println("Recuperacao");

        } else {
            System.out.println("Reprovado");
        }
        System.out.println("Fim do progarama");
    }

};