package mediaaluno2;

public class MediaAluno2 {

    public static void main(String[] args) {

        int nota = 85;
        int faltas = 10;
        int maxFaltas = 5;
        int media = 60;
        int res;

        res = (nota >= media ? 1 : 0);

        System.out.println("Resultado: " + (res == 1 ? "Aprovado" : "Reprovado"));
    }

}
