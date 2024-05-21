public class SizeOfLargestBst {
    public static void main(String[] args) {
        
    }
    public static class Info{
        boolean isBst;
        int min; int max; int size;
        public Info(boolean isBst, int min, int max, int size){
            this.isBst=isBst;
            this.min=min; this.max=max; this.size=size;
        }
    }
    public static Info largestBst(buildTreePreorder.Node root, int maxBst){
        if(root==null) return new Info(true, Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        Info leftInfo= largestBst(root.left, maxBst);
        Info rightInfo=largestBst(root.right, maxBst);
        int min= Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max= Math.min(root.data, Math.max(leftInfo.max, rightInfo.max));
        int size=leftInfo.size+rightInfo.size+1;
        if(root.data<=leftInfo.max || root.data>=rightInfo.min){
            return new Info(false,min, max, size);
        }if(leftInfo.isBst && rightInfo.isBst){
            maxBst= Math.max(maxBst, size);
            return new Info(true, min, max, size);
        }
        return new Info(false, min, max, size);
    }
}
