public class TransformToSumTree {
    public static void main(String[] args) {
        buildTreePreorder.Node root=buildTreePreorder.trialTree();
        trasformTree(root);
        System.out.println(root.data);
    }
    public static int trasformTree(buildTreePreorder.Node root){
        if(root==null) return 0;
        int leftOld=trasformTree(root.left);
        int rightOld=trasformTree(root.right);
        int data=root.data;
        int newleft= root.left!=null? root.left.data: 0;
        int newRight=root.right!=null? root.right.data:0;
        root.data=newRight+rightOld+ newleft+leftOld;
        return data;
    }
}
