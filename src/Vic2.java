import com.judahstutorials.javaintro.tools.Vic;

public class Vic2
{
    public static void main(String[] args)
	{
	    Vic sally = new Vic();
		Vic jane = new Vic();
		jane.moveOn();
		sally.moveOn();
		sally.moveOn();
		
		// takeCD(); move CD from slot to stack
		sally.takeCD(); // 
		// putCD(); move CD from stack to slot
		jane.putCD(); // from the stack to janes second pos
	}
}