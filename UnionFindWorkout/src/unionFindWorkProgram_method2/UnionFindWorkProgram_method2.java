package unionFindWorkProgram_method2;

public class UnionFindWorkProgram_method2 {
	
	static int index[] = new int [ 10 ] ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for ( int j = 0 ; j < 10 ; j ++  )
		{
			index [ j ] = j ;
		}
		
		union ( 5 , 6 );
		
		union ( 6 , 7 );
		
		union ( 7 , 3 ); 
		
		union ( 3 , 8 );
		
		System.out.println( find  ( 1 , 3 )) ;
		
		System.out.println( find ( 3 , 7 ));
		
		

	}
	
	private static void union ( int start , int root )
	{
		
		index[ start ] =  root ;
		
	}
	
	
	private static boolean find ( int start , int root )
	{
		return root ( start ) == root ( root );
	}
	
	private static int root ( int child )
	{
		while ( index [ child ] != child )
		{
			child = index [ child ];
		}
		
		return child;
	}

}
