public class App {
    public static void main(String[] args) throws Exception {
        Stack myStack=new Stack(5);

        if(myStack.isEmpty()){
            System.out.println("stack is empty");
        }

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println("Stack Size :"+myStack.size());

        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        System.out.println("Stack Size :"+myStack.size());
        myStack.push(70);

        if(myStack.isFull()){
            System.out.println("stack is full");
        }

        myStack.push(80);
        System.out.println("Stack Size :"+myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
