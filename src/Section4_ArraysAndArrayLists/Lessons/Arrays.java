package Section4_ArraysAndArrayLists.Lessons;

/**
 * @author john-michael o'brien
 * @since 1/5/23
 *
 * Arrays cannot grow in size and are a fixed length.
 * Fixed-size arrays can hold both primitive and reference data types.
 */
public class Arrays {
    public static void main (String[] args) {
        // array itself is a reference type
        //data type can be primitive or reference
        int[] myArray = new int[5];

        myArray[0] = 10;
        myArray[1] = 22;
        myArray[2] = 5;
        myArray[3] = 17;
        myArray[4] = 20;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println(); // blank line

        String[] myStringArray = new String[5];

        myStringArray[0] = "Chicken";
        myStringArray[1] = "Bird";
        myStringArray[2] = "Dog";
        myStringArray[3] = "Cat";
        myStringArray[4] = "Rat";

        // enhanced for loop avoids the out of bounds exception
        for (String i : myStringArray) {
            System.out.println(i);
        }

    }
}
