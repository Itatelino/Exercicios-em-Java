package metodoemarray;

import java.util.Arrays;

public class MetodoArray {

    public static void main(String[] args) {

        // int[] num = { 10, 20, 30, 40, 50 };
        final int tam = 10;
        int[] num = { 9, 2, 7, 1, 8, 5, 3, 4, 0, 6 };
        int[] numeros = new int[tam];
        int p = 3;
        int pos;

        // Arrays.sort(num);
        // Arrays.fill(numeros, 10);
        // System.arraycopy(num, 0, numeros, 0, tam);
        // Arrays.equals(num, numeros);
        // System.out.printf("Arraus sao iguais: %s", Arrays.equals(num, numeros) ?
        // "Sim" : "Nao");

        Arrays.sort(num);
        pos = Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta no array? %s", p, pos > 0 ? "Sim" : "Nao");
        // for(int i=0;i<num.length;i++){
        // System.out.printf("%d - ",num[1]);
        // }

        // for (int n : numeros) {
        // System.out.printf("%d - ", n);
        // }

    }

}
