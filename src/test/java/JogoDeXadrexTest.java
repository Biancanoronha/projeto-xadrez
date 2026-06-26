import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JogoDeXadrexTest {
    @Test
    void testeCriarObjetos() {
        Torre torre = new Torre("Qualquer coisa");
        assertEquals("Qualquer coisa",torre.getNome());
    }
}