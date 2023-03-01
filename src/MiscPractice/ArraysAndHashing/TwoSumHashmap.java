package MiscPractice.ArraysAndHashing;

import java.util.HashMap;

/**
 * @author jm
 * @since ajm
 */
public class TwoSumHashmap {
    public static void main(String[] args) {
        int[] numArr = new int[4];
        int target = 9;

        numArr[0] = 3;
        numArr[1] = 2;
        numArr[2] = 7;
        numArr[3] = 4;

        System.out.println(twoSum(numArr, target));
    }

    private static boolean twoSum(int[] numArr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numArr.length; i++) {
            int diff = target - numArr[i];
            if (map.containsValue(diff)) {
                return true;
            }
            map.put(i, numArr[i]);
        }
        return false;
    }
}
