package csd201_hw1;

/**
 *
 * @author Hai Thanh Tran (haitt36@fe.edu.vn)
 */
public class BSTree {
    public Node root;
    
    BSTree() {
        this.root = null;
    }
    
    BSTree(int x) {
        this.root = new Node(x);
    }
    
    public boolean add(int x) {
        if (this.root == null) {
            this.root = new Node(x);
            return true;
        }
        
        Node curr = this.root;
        Node prev = null;
        
        while (curr != null) {
            if (curr.value == x) {
                System.out.println("Value existed");
                return false;
            } 
            
            prev = curr;
            
            // Move curr to the location where x will be added
            if (x < curr.value) {
                curr = curr.lChild;
            } else {
                curr = curr.rChild;
            }
        }
            
        // Create a new Node containing x. Connect the node to the tree
        if (x < prev.value) {
            prev.lChild = new Node(x);
            System.out.print("\n" + x + " was added to the tree");
        } else {
            prev.rChild = new Node(x);
            System.out.print("\n" + x + " was added to the tree");
        }
        
        return true;
    }
    
    public boolean remove(int x) {
        return true;
    }
    
    public void printInorder() {
        System.out.print("\nIn-order Traversal: ");
        if (this.root != null) inOrder(this.root);
    }
    
    private void inOrder(Node curr) {
        if (curr == null) return;
        inOrder(curr.lChild);
        System.out.print(" - " + curr.value);
        inOrder(curr.rChild);
    }
}
