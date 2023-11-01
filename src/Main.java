import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> teste = new ArrayList<>();
        teste.add(3);
        teste.add(3);
        teste.add(4);
        teste.add(6);
        teste.add(5);
        teste.add(5);
        System.out.println(Matematica.moda(teste));
        System.out.println(Matematica.media(teste));
        System.out.println(Matematica.mediana(teste));
        System.out.println(Matematica.variancia(teste));
        System.out.println(Matematica.desvioPadrao(teste));


        CriacaoSQL criacaoSQL = new CriacaoSQL();
        criacaoSQL.adicionaColuna("teste", "int", true, true);
        System.out.println(criacaoSQL.criaColuna(0));
    }
}