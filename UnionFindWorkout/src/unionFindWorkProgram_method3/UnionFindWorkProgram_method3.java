package unionFindWorkProgram_method3;

public class UnionFindWorkProgram_method3 {
	
	static int index [] = new int[ 10 ];
	
	static int weight [] = new int[ 10 ];
	
	public static void main(String[] args)
	
	{
		
			for ( int j = 0 ; j < 10 ; j ++  )
			{
				index [ j ] = j ;
			}
			
			for ( int j = 0 ; j < 10 ; j ++  )
			{
				weight [ j ] = 1 ;
			}
			
			
			union ( 5 , 6 );
			
			union ( 6 , 7 );
			
			union ( 7 , 3 ); 
			
			union ( 3 , 8 );
			
			System.out.println( find  ( 1 , 3 ));
			
			System.out.println( find ( 3 , 7 ));
			
			System.out.println( find ( 1 , 4 ));
			
			System.out.println( find ( 8 , 5 ));
			
			System.out.println( find ( 3 , 9 ));
			
	}
	
	private static void union ( int start , int root )
	{
		if ( weight [ start ] < weight [ root ])
		{
			index [ start ] =  root ;
			
			weight [start] = weight [start] + weight [root];
			
		}
		else
		{
			index [ root ] =  start ; 
			
			weight[root] = weight[start] + weight[root];
			
		}
		
		
	}
	
	private static boolean find ( int start , int root)
	{
		
		return root ( start ) == root ( root );
		
	}

	private static int root ( int root )
	{
		
		while ( index [ root ] != root )
		{
			
			root = index [ root ];
			
		}
		
		return root ; 
		
	}
}
