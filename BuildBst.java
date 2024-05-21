import java.util.ArrayList;
import java.util.Arrays;

public class BuildBst {
    public static void main(String[] args) {
        int val[]={6,1,3,4,2,7,5};
        buildTreePreorder.Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        // ArrayList<Integer> arr= new ArrayList<>();
        // rootToLeaf(root, arr);
        //TreeTraversal.inOrder(root);
        //System.out.println(root.data);
        // System.out.println(searchInBst(root, 4));
        // delete(root, 4);
        // System.out.println(searchInBst(root, 4));
        System.out.println(root.data);
        buildTreePreorder.Node newRoot=BstToBal(root, 7);
        System.out.println(newRoot.data);
    }
    public static buildTreePreorder.Node createBstFromSorted(int[] arr, int st, int end){
        if(st>end) return null;
        int mid=(st+end)/2;
        buildTreePreorder.Node root= new buildTreePreorder.Node(arr[mid]);
        root.left=createBstFromSorted(arr, st, mid-1);
        root.right=createBstFromSorted(arr, mid+1, end);
        return root;
    }
    public static buildTreePreorder.Node BstToBal(buildTreePreorder.Node root, int n){
        int[] arr= new int[n];
        getInorder(root, arr);
        System.out.println(Arrays.toString(arr));
        buildTreePreorder.Node newRoot= createBstFromSorted(arr, 0, n-1);
        return newRoot;
    }
    static int i=0;
    public static void getInorder(buildTreePreorder.Node root, int[] arr){
        if(root==null) return;
        getInorder(root.left, arr);
        arr[i]=root.data;
        i++;
        getInorder(root.right, arr);
    }
    public static buildTreePreorder.Node trialBST(){
        int val[]={5,1,3,4,2,7};
        buildTreePreorder.Node root=null;
        for(int i=0;i<val.length;i++){
            root=insert(root, val[i]);
        }
        return root;
    }
    public static buildTreePreorder.Node insert(buildTreePreorder.Node root, int val){
        if(root==null){
            buildTreePreorder.Node newNode= new buildTreePreorder.Node(val);
            return newNode;
        }
        if(root.data>val){
            root.left=insert(root.left, val);
        }else{
            root.right=insert(root.right, val);
        }
        return root;
    }
    public static boolean searchInBst(buildTreePreorder.Node root, int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }else if(root.data>key){
            return searchInBst(root.left, key);
        }else{
            return searchInBst(root.right, key);
        }
    }
    public static buildTreePreorder.Node delete(buildTreePreorder.Node root, int key){
        if(root.data>key) root.left=delete(root.left, key);
        else if( root.data<key) root.right=delete(root.right, key);
        else{
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;
            buildTreePreorder.Node inorder= findInorder(root.right);
            root.data=inorder.data;
            root.right=delete(root.right, inorder.data);
        }
        return root;
    }
    public static buildTreePreorder.Node findInorder(buildTreePreorder.Node node){
        while(node.left!=null){
            node=node.left;
        }
        return node;
    }
    public static void printInRange(buildTreePreorder.Node root, int k1, int k2){
        if(root==null) return;
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.println(root.data);
            printInRange(root.right, k1, k2);
        }else if(root.data<k1) printInRange(root.right, k1, k2);
        else printInRange(root.left, k1, k2);
    }
    public static void rootToLeaf(buildTreePreorder.Node root, ArrayList<Integer> path){
        if(root==null) return;
        path.add(root.data);
        if(root.left==null && root.right==null){
            System.out.print(path);
            System.out.println();
        }
        //System.out.println();
        rootToLeaf(root.left, path);
        rootToLeaf(root.right, path);
        path.remove(path.size()-1);
    }
}
