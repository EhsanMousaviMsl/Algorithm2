package tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private NodeTree root;

    public void insert(int value) {
        NodeTree current = new NodeTree(value);
        if (root == null){
            root = current;
            return;
        }
   
        Queue<NodeTree> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            NodeTree temp = queue.poll();
            if(temp.left == null) {
                temp.left = current;
                break;
            }else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = current;
                break;
            }else {
                queue.add(temp.right);
            }

        }
        
    }

    public void inOrder (NodeTree node) {
        if (node == null) return;
        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void printInOrder() {
        inOrder(root);
    }

    
}
