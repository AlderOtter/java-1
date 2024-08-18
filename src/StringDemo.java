public class StringDemo
{
	public void main( String[] args )
	{
		String str1		= "go dog, go!";
		String str2 	= "go dog, ";
		String str3		= str2 + "go!";
		
		System.out.println( str1 );
		System.out.println( str3 );
		if ( str1.equals(str3) )
			System.out.println( "equal" );
		else
			System.out.println( "not equal" );
	}
}