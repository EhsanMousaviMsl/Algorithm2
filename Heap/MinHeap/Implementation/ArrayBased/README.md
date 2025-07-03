### Array-Based Min-Heap

Most common and efficient for simple uses.

- Complete binary tree stored in an array.
- Easy to compute parent and child indices:
    - `parent(i) = (i - 1) / 2`
    - `left(i) = 2 * i + 1`
    - `right(i) 2 * i + 2`

### Bottom-Up Approach 

the **bottom-up** approach is an efficient way to **turn an entire array into a heap in O(n) time :**

1. We assume the array represents a complete binary tree.
2. Starting from **last non-leaf node**, we appley heapify() downwards.