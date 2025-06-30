# Longest Harmonious Subsequence (HashMap Approach)

## ✅ Logic

- Use a `HashMap<Integer, Integer>` to store frequencies of all elements in `nums`.
- For each number `x` in the map:
  - If `x + 1` exists, `x` and `x + 1` form a valid harmonious subsequence.
  - Subsequence length = `freq(x) + freq(x + 1)`
  - Keep track of the max such length.

## 🧠 Code Snippet

```java
Map<Integer, Integer> freqMap = new HashMap<>();
for (int num : nums) {
    freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
}

int maxLen = 0;
for (int key : freqMap.keySet()) {
    if (freqMap.containsKey(key + 1)) {
        maxLen = Math.max(maxLen, freqMap.get(key) + freqMap.get(key + 1));
    }
}
