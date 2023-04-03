package linkedinlearning.javaobjectsandapis.section1_inheritance.Challenge;

/**
 * @author john-michael.obrien
 * @since 3/31/23
 */
public class WeddingCake extends Cake {
    private int tiers;

    public WeddingCake() {
        super("Almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
