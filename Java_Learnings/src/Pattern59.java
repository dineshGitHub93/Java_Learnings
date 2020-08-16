
public class Pattern59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int m=1;
			int px=5,py=5,i,j;
			
			for( i=1;i<=5;i++) {
				for(j=1;j<=5*2;j++) {
					if(j>=px && j<=py) {
						System.out.print(" "+(char)(i+64));
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
