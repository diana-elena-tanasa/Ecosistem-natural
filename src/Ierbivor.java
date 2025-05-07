import java.util.List;
import java.util.Random;

import static java.lang.Math.abs;

public class Ierbivor extends Animal {
    private static int id = 1;

    public Ierbivor(int id, String specie, int varsta, int nivelFoame, int energie, Gen gen, Coordonate pozitie) {
        super(specie, varsta, nivelFoame, energie, gen, pozitie);
    }

    public void pasuneaza(List<Planta> plante) {
        for(Planta p : plante){
            if(p.isPoateFiMancata()){
                p.esteConsumata();
            }
            this.setEnergie(this.getEnergie() + 10);
        }
    }

    public void fugeDe(Animal pradator) {
        if(abs(pradator.getPozitie().getX() - this.getPozitie().getX()) <= 10 ||
                abs(pradator.getPozitie().getY() - this.getPozitie().getY()) <= 10){
            Coordonate p = this.getPozitie();
            p.setX(this.getPozitie().getX() + 10);
            p.setY(this.getPozitie().getY() + 10);
        }
        this.setEnergie(this.getEnergie() - 50);
    }

    public void misca() {
        Random r = new Random();
        int dx = r.nextInt(3) - 1;
        int dy = r.nextInt(3) - 1;
        Coordonate p = this.getPozitie();
        p.setX(Math.max(0, Math.min(p.getX() + dx, 99)));
        p.setY(Math.max(0, Math.min(p.getY() + dy, 99)));
        this.setEnergie(this.getEnergie() - 8);
    }

    public void odihneste() {
        this.setEnergie(this.getEnergie() + 25);
    }

    public void reproduce(Animal partener) {
        if (partener instanceof Ierbivor && this.getGen() != partener.getGen()) {
            Random r = new Random();
            Ierbivor p = new Ierbivor(id++, this.getSpecie(), 0, this.getNivelFoame()
                    + partener.getNivelFoame() / 2, this.getEnergie() + partener.getEnergie() / 2, r.nextBoolean() ?
                    Gen.M : Gen.F, new Coordonate(this.getPozitie().getX(), this.getPozitie().getY()));
            this.setEnergie(this.getEnergie() - 30);
            partener.setEnergie(partener.getEnergie() - 30);
        }
    }
}
