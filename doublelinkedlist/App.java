import java.util.LinkedList;

public class App{
    public static void main(String[] args) {
        DoubleLinkedList a=new DoubleLinkedList();
        a.prepend(10);
        a.addtoend(20);
        a.prepend(15);
        a.insert(14, 3);
        a.print();
        a.delete(10);

        a.print();
    }


}