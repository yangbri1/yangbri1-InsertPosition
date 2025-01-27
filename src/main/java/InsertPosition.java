// import java.util.Arrays;     // --- import 'Arrays' class from Java's utility package to implement Arrays.sort() if not already ...

public class InsertPosition {

    /**
     * Find the position that a number should be inserted into in a sorted array.
     * For instance, in the array {2,4,6,8,10}, inserting 5 would belong at position 2, since the resulting array
     * would be {2,4,5,6,8,10}, where the index of 5 is 2 (remember zero-indexing.)
     * See the test cases for more examples.
     *
     * You may assume no duplicate values.
     *
     * @param nums an array of ints.
     * @param target the number that would hypothetically be inserted.
     * @return return the index that a number should be inserted into a sorted array.
     */
    public int searchInsert(int[] nums, int target) {
        // if 'nums' is an empty int array ...
        if(nums.length == 0){
            // inserted 'target' would be the very 1st elem in the array --- hence at index 0
            return 0;
        }
        /* otw if 'nums' is NOT an empty int array ... */
        // initialize 'i' to be iterator for while-loop
        int i = 0;
        // iterate via int[] array 'nums' ... --- w/ the given presumption that it is already sorted ...
        // java.util.Arrays.sort(nums);     // --- enable this if 'nums' ary NOT already sorted
        while(i < nums.length){
            // if current num is greater than given 'target' ...
            if(nums[i] > target){
                // return index number -- this is where 'target' would be inserted at
                return i;
            }
            // increment by 1 to keep while-loop operating
            ++i;
        }
        // under some circumstances the ary is 1) NOT empty, 2) array is filled with int less than 'target' ...
        /* 'target' would be inserted at end of int[] array 'nums' */
        return (nums.length);
    }
}
