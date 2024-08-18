public class IfDemo1
{
	public static void main ( String[] args )
	{
		TurtlePlus plus = new TurtlePlus();
		if ( plus.areYouATurtle() )
			plus.say( "Yes" );
		plus.swingAround( 64 );
	}
}