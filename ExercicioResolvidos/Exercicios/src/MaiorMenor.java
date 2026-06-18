import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] v = {4, 17, 3, 22, 8, 15, 1, 30, 9};
        int maior_numero = v[0];
        int menor_numero = v[0];
        int indice_maior = 0;
        int indice_menor = 0;

        for (int i =0; i< v.length; i++){
            if (v[i] > maior_numero){
                maior_numero = v[i];
                indice_maior = i;
            }
            if (v[i] < menor_numero){
                menor_numero = v[i];
                indice_menor = i;
            }
        }

        System.out.println(maior_numero + " está no indice " + indice_maior);
        System.out.println(menor_numero + " está no indice " + indice_menor);


        leitor.close();

    }
}
