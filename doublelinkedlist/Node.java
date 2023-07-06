public class Node {
    private int data;
    private Node previous;
    private Node next;

    public Node(){
        this.data=0;
        this.previous=null;
        this.next=null;   
    }
    public Node (int value){
        this.data=value;
        this.previous=null;
        this.next=null;  
    }
    public void print(){
        System.out.println(" "+this.data);
    }
    public void SetData(int data){
        this.data=data;
    }
    public void SetPrevious(Node previous){
        this.previous=previous;
    }
    public void SetNext(Node next){
        this.next=next;
    }
    public int getData(){
            return data;
    }
    public Node getPrevious(){
        return previous;
    }
    public Node getNext(){
        return next;
    }
    
}
