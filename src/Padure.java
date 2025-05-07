import java.util.ArrayList;
import java.util.List;
public class Padure {
    private int dimensiuneX;
    private int dimensiuneY;
    private List<Animal> animale;
    private List<Planta> plante;
    private int ziCurenta;
    private Anotimp anotimp;

    public Padure(int dimensiuneX, int dimensiuneY, int ziCurenta, Anotimp anotimp) {
        this.dimensiuneX = dimensiuneX;
        this.dimensiuneY = dimensiuneY;
        this.animale = new ArrayList<>();
        this.plante = new ArrayList<>();
        this.ziCurenta = ziCurenta;
        this.anotimp = anotimp;
    }

    public int getDimensiuneX() {
        return dimensiuneX;
    }

    public void setDimensiuneX(int dimensiuneX) {
        this.dimensiuneX = dimensiuneX;
    }

    public int getDimensiuneY() {
        return dimensiuneY;
    }

    public void setDimensiuneY(int dimensiuneY) {
        this.dimensiuneY = dimensiuneY;
    }

    public List<Animal> getAnimale() {
        return animale;
    }

    public void setAnimale(List<Animal> animale) {
        this.animale = animale;
    }

    public List<Planta> getPlante() {
        return plante;
    }

    public void setPlante(List<Planta> plante) {
        this.plante = plante;
    }

    public int getZiCurenta() {
        return ziCurenta;
    }

    public void setZiCurenta(int ziCurenta) {
        this.ziCurenta = ziCurenta;
    }

    public Anotimp getAnotimp() {
        return anotimp;
    }

    public void setAnotimp(Anotimp anotimp) {
        this.anotimp = anotimp;
    }
    public void simuleazaZi(){
        for (Animal animal : animale) {
            if (!animal.isEsteViu()) continue;

            animal.misca();
            if (animal.getEnergie() < 30) {
                animal.odihneste();
            }

            if (animal instanceof Ierbivor) {
                ((Ierbivor) animal).pasuneaza(plante);
            }

            if (animal instanceof Pradator) {
                ((Pradator) animal).vaneaza(
                        animale.stream()
                                .filter(a -> a instanceof Ierbivor && a.isEsteViu())
                                .map(a -> (Ierbivor) a)
                                .toList()
                );
            }
        }

        for (Planta planta : plante) {
            planta.creste();
        }

        System.out.println("Raport zi " + ziCurenta);
        System.out.println("Animale:");
        for (Animal a : animale) {
            System.out.println(a);
        }
        System.out.println("Plante:");
        for (Planta p : plante) {
            System.out.printf("Planta: %s la (%d, %d), energie: %.1f, mancabila: %b\n",
                    p.getTip(),
                    p.getPozitie().getX(),
                    p.getPozitie().getY(),
                    p.getEnergieNutritiva(),
                    p.isPoateFiMancata());
        }
        ziCurenta++;

    }
    public void actualizeazaAnotimp(){
        int zi = ziCurenta % 365;

        if (zi < 90) {
            anotimp = Anotimp.PRIMAVARA;
        } else if (zi < 180) {
            anotimp = Anotimp.VARA;
        } else if (zi < 270) {
            anotimp = Anotimp.TOAMNA;
        } else {
            anotimp = Anotimp.IARNA;
        }
    }
}
