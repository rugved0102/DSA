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
ex: https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620

---

# Knuth-Morris-Pratt (KMP) Algorithm

The Knuth-Morris-Pratt (KMP) algorithm is an efficient string matching algorithm that searches for occurrences of a pattern in a text using a preprocessing technique to avoid redundant comparisons.

## Algorithm

1. **Compute LPS (Longest Prefix Suffix) Array**  
   - Create an array `lps[]` where `lps[i]` represents the longest proper prefix of the pattern that is also a suffix.
   - Initialize `lps[0] = 0`, and iterate through the pattern to fill the array.

2. **Pattern Searching Using LPS Array**  
   - Use the `lps[]` array to skip unnecessary comparisons.
   - Iterate through the text and compare characters with the pattern.
   - If a mismatch occurs after some matches, use `lps[]` to shift the pattern instead of restarting from the beginning.

## Implementation (Python)

```python
def compute_lps(pattern):
    lps = [0] * len(pattern)
    length = 0  
    i = 1

    while i < len(pattern):
        if pattern[i] == pattern[length]:
            length += 1
            lps[i] = length
            i += 1
        else:
            if length != 0:
                length = lps[length - 1]
            else:
                lps[i] = 0
                i += 1
    return lps

def kmp_search(text, pattern):
    lps = compute_lps(pattern)
    i = j = 0  

    while i < len(text):
        if pattern[j] == text[i]:
            i += 1
            j += 1

        if j == len(pattern):
            print(f"Pattern found at index {i - j}")
            j = lps[j - 1]
        elif i < len(text) and pattern[j] != text[i]:
            if j != 0:
                j = lps[j - 1]
            else:
                i += 1
```
ex : https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/search-pattern0205
# Example Usage
text = "ABABDABACDABABCABAB"
pattern = "ABABCABAB"
kmp_search(text, pattern)
