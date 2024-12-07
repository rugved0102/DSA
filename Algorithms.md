### Dutch National Flag Algorithm

**Approach:**
1. Initialize three pointers: `low`, `mid`, and `high`.
2. Traverse the array using the `mid` pointer:
   - If `nums[mid] == 0`: Swap it with `nums[low]`, and increment both `low` and `mid`.
   - If `nums[mid] == 1`: Simply increment `mid`.
   - If `nums[mid] == 2`: Swap it with `nums[high]`, and decrement `high`.
3. Continue until `mid` exceeds `high`.

---

### Moore’s Voting Algorithm

**Approach:**
1. Initialize two variables:
   - `Count`: for tracking the count of the current candidate.
   - `Element`: for the candidate element.
2. Traverse through the given array:
   - If `Count` is 0, set `Element` to the current element.
   - If the current element is the same as `Element`, increase `Count` by 1.
   - If they are different, decrease `Count` by 1.
3. The integer present in `Element` should be the result we are expecting.
ex: https://leetcode.com/problems/majority-element/description/

---

## Kadane's Algorithm

**Kadane's Algorithm** is used to find the maximum sum of a contiguous subarray in an array of integers (positive or negative).

### Approach:
1. Initialize two variables:
   - `currentSum`: Stores the sum of the current subarray.
   - `maxSum`: Tracks the maximum subarray sum found so far.
2. Traverse the array:
   - Add each element to `currentSum`.
   - If `currentSum` is less than the current element, reset `currentSum` to the current element (start a new subarray).
   - Update `maxSum` if `currentSum` is larger than `maxSum`.
3. Return `maxSum`.
