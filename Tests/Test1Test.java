import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class Test1Test {
    @Test
    public void test() {
        List<Pessoa> listaPessoasTest = new ArrayList<>();
        listaPessoasTest.add(new Pessoa("p1", "F"));
        listaPessoasTest.add(new Pessoa("p2", "F"));
        listaPessoasTest.add(new Pessoa("p3", "F"));
        listaPessoasTest.add(new Pessoa("p4", "M"));
        listaPessoasTest.add(new Pessoa("p5", "m"));
        listaPessoasTest.add(new Pessoa("p6", "m"));

        List<Pessoa> mulheres = listaPessoasTest.stream()
                .filter(pessoa -> pessoa.getSexo().equalsIgnoreCase("F"))
                .toList();

        for (Pessoa mulher : mulheres) {
            assertEquals("F", mulher.getSexo());
        }
    }
}

