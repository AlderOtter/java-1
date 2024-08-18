import com.judahstutorials.javaintro.tools.Vic;

public class MoveToFront
{
    public static void main(String[] args)
    {
        Vic.reset( args );
        Vic    tim = new Vic();
        String pos = tim.getPosition();
		
        while ( tim.seesSlot() )
        {
            if ( tim.seesCD() )
                tim.takeCD();
                tim.moveOn();
        }

        while ( !pos.equals( tim.getPosition() ) )
            tim.backUp();

        while ( Vic.stackHasCD() )
        {
            tim.putCD();
            tim.moveOn();
        }
    }
}