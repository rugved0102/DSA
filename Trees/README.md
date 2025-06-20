# 🌳 Types of Binary Trees (with Diagrams)

## 1. Full Binary Tree
A binary tree in which every node has **either 0 or 2 children**.

```markdown
    1
   / \
  2   3
 / \  / \
4  5 6  7
```

---

## 2. Complete Binary Tree
A binary tree in which all the levels are completely filled **except possibly the last level**, and the last level has all keys as **left as possible**.

```md
    1
   / \
  2   3
 / \  /
4  5 6
```

---

## 3. Perfect Binary Tree
A binary tree in which **all internal nodes have two children** and all leaves are at the **same level**.
```md
    1
   / \
  2   3
 / \ / \
4  5 6  7
```
---

## 4. Balanced Binary Tree
A binary tree in which the height of the two subtrees of **every node differs by at most 1**.

Example (AVL Tree):
```md
    3
   / \
  2   5
 /
1
```
---

## 5. Degenerate (Skewed) Tree
A binary tree in which each parent node has only one child.  
It behaves like a **linked list**.

### Skewed:
```md    
       5
      /
     4
    /
   3
```
   
---

## Summary Table

| Type              | Description                                        |
|-------------------|----------------------------------------------------|
| Full              | Each node has 0 or 2 children                      |
| Complete          | All levels full except possibly last (left filled)|
| Perfect           | Full + all leaves at same level                    |
| Balanced          | Height difference ≤ 1 between subtrees            |
| Degenerate/Skewed | Only one child per node (left or right)           |

