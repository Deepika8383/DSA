public class MinDisBetweenNodes {
    public static void main(String[] args) {
        buildTreePreorder.Node root= buildTreePreorder.trialTree();
        System.out.println(minDist(root, root.left.left, root.right.right));
    }
    public static int minDist(buildTreePreorder.Node root, buildTreePreorder.Node node1, buildTreePreorder.Node node2){
        if(root==null) return -1;
        buildTreePreorder.Node lca=LowestCommonAncestor.LCS2(root, node1, node2);
        int dis1=lcaDis(lca, node1);
        int dis2=lcaDis(lca, node2);
        return dis1+dis2;
    }
    public static int lcaDis(buildTreePreorder.Node root, buildTreePreorder.Node node){
        if(root==null){
            return-1;
        }
        if(root==node){
            return 0;
        }
        int left=lcaDis(root.left, node);
        int right=lcaDis(root.right, node);
        if(left==-1 && right==-1) return -1;
        else if(left==-1) return right+1;
        else return left+1;
    }
}
