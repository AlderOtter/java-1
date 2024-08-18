import com.judahstutorials.javaintro.tools.Vic;

public class Filler extends Vic
{	
	public void fillThree()
	{
		if ( stackHasCD() )
		{
			if ( seesSlot() )
			{
				putCD();
				moveOn();
				if ( stackHasCD() )
				{
					if ( seesSlot() )
					{
						putCD();
						moveOn();
						if ( stackHasCD() )
						{
							if ( seesSlot() )
							{
								putCD();
							}
						}
					}
				}
			}
		}
	}
}