/**
 * Node
 */
public class Node {
    private int data;
    public Node next;
    public Node(){
        this.data=0;
        this.next=null;
    }
    public Node(int value){
        this.data=value;
        this.next=null;
    }
    public void print(){
        System.out.println(" "+this.data);
    }
    public int getData(){
        return this.data;
    }
    public void setData(int value){
        this.data=value;
    }
    public Node getnext(){
        return this.next;
    }
    public void setNext(Node ref){
        this.next=ref;
    }
    
}