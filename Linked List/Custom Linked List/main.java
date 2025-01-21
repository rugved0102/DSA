public class main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(1);
        list.insertFirst(2);

        list.insertFirst(3);
        list.insertLast(0);
        list.insert(5, 2);
        list.display();
    }
}
