public class Simulare {
    public static void main(String[] args){
        Padure padure = new Padure(1000, 1000, 1, Anotimp.VARA);
        Pradator urs = new Pradator(1, "urs", 5,50, 75, Gen.M,new Coordonate(1,1));
        Ierbivor caprioara = new Ierbivor(1, "caprioara", 4,42, 87, Gen.F, new Coordonate(5,71));
        Pradator ras = new Pradator(2, "ras", 2, 43, 85, Gen.F, new Coordonate(45,45));

    }
}
