public class MirrorBST {
    public static void main(String[] args) {
        buildTreePreorder.Node root= BuildBst.trialBST();
        TreeTraversal.inOrder(root);
        root=createMirror(root);
        System.out.println("------------------");
        TreeTraversal.inOrder(root);
    }
    // public static buildTreePreorder.Node createMirror(buildTreePreorder.Node root){
    //     if(root==null) return null;
    //     root.right=createMirror(root.left);
    //     root.left=createMirror(root.right);
    //     return root;
    // }
    public static buildTreePreorder.Node createMirror(buildTreePreorder.Node root){
        if(root==null) return null;
        
        // Swap the left and right child nodes
        buildTreePreorder.Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        // Recur for left and right subtrees
        createMirror(root.left);
        createMirror(root.right);
        
        return root;
    }
    
}
