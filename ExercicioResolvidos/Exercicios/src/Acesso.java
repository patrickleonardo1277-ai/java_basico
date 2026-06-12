import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int [] v = {5,3,8,1,9,4,7};

        System.out.println("O primeiro elemento é " + v[0]);
        System.out.println("O último elemento é " + v[6]);

        leitor.close();
    }
}
