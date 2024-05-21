public class RKP {
    public static void main(String[] args) {
        RKp_Algo("abcdab", "cdab");
    }
    static void RKp_Algo(String text, String patt){
        int hashPatt=0; int hashText=0; int m=text.length(); int n=patt.length();
        for(int i=0;i<patt.length();i++){
            hashPatt=hashPatt*10 + (patt.charAt(i)-'a');
            hashText=hashText*10 + (text.charAt(i)-'a');
        }
        // if(hashText==hashPatt && check(patt, text, 0)){
        //     System.out.println("found");
        //     return;
        // }
        for(int i=0;i<m-n;i++){
            if(hashText==hashPatt && check(patt, text, i)){
                System.out.println("found");
                return;
            }
            hashText=(hashText - (text.charAt(i)-'a')*(int)Math.pow(10, n-1))*10 + text.charAt(i+n-1)-'a';
        }
        System.out.println("Not found");
    }
    static boolean check(String patt, String text, int i){
        int k=0;
        for(int j=i;j<patt.length();j++){
            if(patt.charAt(k)!=patt.charAt(j)){
                return false;
            }
            k++;
        }
         if(k==patt.length()-1) return true;
         else return true;
    }
}
