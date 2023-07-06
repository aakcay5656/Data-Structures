import java.util.Stack;

public class App2 {
    public static void main(String[] args) throws Exception {
      
       
        String ifade1="((2*(3+i))-(4-5/(2+8))+(3*k))";
       
        String ifade2="[A+{B*(c+{d/3})}/f]";

        Stack <Character>s=new Stack<>();

        char ifade_dizi1 []=ifade1.toCharArray();
        boolean gecerli=true;
        char k1,k2;

        for (int i=0; i< ifade_dizi1.length; i++){
            k1=ifade_dizi1[i];
            if(k1=='('){
                s.push(k1);
            }
            if(k1==')'){
                if(s.isEmpty()){
                    gecerli=false;
                    break;
                }
                k2=(char) s.pop();
                if(k2!='('){
                    gecerli=false;
                    break;
                }
            }
        }
         if(!s.isEmpty()){
            gecerli=false;
        }

        System.out.println("İfade geçerli: "+gecerli);


    }
}
