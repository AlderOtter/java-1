import com.judahstutorials.javaintro.tools.Vic;

public class Shifter extends Vic
{
	public void downShift()
	{
		if ( seesSlot() )
		{
			if ( seesCD() )
			{
				takeCD();
				moveOn();
				if ( seesSlot() )
				{
					if ( seesCD() )
					{
					}
					else
						putCD();
				}
			}
		}
	}
}