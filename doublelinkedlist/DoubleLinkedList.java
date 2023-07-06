import javax.xml.crypto.Data;

public class DoubleLinkedList {
    private Node first;

    public DoubleLinkedList(){
        this.first=null;
    }
    public void prepend(int value){
        Node newl=new Node(value);

        if(this.first==null){
            this.first=newl;
            return;
        }

        this.first.SetPrevious(newl);
        newl.SetNext(this.first);

        this.first=newl;

    }

    public void addtoend(int value){
        Node newl=new Node(value);
        if(this.first==null){
            this.first=newl;
            return;
        }
        Node temp=this.first;

        while(temp.getNext()!=null){
            temp=temp.getNext();
        }
        temp.SetNext(newl);
        newl.SetPrevious(temp);

    }
    public void  insert(int value,int index){
        if((this.first==null)||(index==1)){
            this.prepend(value);
            return;
        }
       Node newl=new Node(value);
       Node temp=this.first;
       int counter=1;

       while(temp.getNext()!=null){
        if(counter+1==index){
            break;
        }
        counter++;
        temp=temp.getNext();

       }
       temp.getNext().SetPrevious(newl);
       newl.SetNext(temp.getNext());

       temp.SetNext(newl);
       newl.SetPrevious(temp);


    }
    public void print(){
        Node temp=this.first;
        if(temp==null){
            System.out.println("empty");
        }
        while(temp!=null){
            temp.print();
            temp=temp.getNext();
        }
        System.out.println("-----------------");
    }
    public int delete(int value){
        if(this.first==null){
            return -1;

        }
        if(this.first.getData()==value){
            this.first=this.first.getNext();
            this.first.SetPrevious(null);
            return 0;
        }
        Node temp=this.first;
        while(temp.getData()!=value){
            if(temp.getNext()==null){
                return -2;
            }
            temp=temp.getNext();
        }

        if(temp.getNext()!=null){
            temp.getNext().SetPrevious(temp.getPrevious());
            temp.getPrevious().SetNext(temp.getNext());
        }
        else{
            temp.getPrevious().SetNext(null);

        }
        return 0;
    }


}
