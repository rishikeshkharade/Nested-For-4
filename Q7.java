public class Q7 {
	public static void main(String[] args) {
		int row = 6;
		int x = 1;
		char ch = 'F';
		for(int i=1; i<=row; i++) {
			char temp = ch;
			for(int j = 1; j<=i; j++) {
				if(j%2==0) {
					System.out.print(x+++ " ");
				}else {
					System.out.print(temp+++ " ");
				}
				
			}
			ch--;
			System.out.println();
		}
	}

}
