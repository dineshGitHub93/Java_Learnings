
public class Pattern45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m=1;
		int n=5;
		int p_height = n-1;
		
		int i,j,k;
		
		for(i=1;i<=n;i++) {
			for(j=p_height;j>=i;j--) {
				System.out.print("  ");
			}
			for(k=1;k<=m;k++) {
				System.out.print(" "+(char)(m+64));
			}
			m+=2;
			System.out.println();
		}

	}

}
