public class BasicsFuntion {
    public static void main(String[] args) {
        System.out.println(diameterApp2(buildTreePreorder.trialTree()).dia);;
    }
    public static int height(buildTreePreorder.Node root){
        if(root==null) return 0;
       // if(root.left ==null && root.right==null) return 0;
        int left=0; int right=0;
        if(root.left!=null) left=height(root.left);
        if(root.right!=null) right=height(root.right);
        return Math.max(left, right)+1;
    }
    public static int count(buildTreePreorder.Node root){
        if(root==null) return 0;
        return count(root.left)+ count(root.right)+1;
    }
    public static int sumOfNodes(buildTreePreorder.Node root){
        if(root==null) return 0;
        return sumOfNodes(root.left)+ sumOfNodes(root.right)+root.data;
    }
    public static int diamterApp1(buildTreePreorder.Node root){
        if(root==null) return 0;
        int leftDia=diamterApp1(root.left);
        int rightDia=diamterApp1(root.right);
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftDia, Math.max(rightDia, leftHeight+rightHeight+1));
    }
    public static Info diameterApp2(buildTreePreorder.Node root){
        if(root==null) return new Info(0, 0);
        Info left= diameterApp2(root.left);
        Info right= diameterApp2(root.right);
        int dia=Math.max(left.dia, Math.max(left.dia, left.height+right.height+1));
        int height=Math.max(left.height, right.height)+1;
        return new Info(dia, height);
    }
    static class  Info {
        int dia; 
        int height;
        Info(int dia, int ht){
            this.dia=dia;
            this.height=ht;
        }
    }
}
