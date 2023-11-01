import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatematicaTest {
    List<Integer> teste = new ArrayList<>();

    @Test
    public void testeModa() {
        teste.add(3);
        teste.add(3);
        teste.add(4);
        teste.add(6);
        teste.add(5);
        teste.add(5);

        assertIterableEquals(Arrays.asList(3, 5), Matematica.moda(teste));
    }

    @Test
    public void testeMedia() {
        teste.add(3);
        teste.add(3);
        teste.add(4);
        teste.add(6);
        teste.add(5);
        teste.add(5);

        assertEquals(4.333333333333333, Matematica.media(teste));
    }

    @Test
    public void testeMediana() {
        teste.add(3);
        teste.add(3);
        teste.add(4);
        teste.add(6);
        teste.add(5);
        teste.add(5);

        assertEquals(4.5, Matematica.mediana(teste));
    }

    @Test
    public void testeVariancia() {
        teste.add(3);
        teste.add(3);
        teste.add(4);
        teste.add(6);
        teste.add(5);
        teste.add(5);

        assertEquals(1.4666666666666663, Matematica.variancia(teste));
    }

    @Test
    public void testeDesvio() {
        teste.add(3);
        teste.add(3);
        teste.add(4);
        teste.add(6);
        teste.add(5);
        teste.add(5);

        assertEquals(1.2110601416389966, Matematica.desvioPadrao(teste));
    }
}