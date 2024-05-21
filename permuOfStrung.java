public class permuOfStrung {
    public static void main(String[] args) {
        byBackTracking("abc", "");
    }
    static void byBackTracking(String str, String s){
        if(str.length()==0){
            System.out.println(s);
            return;
        }
        for(int i=0;i<str.length();i++){
            String st=str.substring(0, i)+ str.substring(i+1);
            byBackTracking(st, s+str.charAt(i));
        }
    }
}
