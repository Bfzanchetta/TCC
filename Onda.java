package fourier;

import java.util.Random;

/**
 *
 * @author Breno
 */
public class Onda {

    private double Amplitude;
    private int frequenciaHertz;

    //Toda faixa de Representacao da onda vai ser estimada e armazenada nessa variavel
    public Onda() {
    }

    public Onda(double Amplitude, int frequenciaHertz) {
        this.Amplitude = Amplitude;
        this.frequenciaHertz = frequenciaHertz;
    }

    public void geraAmpliteAleatoria() {
        //nao ta gerando os randoms diferentes, gera sempre o mesmo
        Random r = new Random();
        this.Amplitude = r.nextInt() * 100;
    }

    public void geraFrequenciaAleatoria() {
        Random r = new Random();
        this.frequenciaHertz = r.nextInt() * 400;
    }

    public double getAmplitude() {
        return Amplitude;
    }

    public void setAmplitude(double Amplitude) {
        this.Amplitude = Amplitude;
    }

    public int getFrequenciaHertz() {
        return frequenciaHertz;
    }

    public void setFrequenciaHertz(int frequenciaHertz) {
        this.frequenciaHertz = frequenciaHertz;
    }

    public void calculaOndaFinal() {

    }

}
