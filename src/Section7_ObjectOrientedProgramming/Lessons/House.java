package Section7_ObjectOrientedProgramming.Lessons;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class House {
    //Instance fields
    private int numStories;
    private int numWindows;
    private String color;

    // no arg constructor (cotr)
    public House() {
        numStories = 1;
        numWindows = 4;
        color = "gray";
    }

    //parameterized ctor
    public House(int numStories, int numWindows, String color) {
        this.numStories = numStories;
        this.numWindows = numWindows;
        this.color = color;
    }


    //Instance methods
    public void setNumStories(int numStories) {
        this.numStories = numStories;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumStories() {
        return numStories;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public String getColor() {
        return color;
    }


}
