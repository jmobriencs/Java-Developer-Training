package linkedinlearning.javaobjectsandapis.section1_inheritance.Challenge;

/**
 * @author john-michael.obrien
 * @since 3/31/23
 */
public class TasteTester {
    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        weddingCake.setPrice(350);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }
}
