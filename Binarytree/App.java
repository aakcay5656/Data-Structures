/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Btree tree=new Btree();

      tree.root= tree.add(tree.root, 10);
      tree.root=tree.add(tree.root, 8);
        tree.root=tree.add(tree.root, 15);
        
        tree.root=tree.add(tree.root, 5);
        tree.root=tree.add(tree.root, 12);
        tree.root=tree.add(tree.root, 20);
        tree.root=tree.add(tree.root, 9);
        tree.root=tree.add(tree.root, 25);


        System.out.print("PreOrder: ");

        tree.preOrder(tree.root);
       

        System.out.print("\n İnOrder: ");

        tree.inOrder(tree.root);

        
        
        System.out.print("\n  postOrder: ");

        tree.postOrder(tree.root);

        System.out.print("\n  tree height: " +tree.height(tree.root));

          System.out.print("\n  tree size: " +tree.size(tree.root));

        


        
    }

}