public class linkedlist {
    Node head;
    Node tail;

    public void prepend(int data){

        Node a=new Node(data);


        if(head==null){
            head=a;
            tail=a;
            tail.next=head;
        }
        else{
            a.next=head;
            head=a;
            tail.next=head;
        }
    }
    public void addtoend(int data){
       
        Node a=new Node(data);
        if(head==null){
            head=a;
            tail=a;
            tail.next=head;
        }
        else{
           tail.next=a;
           tail=a;
           tail.next=head;
        }
    }

     public void insert(int data,int index){
       
        Node a=new Node(data);
        if(head==null){
            head=a;
            tail=a;
            tail.next=head;
        }
        else if(index==0 ){
           a.next=head;
            head=a;
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
                tail=a;
                tail.next=head;
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
                a.next=temp;
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


    public void delete(int value){
        if(head==null){

        }
        else if(head.data==value && head==tail){
                head=null;
                tail=null;
        }
        else if(head.data==value){
                head=head.next;
                tail.next=head;
        }
        else{
            
            Node temp=head;
            Node temp2=temp;


            while(temp!=tail){

                if(temp.data==value){
                    temp2.next=temp.next;
                 
                }

                temp2=temp;
                temp=temp.next;
            }
            if(tail.data==value){
               tail=temp2;
               tail.next=head; 
               
            }
            
        }
    }

}
