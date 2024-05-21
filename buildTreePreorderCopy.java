public class buildTreePreorder {
    public static void main(String[] args) {
        int[] preorder={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        System.out.println(buildTree(preorder).left.right.right);
    }
    static int idx=-1;
    static Node buildTree(int[] preorder){
        idx++;
        if(preorder[idx]==-1){
            return null;
        }
        Node newNode= new Node(preorder[idx]);
        newNode.left= buildTree(preorder);
        newNode.right=buildTree(preorder);
        return newNode;
    }
    static class Node{
        int data;
        Node left; Node right;
        Node(int data){
            this.data=data;
            this.right=null; this.left=null;
        }
    }
}
