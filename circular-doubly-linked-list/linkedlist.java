public class linkedlist {
     Node head;
    Node tail;

    public void prepend(int data){

        Node a=new Node(data);


        if(head==null){
            head=a;
            tail=a;
            
            head.next=tail;
            tail.prev=head;
            head.prev=tail;
            tail.next=head;
        }
        else{
            a.next=head;
            head.prev=a;
            head=a;
            tail.next=head;
            head.prev=tail;
        }
    }
    public void addtoend(int data){
       
        Node a=new Node(data);
        if(head==null){
           head=a;
            tail=a;
            
            head.next=tail;
            tail.prev=head;
            head.prev=tail;
            tail.next=head;
        }
        else{
           tail.next=a;
           a.prev=tail;
           tail=a;

           tail.next=head;
           head.prev=tail;
        }
    }


    public void insert(int data,int index){
       
        Node a=new Node(data);
        if(head==null){
            head=a;
            tail=a;
            
            head.next=tail;
            tail.prev=head;
            head.prev=tail;
            tail.next=head;
        }
        else if(index==0 ){
           a.next=head;
           head.prev=a;
            head=a;
            head.prev=tail;
            tail.next=head;
        }
        else{
            int n=0;
            Node temp=head;
            Node temp2=head;
            while(temp!=tail){
                
                temp=temp.next;
                n++;
            }
            n++;

            if(index>=(n-1)){
                 tail.next=a;
                 a.prev=tail;
                 tail=a;

                 tail.next=head;
                 head.prev=tail;
            }
            else{
                temp=head;
                temp2=temp;
                int i=0;
                while(i<index){
                    i++;

                    temp2=temp;
                    temp=temp.next;
                }
                temp2.next=a;
                a.prev=temp2;

                a.next=temp;
                temp.prev=a;
            }

        }

    }
    public void print(){
        Node temp=this.head;
        if(temp==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=tail){
            System.out.println(temp.data+" -->");
            temp=temp.next;
        }
        System.out.println(temp.data+" --> finished");
    }
}
