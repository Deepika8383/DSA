public class binaryString {
    public static void main(String[] args) {
        String s="";
        byRecu(2, '0', s);
    }
    static void byRecu(int n, char c, String s){
        if(n==0){
            System.out.println(s);
            return;
        }
        if(c=='0') byRecu(n-1, '1', s+'1');
        byRecu(n-1, '0', s+'0');
    }
}
