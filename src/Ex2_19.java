import com.judahstutorials.javaintro.tools.Vic;

public class Ex2_19
{	
	public static void main( String[] args )
	{
		Vic.reset( args );
		@SuppressWarnings("unused")
		Vic jane = new Vic();
		Vic sally = new Vic();
		if ( Vic.stackHasCD() )
		{
			if ( sally.seesSlot() )
			{
				sally.moveOn();//second slot
				if ( sally.seesSlot() )
				{
					sally.moveOn();//third slot
					if ( sally.seesSlot() )
					sally.putCD();
					if ( Vic.stackHasCD() )
					{
						sally.moveOn();//fourth slot
						if ( sally.seesSlot() )
						{
							sally.putCD();
						}
					}
				}
			}
		}
	}
}
// java Ex2_19 0 0000 #2