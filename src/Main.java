import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        int sum[] = new int[]{0, 2, 7, 11, 15};
        int sum1[] = new int[9];

        //merge(sum1,sum);
        length(sum);

    }

    public static void merge(int[] num1, int[] num2) {
//somehow get the two arrays merge, like maibe add it ionto the new code
        //then i would sort it , not sure how mostl likelty bubble sorting it
        //then finding the median



    }

    public static void length(int[] array) {


        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(array.length);
        }
    }


    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            //curr+x =target
            //x=target-x;

            int x = target - curr;
            if (map.containsKey(x)) {
                System.out.println(map.get(x) + i);
                return new int[]{map.get(x), i};
            } else {
                map.put(curr, i);
            }

        }
        return null;
    }

}
