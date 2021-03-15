import java.util.Arrays;

class StringNumberseparate{
	public static void main(String[] args) {
		int mat[][]= {{1,5,7,6},
				      {11,5,3,6},
				      {9,15,3,6},
				      {5,3,12,2}}	;	
		              print2d(mat);
		}
		
	
	public static void print2d(int mat[][])
	{
//		for (int i=0;i<mat.length;i++) 
//		{
//			for (int j=0;j<mat[i].length;j++) 
//			{
//				System.out.print(mat[i][j]+" ");
//				
//			}
//		}
		for (int[] row : mat) 
			  
            // converting each row as string 
            // and then printing in a separate line 
            System.out.println(Arrays.toString(row)); 
	}
	
}
