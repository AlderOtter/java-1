import com.judahstutorials.javaintro.tools.Vic;

public class VicPlusDemo
{
	public static void main( String[] args )
	{
		Vic.reset ( args );
		VicPlus victor = new VicPlus();
		//victor.moveOn();
		//if ( victor.hasNoSlot() )
		//	Vic.say( " Not got slot" );
		//else
		//	Vic.say("Test");
	
		//victor.moveOn();
		//if ( victor.canTakeCD() )
		//	Vic.say("canTakeCD");
		//else
		//	Vic.say("Hephalump");
	
		//	if ( victor.seesTwoFilled())
		//	Vic.say("SeesTwoFilled");
		//	else
		//	Vic.say("DoesNotSeeTwoFilled");
		
		//victor.shiftDown();
		
		//victor.removeAllCDs();
		
		//victor.toLastSlot();
		
		//victor.takeOneBefore();
		
		//if ( victor.hasSomeFilledSlot() )
		//	Vic.say( "got filled slot" );
		//else
		//	Vic.say( "not got filled slot" );
	
		//if ( victor.goToLastCD() )
		//	Vic.say( "at last CD" );
		//else
		//	Vic.say( "camel" );
	
		if ( victor.lastIsFilled() ) {
			Vic.say("Last is filled");
		} else {
			Vic.say("Last slot not filled");
		}
	}
}