import com.judahstutorials.javaintro.tools.Vic;

public class TwoVicUserDemo
{
    public static void main( String[] args )
    {
        Vic.reset( args );
        TwoVicUser    sally = new TwoVicUser();
		TwoVicUser    jane  = new TwoVicUser();
		
		if ( sally.hasAsManySlotsAs(jane))
			Vic.say("jane and sally have the same same amount of slots");
		else
			Vic.say("some Vics are more equal than others");
    }
}