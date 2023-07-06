public class Btree {
    
    Node root;

    public Btree() {

        root=null;
    }

    Node newNode(int data){

        root=new Node(data);
        return root;
    }

    Node add(Node root,int data){
        if(root!=null){
            if(data<root.data)
                root.left=add(root.left, data);
            else
                root.right=add(root.right,data);    
        }
        else
            root=newNode(data);
        
        
        return root;
    }
    void preOrder(Node node){
        if (node == null) {
      return;
    }
  System.out.printf("%s ", node.data);
    
    preOrder(node.left);
    preOrder(node.right);

    }
     void inOrder(Node node){
        if (node == null) {
      return;
    }
    
    inOrder(node.left);
    System.out.printf("%s ", node.data);
    inOrder(node.right);

    }

     void postOrder(Node node){
        if (node == null) {
      return;
    }
    
    postOrder(node.left);
    postOrder(node.right);
    System.out.printf("%s ", node.data);

    }

    int height (Node node){
        if (node == null) {
      return -1;
     }else{
        int left=0,right=0;

        left=height(node.left);
        right=height(node.right);
        if(left>right)
            return left+1;
        else
            return right+1;

     }
    
  

    }

    int size(Node node){

       if (node == null) {
            return 0;
                         }

        else{
            return size(node.left)+1+size(node.right);
        }
    }
    

    Node delete (Node node,int x){

        Node temp,temp2;

        if(node==null)
            return null;
        if(node.data==x){
            if(node.left==node.right){
                node=null;
                return null;
            }
            else if(node.left==null){
                temp=node.right;
                return temp;
            }
            else if(node.right==null){
                temp=node.left;
                return temp;
            }
            else{
                temp=temp2=node.right;

                while(temp.left!=null){

                    temp=temp.left;
                }
                temp.left=node.left;
                return temp2;
            }
        }
        else{
            if (x<node.data){
                node.left=delete(node.left, x);
            }
            else 
                node.right=delete(node.right, x);
        }

    }
    


}
