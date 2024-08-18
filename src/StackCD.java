import com.judahstutorials.javaintro.tools.Vic;

public class StackCD
{	
	public static void main( String[] args )
    {
		Vic.reset( args );
		Vic vik = new Vic();
		if ( vik.seesSlot() && Vic.stackHasCD() )
		{
			vik.putCD();
			vik.moveOn();
			if ( vik.seesSlot() )
			{
				if ( Vic.stackHasCD() )
				{
					vik.putCD();
					vik.moveOn();
				}
			}
		}
	}
}
