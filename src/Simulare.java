public class Simulare {
    private Padure padure;

    public Simulare() {
        padure = new Padure(100, 100, 0, Anotimp.PRIMAVARA);

        for (int i = 0; i < 50; i++) {
            padure.getPlante().add(new Planta("iarba", new Coordonate(i, i), 50, true));
        }

        for (int i = 0; i < 10; i++) {
            padure.getAnimale().add(new Ierbivor(i, "cerb", 2, 20, 100, i % 2 == 0 ? Gen.M : Gen.F, new Coordonate(i * 2, i * 2)));
        }

        for (int i = 0; i < 5; i++) {
            padure.getAnimale().add(new Pradator(i, "lup", 4, 30, 80, i % 2 == 0 ? Gen.M : Gen.F, new Coordonate(i * 3, i * 3)));
        }
    }
    public void ruleaza() {
        for (int i = 0; i < 30; i++) {  // 30 de zile simulate
            System.out.println("Ziua: " + padure.getZiCurenta());
            padure.simuleazaZi();
            padure.actualizeazaAnotimp();
        }
    }

}

