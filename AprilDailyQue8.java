import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AprilDailyQue8 {
    public static int minimumOperations(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        int operations = 0;

        while (!list.isEmpty()) {
            Set<Integer> set = new HashSet<>(list);
            if (set.size() == list.size()) {
                return operations; // All elements are distinct
            }

            // Remove first 3 elements or whatever is left
            int removeCount = Math.min(3, list.size());
            for (int i = 0; i < removeCount; i++) {
                list.remove(0);
            }

            operations++;
        }

        return operations;
    }
    public static void main(String[]args){
        System.out.println(minimumOperations(new int[]{1, 2, 3, 4, 2, 3, 3, 5, 7})); // Output: 2
        System.out.println(minimumOperations(new int[]{4, 5, 6, 4, 4}));             // Output: 2
        System.out.println(minimumOperations(new int[]{6, 7, 8, 9}));                // Output: 0
    }
}

