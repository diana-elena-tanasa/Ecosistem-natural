public class Planta {
    private String tip;
    private Coordonate pozitie;
    private double energieNutritiva;
    private boolean poateFiMancata;

    public Planta(String tip, Coordonate pozitie, double energieNutritiva, boolean poateFiMancata) {
        this.tip = tip;
        this.pozitie = pozitie;
        this.energieNutritiva = energieNutritiva;
        this.poateFiMancata = poateFiMancata;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public Coordonate getPozitie() {
        return pozitie;
    }

    public void setPozitie(Coordonate pozitie) {
        this.pozitie = pozitie;
    }

    public double getEnergieNutritiva() {
        return energieNutritiva;
    }

    public void setEnergieNutritiva(double energieNutritiva) {
        this.energieNutritiva = energieNutritiva;
    }

    public boolean isPoateFiMancata() {
        return poateFiMancata;
    }

    public void setPoateFiMancata(boolean poateFiMancata) {
        this.poateFiMancata = poateFiMancata;
    }
    public void creste(){
        if(energieNutritiva<100){
            energieNutritiva = energieNutritiva + 10;
        }
    }
    public void esteConsumata(){
        energieNutritiva = energieNutritiva - 30;
        if(energieNutritiva <= 0){
            poateFiMancata = false;
        }
    }

}
