import java.util.ArrayList;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        buildTreePreorder.Node root= buildTreePreorder.trialTree();
        ArrayList<Integer> arr= new ArrayList<>();
        System.out.println(LCS2(root, root.right.right, root.left.right).data);
        System.out.println(root.left.data);
        //System.out.println(arr);
    }
    public static int LCS(buildTreePreorder.Node root, buildTreePreorder.Node node1, buildTreePreorder.Node node2){
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        path(root, node1, arr1);
        path(root, node2, arr2);
        int idx=0; boolean found=false;
        while(idx<arr1.size() && idx<arr2.size()){
            if(arr1.get(idx)!=arr2.get(idx)){
                found=true;
                break;
            }
            idx++;
        }
        if(found){
            return arr1.get(idx-1);
        }
        return -1;
    }
    public static buildTreePreorder.Node LCS2(buildTreePreorder.Node root, buildTreePreorder.Node node1, buildTreePreorder.Node node2){
        if(root==null) return null;
        if(root==node1 || root==node2) return root;
        buildTreePreorder.Node left= LCS2(root.left, node1, node2);
        buildTreePreorder.Node right= LCS2(root.right, node1, node2);
        if(right==null){
            return left;
        }
        if(left==null) return right;
        return root;
    }
    public static void kLevel(buildTreePreorder.Node root, int k, int level){
        if(root==null) return;
        if(level==k) {
            System.out.println(root.data);
            return;
        }
        kLevel(root.left, k, level+1);
        kLevel(root.right, k, level+1);
    }
    public static boolean path(buildTreePreorder.Node root, buildTreePreorder.Node node, ArrayList<Integer> arr){
        if(root==null || node ==null){
            return false;
        }
        if(root==node){
            arr.add(root.data);
            return true;
        }
        arr.add(root.data);
        boolean left=path(root.left, node, arr);
        boolean right=path(root.right, node, arr);
        if(!left && !right){
            arr.remove(arr.size()-1);
            return false;
        }
        return true;
    }
}
