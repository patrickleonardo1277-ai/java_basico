import java.util.Scanner;

public class SomaMedia {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double soma = 0;
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};

        for (double n : notas) soma+= n;
        double media = soma/ notas.length;

        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);

        int acima_media = 0;

        for (double n : notas){
            if (n > media) {
                acima_media++;
            }

        }
        System.out.println("As notas acima da média são : " + acima_media);

        leitor.close();
    }
}
