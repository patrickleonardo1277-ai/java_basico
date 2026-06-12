import java.util.Scanner;

public class For_Indexado {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] v = {3, 7, 1, 9, 4, 6, 2, 8, 5};

        for (int i = 0; i < v.length; i++){
            if (i % 2!=0){
                System.out.println("Indice [" + i + "]");
                System.out.println("Valor = " + v[i]);
            }
        }

        leitor.close();
    }
}
