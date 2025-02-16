
public class main {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertFirst(10);
        list.insertFirst(20);
        list.insertFirst(90);
        list.insertFirst(30);
        list.insertLast(40);
        list.insert(490, 1);
        list.insertAfterValue(49,32);
        list.display();

    }
}
