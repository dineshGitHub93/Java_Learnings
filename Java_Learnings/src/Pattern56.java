
public class Pattern56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n=5;
			int px=n;
			int py=n;
			
			for(int i=1;i<=5;i++) {
				for(int j=1;j<=n*2;j++) {
					if(j>=px && j<=py) {
						System.out.print(" *");
					}
					else {
						System.out.print("  ");
					}
				}
				px--;
				py++;
				System.out.println();
			}
			
	}

}