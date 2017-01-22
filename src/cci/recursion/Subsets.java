package cci.recursion;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by vkumar on 1/20/17.
 */
public class Subsets {

    /// This can handle nums list of size up to max 64
    public Set<Set<Integer>> allSubsets(List<Integer> nums) {
        Set<Set<Integer>> subsets = new HashSet<>();
        if(nums == null) return subsets;

        int N = nums.size();
        long max = 1 << N;
        for(long bitRep = 0; bitRep < max; bitRep++) {
            subsets.add(createSubsetFromNum(bitRep, nums));
        }

        return subsets;
    }

    // bitRep is non-negative number.
    private Set<Integer> createSubsetFromNum(long bitRep, List<Integer> nums) {
        Set<Integer> subset = new HashSet<>();
        for(int bitIdx = 0; bitRep > 0; bitIdx++) {

            if(bitRep % 2 == 1) {

                subset.add(nums.get(bitIdx));
            }

            // update bitRep : shift to right 1 bit
            bitRep = bitRep >> 1;
        }

        return subset;
    }
}
