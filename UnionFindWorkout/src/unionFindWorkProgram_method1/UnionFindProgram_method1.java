package unionFindWorkProgram_method1;

public class UnionFindProgram_method1 {
	
	static int i[] = new int[11];
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for ( int j = 1 ; j < 11 ; j ++  )
		{
			i [ j ] = j ;
		}
		
		union ( 5, 6 );
		
		union ( 6 , 7 );
		
		union ( 7 , 3 ); 
		
		System.out.println( find  ( 1 , 3 )) ;
		
		System.out.println( find ( 3 , 7 ));

	}
	
	private static void union ( int start , int root )
	{
		for ( int k = 1 ; k < 11 ; k++)
		{
			if ( i [ k ] == start )
			{
				i[ k ] = root ;
			}
		}
		
		i [ start ] = root ; 
	}
	
	private static boolean find ( int start , int root )
	{
		return i [ start ] == i [ root ];
	}

}
