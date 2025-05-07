public abstract class Animal {
    private static int idCounter = 1; //animalele
    private final int id;

    private String specie;
    private int varsta;
    private int nivelFoame;
    private int energie;
    private Gen gen;
    private Coordonate pozitie;
    private boolean esteViu;

    public Animal(String specie, int varsta, int nivelFoame, int energie, Gen gen, Coordonate pozitie) {
        this.id = idCounter++;
        this.specie = specie;
        this.varsta = varsta;
        this.nivelFoame = nivelFoame;
        this.energie = energie;
        this.gen = gen;
        this.pozitie = pozitie;
        this.esteViu = true;
    }

    public int getId() { return id; }
    public String getSpecie() { return specie; }
    public int getVarsta() { return varsta; }
    public int getNivelFoame() { return nivelFoame; }
    public int getEnergie() { return energie; }
    public Gen getGen() { return gen; }
    public Coordonate getPozitie() { return pozitie; }
    public boolean isEsteViu() { return esteViu; }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Animal.idCounter = idCounter;
    }

    public void setSpecie(String specie) { this.specie = specie; }
    public void setVarsta(int varsta) { this.varsta = varsta; }
    public void setNivelFoame(int nivelFoame) { this.nivelFoame = nivelFoame; }
    public void setEnergie(int energie) { this.energie = energie; }
    public void setGen(Gen gen) { this.gen = gen; }
    public void setPozitie(Coordonate pozitie) { this.pozitie = pozitie; }
    public void setEsteViu(boolean esteViu) { this.esteViu = esteViu; }


    public abstract void misca();
    public abstract void odihneste();
    public abstract void reproduce(Animal partener);

    public void mananca(int mancare) {
        nivelFoame = Math.max(0, nivelFoame - mancare);
        energie = Math.min(100, energie + mancare);
    }

    public void moare() {
        this.esteViu = false;
    }

    @Override
    public String toString() {
        return specie + " #" + id + " (" + gen + ") la " + pozitie +
                ", vârstă: " + varsta +
                ", foame: " + nivelFoame +
                ", energie: " + energie +
                ", viu: " + esteViu;
    }
}