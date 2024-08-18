import com.judahstutorials.javaintro.tools.Vic;

public class ElseDemo
{
	public static void main ( String[] args )
	{
		Vic.reset( args );
		Vic sally = new Vic();
		if ( sally.seesSlot() )
		{
			if ( sally.seesCD() ) {
				Vic.say("Sally sees a CD");
			    sally.takeCD();
			} else {
				Vic.say("Sally does not see a CD");
			    sally.moveOn();
			}
		}
	}
}