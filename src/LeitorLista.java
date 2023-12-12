import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class LeitorLista {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<String> listNSex = new ArrayList<>();

    System.out.println("Digite os nomes e sexos separados por vírgula (digite 'fim' para encerrar):");

    while (true) {
        String entrada = scanner.nextLine();

        if (entrada.equalsIgnoreCase("fim")) {
            break;
        }

        listNSex.add(entrada);
    }

    scanner.close();
    List<String> mulheres = listNSex.stream()
            .filter(nomeSexo -> nomeSexo.endsWith((",F")))
            .toList();

    System.out.println("Mulheres na lista:");
    mulheres.forEach(System.out::println);
}

    public static boolean temMulheres() {
        return false;
    }
}
