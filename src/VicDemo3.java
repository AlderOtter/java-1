import com.judahstutorials.javaintro.tools.Vic;

public class VicDemo3
{
    public static void main(String[] args)
	{
		Vic.reset( args );
	    Vic sally = new Vic();
		Vic jane = new Vic();
		
		// takeCD(); move CD from slot to stack
		sally.takeCD(); // 
		// putCD(); move CD from stack to slot
		jane.putCD(); // from the stack to janes second pos
		
		Vic.say( "I Am Vic" );
	}
}