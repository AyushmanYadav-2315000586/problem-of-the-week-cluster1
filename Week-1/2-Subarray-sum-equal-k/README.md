# 🧩 Problem: Subarray Sum Equals K

📄 **Description:**  
Given an integer array `nums` and a target value `k`, find the **total number of continuous subarrays** whose sum equals `k`.  
This problem is useful in analytics, such as finding streaks in financial transactions or activity logs.

🧠 **Category:** Prefix Sum / HashMap (with Brute Force variants)

---

## ✅ Approaches

### 1. Brute Force (Triple Loop)

- **Logic:**  
  Check every possible subarray by using three loops:

  - Outer loop fixes the starting index `i`.
  - Middle loop fixes the ending index `j`.
  - Inner loop sums all elements between `i` and `j`.  
    Increment count whenever the sum equals `k`.

- **Time Complexity:** O(n³)
- **Space Complexity:** O(1)

Implemented in: `bruteforce.java`

---

### 2. Better (Double Loop)

- **Logic:**  
  Instead of recalculating the sum every time, maintain a running `sum` for each `i` while expanding `j`.

  - For each `i`, reset `sum = 0`.
  - Iterate `j` from `i` to `n-1`, adding `nums[j]` to `sum`.
  - Increment count if `sum == k`.

- **Time Complexity:** O(n²)
- **Space Complexity:** O(1)

Implemented in: `better.java`

---

### 3. Optimal (Prefix Sum + HashMap)

- **Logic:**  
  Use a running prefix sum and store frequencies in a HashMap:

  - Maintain `prefixSum` as you iterate.
  - For each element, check if `(prefixSum - k)` exists in the map.  
    If yes, add its frequency to `count`.
  - Update the frequency of `prefixSum` in the map.

- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

Implemented in: `optimal.java`

---

## 📌 Sample I/O

```java
**Input:**
nums = [1, 2, 3, -3, 1, 1], k = 3
**Output:**
5

Explanation:
The 5 subarrays whose sum is 3 are: [1, 2] , [3] , [3, -3, 1, 1, 1] , [1, 1, 1] , [2, 3, -3, 1]
```
