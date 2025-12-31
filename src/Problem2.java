import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    public Problem2() {


    }

    public List<List<Integer>> threeSum(int[] nums) {

        int result[];
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++) {
            if (i > 0 & nums[i] == nums[i + 1]) {
                continue;

                int j = i + 1;
                int k = nums.length - 1;

                while (j < k) {

                    int total = nums[i] + nums[j] + nums[k];

                    if (i > 0) {
                        k -= 1;
                    } else if (total < 0) {
                        j += 1;
                    } else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                }
                return null;
            }
        }
    }
}
