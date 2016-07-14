/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fouriercanvas;

/**
 *
 * @author Breno
 */
public class Onda {

    private double Amplitude;
    private int frequenciaHertz;

    static int t1, t2;

    @Override
    public String toString() {
        return "Preciso te ver, te namorar, fica juntinho com voce";
    }

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

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Onda other = (Onda) obj;
        if (Double.doubleToLongBits(this.Amplitude) != Double.doubleToLongBits(other.Amplitude)) {
            return false;
        }
        if (this.frequenciaHertz != other.frequenciaHertz) {
            return false;
        }
        return true;
    }
}
