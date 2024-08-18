import com.judahstutorials.javaintro.tools.Vic;

public class Ex3_12
{
    public static void main(String[] args)
    {
        Vic.reset( args );
        Vic    tim = new Vic();
        String pos = tim.getPosition();
		
        while (tim.seesSlot())
			tim.moveOn();
		while ( !pos.equals( tim.getPosition() ) )
		{
			tim.backUp();
			if ( tim.seesCD() )
				tim.takeCD();
        }
		while ( Vic.stackHasCD() )
		{
			tim.putCD();
			tim.moveOn();
		}
    }
}