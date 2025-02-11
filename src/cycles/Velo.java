package cycles;

import java.util.Random;

public class Velo {
    private static double DEFAULT_BRAQUET = 13.0;
    private double braquet;
    private double diamRoue;
    private Random genAlea = new Random();

    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
    }

    public Velo() {
        this(DEFAULT_BRAQUET, 0);
    }

    public double getDEFAULT_BRAQUET() {
        return DEFAULT_BRAQUET;
    }

    public static void setDEFAULT_BRAQUET(double DEFAULT_BRAQUET) {
        Velo.DEFAULT_BRAQUET = DEFAULT_BRAQUET;
    }

    public Random getGenAlea() {
        return genAlea;
    }

    public void setGenAlea(Random genAlea) {
        this.genAlea = genAlea;
    }

    public double getBraquet() {
        return braquet;
    }

    public void setBraquet(double braquet) {
        this.braquet = braquet;
    }

    public double getDiamRoue() {
        return diamRoue;
    }

    public void setDiamRoue(double diamRoue) {
        this.diamRoue = diamRoue;
    }

    public double getPuissance(double FrequenceCoupsDePedale) {
        return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
    }

    
    public String toString() {
        return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
    }
    
    
}


