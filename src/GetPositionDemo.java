import com.judahstutorials.javaintro.tools.Vic;

public class GetPositionDemo
{
	public static void main(String[] args)
	{
	Vic.reset ( args );
	Vic spot = new Vic();
	Vic sally = new Vic();
	
	spot.moveOn();
	sally.moveOn();
	sally.moveOn();
	
	System.out.println( spot.getPosition() );
	System.out.println( sally.getPosition() );
	}
}