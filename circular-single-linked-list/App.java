/**
 * App
 */
public class App {

    public static void main(String[] args) {
        linkedlist a=new linkedlist();

        a.prepend(10);
        a.prepend(20);
        a.prepend(30);
        a.addtoend(50);
        a.insert(15, 2);
        a.delete(50);
        a.prepend(40);

        a.print();


    }
}