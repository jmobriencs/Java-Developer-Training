package linkedinlearning.javaobjectsandapis.section1_inheritance.Challenge;

/**
 * @author john-michael.obrien
 * @since 3/31/23
 */
public class BirthdayCake extends Cake {
    private int candles;

    BirthdayCake() {
        super("chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
}
