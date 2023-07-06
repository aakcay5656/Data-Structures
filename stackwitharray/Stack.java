public class Stack {
      private int StackDizi [] ;
    private int StackIndex;
    private int StackBoyut;

    public Stack(int boyut){
        this.StackBoyut=boyut;
        this.StackDizi=new int [this.StackBoyut];
        this.StackIndex=-1;
    }


    public boolean isEmpty(){
        return (this.StackIndex == -1);
    }

    public boolean isFull(){
        return (this.StackIndex == this.StackBoyut-1);
    }

    public int size(){
        return this.StackIndex+1;
    }

    public boolean push(int deger){
        if (this.isFull()){
            return false;
        }
        this.StackIndex++;
        this.StackDizi[this.StackIndex]=deger;
        return true;
    }

    public int pop(){
        if(this.isEmpty()){
            return -1;
        }
        int d=this.StackDizi[this.StackIndex];
        this.StackIndex--;
        return d;
    }

    public int peek(){
        if(this.isEmpty()){
            return -1;
        }
        return (this.StackDizi[this.StackIndex]);
    }
}
