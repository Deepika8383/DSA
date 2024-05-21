public class ValidateBST {
    public static void main(String[] args) {
        // buildTreePreorder.Node root=BuildBst.trialBST();
        buildTreePreorder.Node root=buildTreePreorder.trialTree();
        System.out.println(validateBst(root, -1, -1));
    }
    public static boolean validateBst(buildTreePreorder.Node root, int min, int max){
        if(root==null) return true;
        if(min!=-1 && root.data<min){
            return false;
        }
        if (max!=-1 && root.data>max) return false;
        if(min!=-1 && root.data<min) return false;
        return validateBst(root.left, min, root.data) && validateBst(root.right, root.data, max);
    }
}