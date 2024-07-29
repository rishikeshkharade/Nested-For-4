class Q4{
	public static void main(String[] args) {
		int row=4;
		char ch = 'A';
		for(int i = 1; i<=row;i++) {
			//int temp = i;
			for(int j = 1; j<=(row-i+1); j++) {
				System.out.print(ch+++ " ");
			}
			System.out.println();
		}
	}
}