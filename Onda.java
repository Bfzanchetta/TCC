package fourier;

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
