package comandodeloop;

import java.util.Scanner;

public class ComandosLoop {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        /*
         * Loop FOR
         * 
         * 
         * for (int cont = 0; cont < 10; cont++) {
         * System.out.println(cont + " - Estudando Loop em JAVA");
         * }
         * 
         * 
         * int max = leitor.nextInt();
         * 
         * 
         * /* while
         */

        /*
         * int cont = 0;
         * while (cont < max) {
         * System.out.println(cont + " - Estudando loop com WHILE");
         * cont++;
         * }
         */

        int cont = 0;
        // do {
        // System.out.println(cont + " - Estudando loop com Do/While");
        // cont++;
        // } while (cont <= 0);
        do {
            System.out.println(cont + " - Estudando loop com o comando Do/While");
            cont++;
        } while (cont < 0);

        System.out.println("Fim do programa");
    }

}
