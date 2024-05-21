public class removeduplicate {
    public static void main(String[] args) {
        String s= "apnacollagea";
        boolean[] alpha= new boolean[26];
        StringBuilder sb= new StringBuilder();
        removeduplicateDpTab(s);
    } 
    static void removeduplicateCharacterRec(String s, boolean[] alpha, StringBuilder sb, int i){
        if(i==s.length()) {
            System.out.println(sb);
            return;
        }
        if(!alpha[s.charAt(i)-'a']){
            alpha[s.charAt(i)-'a']=true;
            sb.append(s.charAt(i));
        }
        removeduplicateCharacterRec(s, alpha, sb, i+1);
    }
    static void removeduplicateDpTab(String s){
        boolean[] alpha= new boolean[26];
        String st= "";
        for(int i=0;i<s.length();i++){
            if(!alpha[s.charAt(i)-'a']){
                alpha[s.charAt(i)-'a']=true;
                st+=s.charAt(i);
            }
        }
        System.out.println(st);
    }
}
