import com.judahstutorials.javaintro.tools.Vic;

public class WhileDemo
{	
	public static void main( String[] args )
	{
       Vic.reset( args );
	   Filler tim = new Filler();
	   while ( tim.seesSlot() )
	   {
		   tim.moveOn();
		   Vic.say("moveOn");
	   }
	   Vic.say("DoneMoving");
	}
}