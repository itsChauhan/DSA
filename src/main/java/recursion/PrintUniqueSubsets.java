package recursion;

import java.util.*;
import java.util.stream.Collectors;

public class PrintUniqueSubsets {

    private static void getAllSubsetsOptimised(int[] nums, int start, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            getAllSubsetsOptimised(nums, i + 1, current, result);
            current.remove(current.size() - 1); // backtrack
        }
    }

    private static void getAllSubsets(int[] nums, int n, List<Integer> outputSubset, List<List<Integer>> subsets){
        if(n==nums.length){
            List<Integer> newList = new ArrayList<>(outputSubset);
            Collections.sort(newList);
            subsets.add(newList);
            return;
        }

        Integer x = nums[n];
        getAllSubsets(nums, n+1, outputSubset, subsets);
        outputSubset.add(x);
        getAllSubsets(nums, n+1, outputSubset, subsets);
        outputSubset.removeLast();
    }





    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> uniqueSubsets = new ArrayList<>();
        if(nums.length == 0){
            return uniqueSubsets;
        }
        getAllSubsetsOptimised(nums, 0, new ArrayList<>(), uniqueSubsets);
        Set<List<Integer>> resultSet = uniqueSubsets.stream().collect(Collectors.toSet());
        return resultSet.stream().collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println(subsetsWithDup(new int[]{4,1,1}));

    }
}
