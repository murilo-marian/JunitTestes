import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CriacaoSQLTest {

    @Test
    public void testeCriacaoSQL() {
        CriacaoSQL criacaoSQL = new CriacaoSQL();
        criacaoSQL.adicionaColuna("teste", "int", true, true);
        criacaoSQL.adicionaColuna("teste2", "float", false, false);

        assertEquals("\'teste\' INT NOT_NULL AUTO_INCREMENT,\n" +
                "\'teste\' INT NOT_NULL,\n" +
                "\'teste\' INT AUTO_INCREMENT,\n" +
                "\'teste\' INT", criacaoSQL.criaColuna(0));
        assertEquals("\'teste2\' FLOAT", criacaoSQL.criaColuna(1));
    }

}