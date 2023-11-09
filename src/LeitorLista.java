import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class LeitorLista {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    List<String> listaNomesSexos = new ArrayList<>();

    System.out.println("Digite os nomes e sexos separados por vírgula (digite 'fim' para encerrar):");

    while (true) {
        String entrada = scanner.nextLine();

        if (entrada.equalsIgnoreCase("fim")) {
            break;
        }

        listaNomesSexos.add(entrada);
    }

    scanner.close();
    List<String> mulheres = listaNomesSexos.stream()
            .filter(nomeSexo -> nomeSexo.endsWith((",F")))
            .toList();

    System.out.println("Mulheres na lista:");
    mulheres.forEach(System.out::println);
}
}
