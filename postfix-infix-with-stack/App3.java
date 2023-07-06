import java.util.Stack;

public class App3 {

    public static int oncelik (char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    public static String infix2Postfix(String infixIfade){
        Stack <Character> s=new Stack<>();
        String postIfade="";
        for(int i=0; i< infixIfade.length() ;i++){
            char c=infixIfade.charAt(i);
            System.out.println(c);
            if(oncelik(c) >0 ) { 
                while (!s.isEmpty() && (oncelik(c) <= oncelik(s.peek()))){
                    postIfade=postIfade + s.pop();
                }
                s.push(c);
            }
            else{
                
                postIfade=postIfade + c;
            }
        }
        int sBoyut=s.size();
        if(sBoyut >0){   
            for(int i=0; i<sBoyut; i++){
                postIfade=postIfade + s.pop();
            }
        }
        return postIfade;
    }


    public static int postfixHesapla(String postfixIfade){
       
        String [] postfixDizi=postfixIfade.split(" ");

        Stack <String> y=new Stack<>();

        String e;
        int s1=0, s2=0, s3=0;
        for(int i=0; i<postfixDizi.length; i++){
            e=postfixDizi[i];
            
            e.trim();
            System.out.println("->"+e+"<-");
            if(e.equals("")){  
                continue;
            }

            if(e.equals("+")){
                s2=Integer.parseInt(y.pop());  
                s1=Integer.parseInt(y.pop());
                s3=s1+s2;
                y.push(String.valueOf(s3));
            }
            else if(e.equals("-")){
                s2=Integer.parseInt(y.pop());  
                s1=Integer.parseInt(y.pop());
                s3=s1-s2;
                y.push(String.valueOf(s3));
            }
            else if(e.equals("*")){
                s2=Integer.parseInt(y.pop());  
                s1=Integer.parseInt(y.pop());
                s3=s1*s2;
                y.push(String.valueOf(s3)); 
            }
            else if(e.equals("/")){
                s2=Integer.parseInt(y.pop());  
                s1=Integer.parseInt(y.pop());
                s3=s1/s2;
                y.push(String.valueOf(s3)); 
            }
            else {
                y.push(e);
            }
        }
        
        int sonuc=Integer.parseInt(y.pop());

        if(! y.isEmpty()){
            System.out.println("Postfix ifade hatalı");
            return 0;
        }

        return sonuc;

    }

    public static void main(String[] args) throws Exception {
        String infixIfade="12    +    5 * 3  - 20   ";

        System.out.println(infix2Postfix(infixIfade));
        
        String postfixIfade="2   3    5    * +     10 -    ";
        System.out.println(postfixIfade + "  sonucu= " +postfixHesapla(postfixIfade));

    }
}
