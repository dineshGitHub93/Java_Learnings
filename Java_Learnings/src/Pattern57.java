
public class Pattern57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int px=n,py=n;
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=n*2;j++) {
				if(j>=px && j<=py) {
					
					System.out.print(" "+i);
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
			px--;
			py++;
		}

	}

}
