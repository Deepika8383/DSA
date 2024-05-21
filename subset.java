public class subset {
    public static void main(String[] args) {
        String s="abc";
        String str="";
        backtrack(s, 0, str);
    }
    static void backtrack(String s, int i, String str){
        if(i==s.length()){
            System.out.println(str);
            return;
        }
        backtrack(s, i+1, str+s.charAt(i));
        backtrack(s, i+1, str);
    }
}
