# 🌲 AVL Tree

## ✅ What is an AVL Tree?

An **AVL Tree** is a **self-balancing Binary Search Tree** where:
- The **balance factor** of each node is **-1, 0, or +1**.
- Balance Factor = `height(left subtree) - height(right subtree)`
- After every insertion/deletion, the tree is rebalanced using **rotations**.

---

## ⚖️ Why Balance?

- An **unbalanced BST** can degrade to O(n) time.
- AVL Tree guarantees **O(log n)** time for insert, delete, and search.

---

## 🔄 4 AVL Tree Rotations (Rebalancing Rules)

### 1. 🔁 **Left-Left (LL) Rotation**
- When a node is inserted **into the left subtree of the left child**
- ❗ Unbalanced toward **left-left**

```
        z
       /
      y
     /
    x
```

✅ Fix: **Right Rotation (rotate right at z)**
```
       y
      / \
     x   z
```

---

### 2. 🔁 **Right-Right (RR) Rotation**
- When a node is inserted **into the right subtree of the right child**
- ❗ Unbalanced toward **right-right**

```
    z
     \
      y
       \
        x
```

✅ Fix: **Left Rotation (rotate left at z)**
```
   y
  / \
 z   x
```

---

### 3. 🔀 **Left-Right (LR) Rotation**
- When a node is inserted **into the right subtree of the left child**
- ❗ Left child is too deep on right

```
      z
     /
    y
     \
      x
```

✅ Fix:
1. **Left Rotation at y**
```
        z
       /
      x
     /
    y

```
2. **Right Rotation at z**
```
  x
 / \
y   z
```
---

### 4. 🔀 **Right-Left (RL) Rotation**
- When a node is inserted **into the left subtree of the right child**
- ❗ Right child is too deep on left

```
    z
     \
      y
     /
    x
```

✅ Fix:
1. **Right Rotation at y**
```
z
 \
  x
   \
    y
```
2. **Left Rotation at z**
```
  x
 / \
z   y
```
---

## 🧠 Key Points to Remember

- AVL trees use **rotations** to maintain balance after insertion/deletion.
- Height difference between left and right subtrees must be ≤ 1.
- Use **recursive insert** with balance check to maintain AVL properties.
- Rotations are **local operations** — fast and efficient.

---

## 🧮 Time Complexities

| Operation | Time (AVL) |
|-----------|------------|
| Insert    | O(log n)   |
| Delete    | O(log n)   |
| Search    | O(log n)   |

---

## 📌 Tip to Memorize Rotations

- **LL → Rotate Right**
- **RR → Rotate Left**
- **LR → Left at child, then Right at root**
- **RL → Right at child, then Left at root**

---

*Use AVL Trees when guaranteed O(log n) time is needed, especially when frequent insertions/deletions are involved.*