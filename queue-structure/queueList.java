public class queueList {
    
    int [] series;
    int size;

    int front;
    int rear;

    public queueList(int size){
        this.size=size;
        series=new int[size];
        front=0;
        rear=-1;


    }

    boolean isfull(){
        return rear==size-1;
    }
    

    void enQueue(int data){
    
        if(isfull()){
            
        }
        else{
            
            rear++;
            series[rear]=data;

        }
        

    }

    void deQueue(){


        if(!isfull()){
            System.out.println("series is empty");
        }
        else{
            int a=series[front];

            for(int i=1;i<=rear;i++){
                series[i-1]=series[i];
            }
            rear--;
           
        }
       
    }

    void print(){
        int i=rear;
        
        while(i>=0){
            System.out.println(series[i]+" -->");
            i--;
        }
        
    }

}
