import java.util.Scanner;

public class Modificacao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++){
            vetor[i] = i * i;
            System.out.println("Posição [" + i + "] = " + vetor[i] );
        }
    }
}
