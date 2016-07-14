package fourier;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author breno
 */
public class Fourier {

    public static void main(String[] args) {
        ArrayList<Onda> lista = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Onda onda = new Onda();
            onda.geraAmpliteAleatoria();
            onda.geraFrequenciaAleatoria();
            lista.add(onda);
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(lista.get(i).getAmplitude());
            System.out.println(lista.get(i).getFrequenciaHertz());
            System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;");
        }
    }

}
