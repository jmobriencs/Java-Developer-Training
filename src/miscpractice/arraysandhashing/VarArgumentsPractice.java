package miscpractice.arraysandhashing;

/**
 * @author john-michael.obrien
 * @since 3/23/23
 */
public class VarArgumentsPractice {
    public static void main(String[] args) {
        System.out.println(calcSum());
        System.out.println(calcSum(2, 4));
        System.out.println(calcSum(2,4,6,8,10));
        System.out.println(calcSum(new int[]{3,4,6,7}));
    }

    public static int calcSum(int ...a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
