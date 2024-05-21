import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        int[] preorder= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] idx={-1};
        buildTreePreorder.Node root= buildTreePreorder.buildTree(preorder,idx);
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
    }
    static void preorder(buildTreePreorder.Node root){
        if(root==null) {
            System.out.print(" null : ");
            return;
        }
        System.out.print(root.data+" : ");
        preorder(root.left);
        preorder(root.right);
    }
    static void inOrder(buildTreePreorder.Node root){
        if(root==null) {
            System.out.print(" ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    static void postOrder(buildTreePreorder.Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data);
    }
    static void levelOrder(buildTreePreorder.Node root){
        Queue<buildTreePreorder.Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            buildTreePreorder.Node currNode= q.remove();
            if(currNode==null){
                System.out.println("null");
                if(q.isEmpty()) break;
                else q.add(null);
            }else{
                System.out.print(currNode.data);
                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);
            }
        }
    }
}
