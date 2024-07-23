import java.util.HashSet;

class contains_duplicate_II {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> hm = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i <= k && i < n; i++) {
            if (hm.contains(nums[i])) {
                return true;
            } else {
                hm.add(nums[i]);
            }
        }
        for (int i = k + 1; i < n; i++) {
            hm.remove(nums[i - k - 1]);
            if (hm.contains(nums[i])) {
                return true;
            } else {
                hm.add(nums[i]);
            }
        }
        return false;
    }
}
