import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JogoDeXadrexTest {
    @Test
    void testeCriarObjetos() {
        Peca peca = new Peca("Qualquer coisa");
        assertEquals("Qualquer coisa",peca.getNome());
    }
}