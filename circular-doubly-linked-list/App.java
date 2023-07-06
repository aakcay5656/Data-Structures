public class App {
    public static void main(String[] args) {
        linkedlist a=new linkedlist();

        a.prepend(10);
        a.prepend(20);
        a.prepend(30);
        a.addtoend(50);
        a.insert(15, 5);
        
        a.prepend(40);

        a.print();
    }
}
