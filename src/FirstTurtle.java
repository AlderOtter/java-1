import com.judahstutorials.javaintro.tools.Turtle;

public class FirstTurtle
{
	public static void main ( String[] args )
	{
		/*
		comment
		comments
		more comments
		Hey There!!!
		*/
		Turtle dorothy = new Turtle();
		dorothy.paint( 45, 128 );
		dorothy.paint( -45, 256 );
		dorothy.paint( -135, 256);
		dorothy.move( -45, 128 );
		dorothy.paint( -90, 64);
		dorothy.swingAround( 64 ); //draw a circle
	}
}