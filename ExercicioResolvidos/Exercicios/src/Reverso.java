import java.util.Scanner;

public class Reverso {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
         int [] v = {10, 20, 30, 40, 50};

         for (int i = 50; i> v.length; i--){
             System.out.println("Reverso " + v[i] +".");
         }
         leitor.close();

    }
}
