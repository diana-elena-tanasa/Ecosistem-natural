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

    }
    public void actualizeazaAnotimp(){

    }
}
