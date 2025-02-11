package cycles;

public class VeloElec extends Velo {
    private double facteurPuissanceMoteur;

    public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
        super(braquet, diamRoue); 
        this.facteurPuissanceMoteur = coupleMoteur;  
    }

 
    public VeloElec(double diamRoue, double coupleMoteur) {
        super(); 
        this.setDiamRoue(diamRoue);
        this.facteurPuissanceMoteur = coupleMoteur; 
    }

   
    public VeloElec() {
        super();
        this.facteurPuissanceMoteur = 15.0; 
    }

    
    public double getPuissance(double frequence) {
        return super.getPuissance(frequence) * facteurPuissanceMoteur;
    }

    
    
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}


	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}


	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
    
	
    
}

