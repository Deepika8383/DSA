import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopViewOfTree {
    public static void main(String[] args) {
        buildTreePreorder.Node root= buildTreePreorder.trialTree();
        topView(root);
    }
    public static void topView(buildTreePreorder.Node root){
        Queue<Info> q= new LinkedList<>();
        HashMap<Integer, Integer> map= new HashMap<>();
        q.add(new Info(root, 0));
        q.add(null);
        map.put(0,root.data);
        int min=0; int max=0;
        while (!q.isEmpty()) {
            Info currNode= q.remove();
            if(currNode==null){
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                }
            }else{
                if(!map.containsKey(currNode.horiDis)) {
                    map.put(currNode.horiDis, currNode.root.data);
                    min=Math.min(min, currNode.horiDis);
                    max=Math.max(max, currNode.horiDis);
                }
                if(currNode.root.left!=null) q.add(new Info(currNode.root.left, currNode.horiDis-1));
                if(currNode.root.right!=null) q.add(new Info(currNode.root.right, currNode.horiDis+1));
            }
        }
        for(int i=min;i<=max;i++){
            System.out.println(map.get(i));
        }
    }
    public static class Info{
        buildTreePreorder.Node root;
        int horiDis;
        public Info(buildTreePreorder.Node root, int dis){
            this.root=root;
            this.horiDis=dis;
        }
    }
}
