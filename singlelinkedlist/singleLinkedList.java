public class singleLinkedList {
    private Node first; // variable holding the start of the list

    public singleLinkedList(){
        this.first=null; // list is created empty
    }
    // Adding an element to the top of the list
    public void prepend(int value){
        Node newlist=new Node(value);
        newlist.setNext(this.first);
        this.first=newlist;

    }
    public void prepend(Node newlist){
        newlist.setNext(this.first);
        this.first=newlist;
    }
    
    // add an element to the end of the list
    public void addtoend(int value){
        Node newl=new Node(value);
        if(this.first==null){
            this.first=newl;
            return;
        }
        Node temp=this.first;
        while(temp.getnext()!=null){
            temp=temp.getnext();
        }
        temp.setNext(newl);
    }
    public void addtoend(Node newlist){
        if(this.first==null){
            this.first=newlist;
            return;
        }
        Node temp=this.first;
        while (temp.getnext()!=null){
            temp=temp.getnext();
        }
        // at the loop exit temp is positioned on the last node
        temp.setNext(newlist);


    }
    // Calculating the number of elements in a list
    public int numberoflistelements(){
        int counter=0;
        Node temp=this.first;
        while (temp!=null){
            counter++;
            temp=temp.getnext();
        }
        return counter;
    }

    // Writing the values ​​of all the elements in the list to the screen
    public void printoflistelement(){
        Node temp=this.first;
        if(temp==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=null){
            temp.print();
            temp=temp.getnext();
        }
        System.out.println("----------------");
    }

    // looks for a value in the list and returns that node when it can 
    public Node searchlist (int value){
        Node temp=this.first;
        Node found=null;
        while(temp!=null){
            if(temp.getData()!=value){
                temp=temp.getnext();
            }
            else{
                found=temp;
                break;
            }
            
        }
        return found;
    } 
    // function that returns how many of the lookup values ​​are in the list
    public int searchlistwithCounter (int value,int counter){
        Node temp=this.first;
        
        int c=0;
        while(temp!=null){
            if(temp.getData()!=value){
                temp=temp.getnext();
            }
           
           else if(temp.getData()==value){
            c++;
           } 
           else if(temp==null){
                
                break;
           }
            
        }
        return c;
    } 
   // function that adds the value to any index in the list
    public void insert(int value,int index){
        if((this.first==null)||(index==1)){
            this.prepend(value);
            return;
        }
        Node newl=new Node(value);
        Node temp=this.first;
        int counter=1;

        while(temp.getnext()!=null){
            if(counter+1==index){
                break;
            }
            counter++;
            temp=temp.getnext();
        }
        newl.setNext(temp.getnext());
        temp.setNext(newl);
    }

    public int delete(int value){
        if(this.first==null){
            return -1;
        }
        if(this.first.getData()==value){
            this.first=this.first.getnext();
            return 0;
        }
        Node temp=this.first;
        while(temp.getnext().getData()!=value){
            if(temp.getnext().getnext()==null){
                return -2;
            }
            temp=temp.getnext();
        }
        temp.setNext(temp.getnext().getnext());
        return 0;
    }
public void deletethelast(){
    Node temp=this.first;
    if(first==null){
        System.out.println("  empty");
    }
    else if(temp.next==null){
        first=null;
    }
    
    while(temp.getnext().getnext() !=null){
         temp=temp.getnext();
    }
    temp.setNext(null);
}

public void deletethefirst(){

    Node temp=this.first;


    if(first==null){
        System.out.println("  empty");
    }
   

     else if(temp.next==null){
        this.first=null;
    }
    
    else{
       temp=temp.next;
        
    }
    
    
}

}
