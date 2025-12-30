import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


        int sum[] = new int[]{2, 7, 11, 15};
        twoSums(sum, 9);


    }

    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            //curr+x =target
            //x=target-x;

            int x = target - curr;
            if (map.containsKey(x)) {
                System.out.println(map.get(x)+i);
                return new int[]{map.get(x), i};
            } else {
                map.put(curr, i);
            }

        }
        return null;
    }

}
