
public class buildTreePreorder {
    public static void main(String[] args) {
        int[] preorder={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int[] idx={-1};
        Node root= buildTree(preorder,idx);
        TreeTraversal.postOrder(root);
        TreeTraversal.inOrder(root);
    }
    public static Node trialTree(){
        int[] preorder={1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        int[] idx={-1};
        Node root= buildTree(preorder,idx);
        return root;
    }
    public static Node trialTree2(){
        int[] preorder={1,2,4,-1,-1,-1,3,-1,6,-1,-1};
        int[] idx={-1};
        Node root= buildTree(preorder,idx);
        return root;
    }
    public static Node buildTree(int[] preorder, int[] idx) {
        idx[0]++;
        if (idx[0] >= preorder.length || preorder[idx[0]] == -1) {
            return null;
        }
        Node newNode = new Node(preorder[idx[0]]);
        newNode.left = buildTree(preorder, idx);
        newNode.right = buildTree(preorder, idx);
        return newNode;
    }
    public static class Node{
        int data;
        Node left; Node right;
        public Node(int data){
            this.data=data;
            this.right=null; this.left=null;
        }
    }
}
