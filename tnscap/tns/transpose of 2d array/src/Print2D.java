
public class Print2D {
	public void  print2D(int arr[][] , int row , int column) {
		System.out.println("print your array");
		
		for(int i= 0 ; i<row ; i++) {
			for(int j=0 ;j<column ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
