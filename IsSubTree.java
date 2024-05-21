public class IsSubTree {
    public static void main(String[] args) {
        buildTreePreorder.Node root1=buildTreePreorder.trialTree();
        buildTreePreorder.Node root2=buildTreePreorder.trialTree2();
        System.out.println(isIdentical(root1, root2));
    }
    public static boolean isSubtree(buildTreePreorder.Node root, buildTreePreorder.Node subtree){
        if(root==null) return false;
        if(root.data==subtree.data){
            isIdentical(root, subtree);
        }
        boolean left=isSubtree(root.left, subtree);
        boolean right=isSubtree(root.right, subtree);
        return left || right;
    }
    public static boolean isIdentical(buildTreePreorder.Node root1, buildTreePreorder.Node root2){
        if(root1== null && root2==null) return true;
        else if(root1==null || root2==null) return false;
        if(root1.data!=root2.data) return false;
        boolean left=isIdentical(root1.left, root2.left);
        boolean right=isIdentical(root1.right, root2.right);
        return left && right;
    }
}
