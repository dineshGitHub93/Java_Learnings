
public class Pattern42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int z=1;
		for(int i=1;i<=n;i++) {
			for(int j=n; j>i; j--) {
				System.out.print("  ");
			}
			for(int k=1; k<=z; k++) {
				System.out.print(" "+i);
			}
			z+=2;
			System.out.println();
		}
	}

}
