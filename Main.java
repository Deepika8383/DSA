import java.util.*;
public class Main {
	public static void solve(){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> o = new ArrayList<>();

		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> e = new ArrayList<>();

		for(int i =0 ;i <n ;i++){
			int x = scn.nextInt();
			if(x%2==0){
				even.add(x);
				e.add(x);
			}
			else{
				odd.add(x);
				o.add(x);
			}
		}

		Collections.sort(o);
		Collections.sort(e);

		if(isSorted(o,odd) && isSorted(e,even)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
	public static boolean isSorted(ArrayList<Integer> even ,ArrayList<Integer> e ){
		for(int i =0 ;i<even.size();i++){
			if(even.get(i)!=e.get(i)){
				return false;
			}
		}
		return true;
	}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t>0){
			solve();
			t--;
		}
    }
}