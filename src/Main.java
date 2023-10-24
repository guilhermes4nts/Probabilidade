import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Lista de números predefinida
        double[] numeros = {10.5, 20.3, 15.8, 7.2, 12.6};
        // Ordenando a Lista de números
        Arrays.sort(numeros);
        // Imprimindo a Lista ordenada

        for (double aux : numeros) {
            System.out.print(aux + " | ");
        }
        System.out.println(" ");
        System.out.println("----------------------------------");

        // MEDIA

        int n = numeros.length;
        double soma =  0.0;

        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }

        float media = (float) (soma / n);

        System.out.println("A média dos números é: " + media);
        System.out.println("----------------------------------");

        // MEDIANA

        float mediana = 0.0f;
        int posicao = 0;
        if(n/2 != 0){
            posicao = (n+1)/2;
            mediana = (float) numeros[posicao-1];
            System.out.println("Mediana : " + mediana);
        }else{
            posicao = (n+1)/2;
            mediana = (float) (numeros[posicao] + numeros[posicao-1])/2;
            System.out.println("Mediana : " + mediana);
        }
        System.out.println("----------------------------------");

        // PERCETIL

        // Q1

        float q1 = (float) (0.25 * (n+1));
        int loc1= (int) q1;
        int loc2 = loc1 - 1;

        float valorQ1 = (float) (numeros[loc1] + numeros[loc2])/2;

        System.out.println("Localização do primerio quadrante Q1: "+q1);
        System.out.println("Valor do primeiro quadrante Q1: "+ valorQ1);
        System.out.println("----------------------------------");

        // Q2

        float q2 = (float) (0.5 * (n+1));
        int loc6= (int) q2;
        int loc7 = loc1 - 1;

        float valorQ2 = (float) (numeros[loc1] + numeros[loc2])/2;

        System.out.println("Localização do segundo quadrante Q2: "+q2);
        System.out.println("Valor do segundo quadrante Q2: "+ mediana);
        System.out.println("----------------------------------");

        // Q3

        float q3 = (float) (0.75 * (n+1));
        int loc3= (int) q3;
        int loc4 = loc3 - 1;

        float valorQ3 = (float) (numeros[loc3] + numeros[loc4])/2;

        System.out.println("Localização do terceiro quadrante Q3: "+q3);
        System.out.println("Valor do terceiro quadrante Q3: "+ valorQ3);
        System.out.println("----------------------------------");

        // Q4

    }
}