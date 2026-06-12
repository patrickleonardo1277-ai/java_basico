import java.util.Scanner;

public class For_Each {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] cidades = new String[]{"São Paulo", "Rio", "Curitiba", "Salvador", "Fortaleza"};

        for(String cidade : cidades) {
            System.out.println(cidade.toUpperCase());
        }

        leitor.close();
    }
}
