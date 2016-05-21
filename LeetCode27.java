import java.util.Arrays;

/*
 * Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.

 *  */

public class LeetCode27 {

	public int removeElement(int[] nums, int val) {
		int tail = 0;       //use a cursor to store the element we need
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				nums[tail] = nums[i];
				tail++;
			}
		}
		return tail;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeetCode27 t = new LeetCode27();
		int[] arr = { 1, 1, 2 };
		System.out.println(t.removeElement(arr, 2));
	}

}
