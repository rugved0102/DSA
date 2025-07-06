# 🌳 Types of Binary Trees (with Diagrams)

## 1. Full Binary Tree
A binary tree in which every node has **either 0 or 2 children**.

```markdown
    1
   / \
  2   3
 / \  / \
4  5 6   7
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

---
![Screenshot (471)](https://github.com/user-attachments/assets/d51e2b84-7adc-431b-aa5b-19014e48d0d8)

---

# 🌳 Tree Traversals: Inorder, Preorder, Postorder

## ✅ What is Tree Traversal?
> **Tree traversal** means visiting every node in a tree **exactly once** in a specific order.

---

## 1. 🔁 Inorder Traversal (LNR)

- **Order:** Left → Node → Right
- **Use:** Gets nodes in **sorted order** (for BST).

**Example:**
```text
   10
  /  \
 5    15

```
**Inorder:** `5 10 15`

**Java Code:**

```java
void inorder(Node node) {
if (node != null) {
inorder(node.left);
System.out.print(node.value + " ");
inorder(node.right);
}
}
```

---

## 2. 🧭 Preorder Traversal (NLR)

- **Order:** Node → Left → Right
- **Use:** Tree serialization, copying tree structure.

**Example:**
```text
   10
  /  \
 5    15

```

**Preorder:** `10 5 15`

**Java Code:**
```java
void preorder(Node node) {
if (node != null) {
System.out.print(node.value + " ");
preorder(node.left);
preorder(node.right);
}
}
```

---

## 3. 🌀 Postorder Traversal (LRN)

- **Order:** Left → Right → Node
- **Use:** Deleting/freeing tree, evaluating expression trees.

**Example:**
```text
   10
  /  \
 5    15

```
**Postorder:** `5 15 10`

**Java Code:**
```java
void postorder(Node node) {
if (node != null) {
postorder(node.left);
postorder(node.right);
System.out.print(node.value + " ");
}
}
```


---

## 🧠 Quick Comparison Table

| Traversal  | Order      | Common Use                  |
|------------|------------|-----------------------------|
| Inorder    | L → N → R  | Get sorted data (BST)       |
| Preorder   | N → L → R  | Save/copy tree structure    |
| Postorder  | L → R → N  | Deleting, freeing memory    |

---


