public class RoachPopulation {
    private int population;
    public RoachPopulation(int initialPopulation) {
        population = initialPopulation;
    }
    public void breed() {
        population *= 2;
    }
    public void spray(){
        population *= (0.9);
    }
    public int getRoaches(){
        return population;
    }
}
