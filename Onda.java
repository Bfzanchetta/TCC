package fourier;

/**
 *
 * @author Breno
 */
public class Onda {

    private double Amplitude;
    private int frequenciaHertz;

    static int t1, t2;

    //Toda faixa de Representacao da onda vai ser estimada e armazenada nessa variavel
    public Onda() {
    }

    public Onda(double Amplitude, int frequenciaHertz, int t1, int t2) {
        this.Amplitude = Amplitude;
        this.frequenciaHertz = frequenciaHertz;
        this.t1 = t1;
        this.t2 = t2;
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

}
