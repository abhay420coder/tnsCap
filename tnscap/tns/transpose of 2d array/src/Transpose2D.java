
public class Transpose2D {
	public void transpose2D(int arr[][] , int row , int column) {
		System.out.println("print your transpose  array");
		
		for(int i= 0 ; i<row ; i++) {
			for(int j=0 ;j<column ; j++) {
				System.out.print(arr[j][i] + " ");
			}
			System.out.println();
		}
	}
}
