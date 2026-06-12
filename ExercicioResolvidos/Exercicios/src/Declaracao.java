import java.util.Scanner;

public class Declaracao {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int[] numero = new int[]{10, 20, 30, 40, 50};

        for(int i = 0; i < numero.length; ++i) {
            System.out.println("Número [" + i + "] = " + numero[i]);
        }

        leitor.close();
    }
}
