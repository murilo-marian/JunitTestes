import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;

public class CriacaoSQL {
    List<Coluna> colunas = new ArrayList<>();

    public CriacaoSQL() {
    }

    public void adicionaColuna(String nome, String tipo, Boolean notNull, Boolean autoIncrement) {
        Coluna coluna = new Coluna(nome, tipo, notNull, autoIncrement);
        colunas.add(coluna);
    }

    public String criaColuna(int num) {
        Coluna coluna = colunas.get(num);
        boolean notNull = false;
        boolean autoIncrement = false;

        String principal = "\'" + coluna.getNome() + "\' " + coluna.getTipo().toUpperCase();
        String retorno = new String();
        retorno += principal;

        if (coluna.getNotNull()) {
            retorno += " NOT_NULL";
            notNull = true;
        }
        if (coluna.getAuto_increment()) {
            retorno += " AUTO_INCREMENT";
            autoIncrement = true;
        }

        if (autoIncrement && notNull) {
            retorno += ",\n" + principal + " NOT_NULL";
            retorno += ",\n" + principal + " AUTO_INCREMENT";
        }
        if (autoIncrement || notNull) {
            retorno += ",\n" + principal;
        }

        return retorno;
    }
}
