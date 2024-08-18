import com.judahstutorials.javaintro.tools.Vic;

public class SeesSlotDemo
{
	public static void main( String[] args )
	{
		Vic.reset( args );
		Vic tim = new Vic();
		if ( tim.seesSlot() )
		{
			tim.moveOn();
			Vic.say( "Tim found a slot and moved on" );
			if ( tim.seesCD() )
			{
				tim.takeCD();
				// if (  )
			}
		}
	}
}
