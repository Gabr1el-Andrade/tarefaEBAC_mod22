import java.util.ArrayList;
import java.util.List;



public class App {

    public static void main(String[] args) {
List<Pessoa> list = new ArrayList<>();
 list.add(new Pessoa("pss1", "F"));
        list.add(new Pessoa("pss1", "F"));
        list.add(new Pessoa("pss2", "F"));
        list.add(new Pessoa("pss3", "F"));
        list.add(new Pessoa("pss4", "M"));

        System.out.println("*** MULHERES ***");

        list.stream().filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .forEach(mulher -> {
                    System.out.println("Nome: " + mulher.getNome());
                    System.out.println("Sexo: " + mulher.getSexo());
                    System.out.println();
                });

}}
