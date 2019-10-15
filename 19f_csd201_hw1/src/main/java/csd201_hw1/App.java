package csd201_hw1;

/**
 *
 * @author Hai Thanh Tran (haitt36@fe.edu.vn)
 */
public class App {
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        
        tree.add(6);
        tree.printInorder();
        
        tree.add(4);
        tree.add(8);
        tree.printInorder();
        
        tree.add(2);
        tree.add(5);
        tree.add(7);
        tree.add(9);
        tree.printInorder();
        
        tree.add(13);
        tree.printInorder();
    }
}
