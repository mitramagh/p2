public class InsectClient {
    public static void main(String args[]) {
        System.out.println((Insect.produceRandomFact()));
        Insect bug1 = new Insect(13, 31, 0);
        System.out.println(bug1.getWeight());
        bug1.setX(320);
        System.out.println(bug1.getX());
        System.out.println(bug1.getY());

        Insect bug2 = new Insect(64);
<<<<<<< HEAD
        System.out.println(bug2.toString());
=======
        System.out.println(bug2.getWeight());
        System.out.println(bug2.getX());
        System.out.println(bug2.getY());
>>>>>>> 6689272f64856777fb876c2db610e40f59d88b6a
        System.out.println(Insect.getPopulation());

    }
}