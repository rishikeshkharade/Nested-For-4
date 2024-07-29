public class Q9 {
	public static void main(String[] args) {
		int row = 4;
		int n = 1;
		for(int i=1 ; i<=row;i++) {
			int x = n;
			for(int j = 1; j<=i; j++) {
				if(j%2==0) {
					System.out.print(x*x+" ");
				}else{
					System.out.print(x*x*x+" ");
				}
				x++;
			}
			n++;
			System.out.println();
		}
	}

}
