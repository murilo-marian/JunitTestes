import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Matematica {
    public static Double media(List<Integer> lista) {
        Double media = Double.valueOf(0);
        for (Integer integer : lista) {
            media += integer;
        }
        media = media / lista.size();
        return media;
    }

    public static List<Integer> moda(List<Integer> lista) {
        Map<Integer, Integer> contagemElementos = new HashMap<>();

        for (Integer elemento : lista) {
            contagemElementos.put(elemento, contagemElementos.getOrDefault(elemento, 0) + 1);
        }

        int maxContagem = 0;
        for (int contagem : contagemElementos.values()) {
            if (contagem > maxContagem) {
                maxContagem = contagem;
            }
        }

        List<Integer> moda = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : contagemElementos.entrySet()) {
            if (entry.getValue() == maxContagem) {
                moda.add(entry.getKey());
            }
        }

        return moda;
    }

    public static Double mediana(List<Integer> list) {
        List<Integer> lista = new ArrayList<>(list);
        lista.sort(null);
        if (lista.size() % 2 == 0) {
            Double val1 = Double.valueOf(lista.get(lista.size()/2 - 1));
            Double val2 = Double.valueOf(lista.get((lista.size()/2)));

            return (val1 + val2) / 2;
        } else {
            return Double.valueOf(lista.get((int) Math.floor(lista.size()/2)));
        }
    }

    public static Double variancia(List<Integer> lista) {
        List<Double> novaLista = new ArrayList<>();
        Double media = Matematica.media(lista);
        for (Integer integer : lista) {
            Double var = integer - media;
            var = Math.pow(var, 2);
            novaLista.add(var);
        }

        Double value = Double.valueOf(0);
        for (Double aDouble : novaLista) {
            value += aDouble;
        }

        value = value / (novaLista.size() - 1);

        return value;
    }

    public static Double desvioPadrao(List<Integer> lista) {
        Double value = Matematica.variancia(lista);
        value = Math.sqrt(value);
        return value;
    }
}

