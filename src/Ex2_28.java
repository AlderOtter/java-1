import com.judahstutorials.javaintro.tools.Vic;

public class Ex2_28
{
	public static void main(String[] args)
	{
		Vic.reset ( args );
		VicPlus pal = new VicPlus();
			
		if (pal.seesTwoFilled()) {
			Vic.say("SeesTwoFilled");
		}	else {
			Vic.say("DoesNotSeeTwoFilled");
		}
	}
}