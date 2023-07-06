/**
 * singlelinkedlist
 */
public class App {

    public static void main(String[] args) {
          
       

        singleLinkedList mylist=new singleLinkedList();
        mylist.printoflistelement();

        mylist.prepend(10);
        mylist.prepend(20);
        mylist.addtoend(40);
        mylist.prepend(5);
        mylist.addtoend(30);
        mylist.insert(15, 3);
        mylist.delete(30);
        mylist.deletethelast();
        mylist.deletethefirst();
        mylist.deletethefirst();

        mylist.printoflistelement();
    }
}