public class RoachPopulationTester {
    public static void main (String[] args){
        RoachPopulation r = new RoachPopulation(100);
        for(int i = 0; i < 4; i++){
            r.breed();
            r.spray();
            System.out.println("Roach Population:" + r.getRoaches());
        }
    }
}
