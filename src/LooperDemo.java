import com.judahstutorials.javaintro.tools.Vic;

public class LooperDemo
{
    public static void main( String[] args )
    {
        Vic.reset( args );
        Looper loopy = new Looper();
		//loopy.fillOddSlots();
		
		//if ( loopy.seesOddsFilled() )
		//	Vic.say("OddsFilled");
		//else
		//	Vic.say("OddsNotFilled");
	
		//loopy.fillEvenSlots();
		
		//loopy.bringBack();
		
		loopy.moveOn(); // second position
		String firstSlot	= loopy.getPosition();
		loopy.moveOn(); //third position
		String secondSlot	= loopy.getPosition();
		loopy.moveOn(); //fourth position
		loopy.moveOn();//fifth position
		if ( loopy.isAtOneGivenPosition( firstSlot, secondSlot ) )
			Vic.say( "I am there" );
		else
			Vic.say( "Loopy is lost" );
		
		loopy.backUp(); // fourth position
		if ( loopy.isAtOneGivenPosition( firstSlot, secondSlot ) )
			Vic.say( "I am there" );
		else
			Vic.say( "Loopy is lost" );
		
		loopy.backUp(); // thrird position
		if ( loopy.isAtOneGivenPosition( firstSlot, secondSlot ) )
			Vic.say( "I am there" );
		else
			Vic.say( "Loopy is lost" );
		
		loopy.backUp(); // second position
		if ( loopy.isAtOneGivenPosition( firstSlot, secondSlot ) )
			Vic.say( "I am there" );
		else
			Vic.say( "Loopy is lost" );
		
		loopy.backUp(); // first position
		if ( loopy.isAtOneGivenPosition( firstSlot, secondSlot ) )
			Vic.say( "I am there" );
		else
			Vic.say( "Loopy is lost" );
    }
}