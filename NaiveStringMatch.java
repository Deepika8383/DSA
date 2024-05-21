public class NaiveStringMatch {
    public static void main(String[] args) {
        brute("algorithm", "th");
    }
    static void brute(String text, String patt){
        int n=text.length(); int m=patt.length();
        System.out.println(n +" "+ m);
        for(int i=0;i<(n-m+1);i++){
            int j;
            for(j=0;j<m;j++){
                if(text.charAt(i+j)!=patt.charAt(j)){
                    break;
                }
            }
            if(j==m){
                System.out.println("found at index :"+ i);
            }
        }
    }
}
