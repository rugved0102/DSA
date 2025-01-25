public class main {
    public static void main(String[] args) {
        LL list = new LL();
        
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(0);
        list.insert(5, 2);

        // Display the initial list
        list.display(); // Expected: 3 -> 2 -> 5 -> 1 -> 0 -> null

        // Delete operations
        System.out.println(list.deleteFirst()); // Deletes and prints 3
        System.out.println(list.deleteLast());  // Deletes and prints 0

        // Access a specific node
        System.out.println(list.getNodeIndex(1)); // Gets node at index 1 (prints 5)

        // Avoid invalid index
        try {
            System.out.println(list.delete(6)); // Should not work; handle exception
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); // Prints: Invalid index: 6
        }

        // Display the final list
        list.display(); // Expected: 2 -> 5 -> 1 -> null
    }
}
