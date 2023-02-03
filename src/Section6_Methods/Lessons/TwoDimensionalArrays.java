package Section6_Methods.Lessons;

import java.util.Random;

/**
 * @author john-michael.obrien
 * @since 1/24/23
 *
 * Arrays
 *  -Reg arrays are one dimensional arrays
 *  -We can have multidimensional arrays
 * 2D Arrays
 *  -Two sets of square brackets myArray[row][column]
 *  -often called matrices
 *  A generalization (2+ dimensions) of a matrix is called a tensor
 */
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] my2Darray = new int[2][3];
        fillArray(my2Darray);
        print2DArray(my2Darray);
        double2DArray(my2Darray);
        System.out.println();
        print2DArray(my2Darray);
    }

    public static void fillArray(int[][] twoDArr) {
        Random random = new Random();
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] = random.nextInt(10);
            }
        }
    }

    public static void print2DArray(int[][] twoDArr) {
        for (int[] arr : twoDArr) {
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void double2DArray(int[][] twoDArr) {
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[i].length; j++) {
                twoDArr[i][j] *= 2;
            }
        }
    }
}
