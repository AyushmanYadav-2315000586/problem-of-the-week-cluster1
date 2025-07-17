# 🧩 Problem: Min in Sorted Rotated Array

📄 **Description:**  
Imagine you're working on an update system for a fleet of autonomous vehicles at Uber. The system stores updates in a sorted array for efficiency, but due to reboots, the array sometimes gets rotated. You must find the **minimum element**.

🧠 **Category:** Binary Search (Variant)

---

## ✅ Approaches:

### 1. Brute Force

- **Logic:**  
  Traverse the entire array and keep track of the smallest element seen so far.

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

### 2. Optimized Binary Search

- **Logic:**  
  Use a modified binary search.  
  - If the left part (from `low` to `mid`) is sorted, then the minimum might be in that part → update `ans` with `arr[low]`, and shift `low = mid + 1`.  
  - Else, the minimum is in the right part → update `ans` with `arr[mid]`, and shift `high = mid - 1`.

- **Time Complexity:** O(log n)  
- **Space Complexity:** O(1)

---

## 📌 Sample I/O

**Input:**
arr = [4, 5, 6, 7, 1, 2]

**Output:**
1



**Explanation:**  
The original sorted array might have been `[1, 2, 4, 5, 6, 7]`, but it got rotated. The minimum element is `1`.

---