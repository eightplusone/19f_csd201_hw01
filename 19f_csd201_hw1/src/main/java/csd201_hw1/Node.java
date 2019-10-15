package csd201_hw1;

/**
 *
 * @author Hai Thanh Tran (haitt36@fe.edu.vn)
 */
public class Node {
    public int value;
    public Node lChild, rChild;
    
    Node() {
        this.value = 0;
        lChild = null;
        rChild = null;
    }
    
    Node(int x) {
        this.value = x;
        lChild = null;
        rChild = null;
    }
}
