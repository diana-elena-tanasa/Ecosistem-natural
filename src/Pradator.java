import java.util.List;
import java.util.Random;

public class Pradator extends Animal{
    private static int id = 1;

    public Pradator(int id, String specie, int varsta, int nivelFoame, int energie, Gen gen, Coordonate pozitie) {
        super(specie, varsta, nivelFoame, energie, gen, pozitie);
    }

    public void vaneaza(List<Ierbivor> ierbivore){
        for(Ierbivor i : ierbivore){
            if(i.isEsteViu()){
                i.moare();
                mananca(20);
            }
        }
    }
    @Override
    public void reproduce(Animal partener){
       if(partener instanceof Pradator && this.getGen() != partener.getGen()){
           Random r  = new Random();
           Pradator p = new Pradator(id++, this.getSpecie(), 0, this.getNivelFoame()
           + partener.getNivelFoame() / 2, this.getEnergie() + partener.getEnergie() / 2, r.nextBoolean() ?
                   Gen.M : Gen.F, new Coordonate(this.getPozitie().getX(), this.getPozitie().getY()));
           this.setEnergie(this.getEnergie() - 40);
           partener.setEnergie(partener.getEnergie() - 40);
       }
    }
    @Override
    public void misca(){
        Random r = new Random();
        int dx = r.nextInt(3) - 1;
        int dy = r.nextInt(3) - 1;
        Coordonate p = this.getPozitie();
        p.setX(Math.max(0,Math.min(p.getX() + dx , 99)));
        p.setY(Math.max(0, Math.min(p.getY() + dy , 99)));
        this.setEnergie(this.getEnergie() - 10);
    }
    @Override
    public void odihneste(){
        this.setEnergie(this.getEnergie() + 30);
    }
    @Override
    public void moare(){
        super.moare();
        //padure.stergeanimal;

    }

}
