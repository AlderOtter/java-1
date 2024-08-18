import com.judahstutorials.javaintro.tools.Vic;

public class Looper extends Vic
{
	public void fillSlots()
	{
		String pos = getPosition();
		while (seesSlot())
		{
			if ( !seesCD() )
				putCD();
			moveOn();
		}
		backUpTo( pos );
	}
	
    private void backUpTo( String pos )
    {
		while ( !pos.equals( getPosition() ) )
			backUp();
    }
	public void fillOddSlots()
	{
		String pos = getPosition();
		
		while ( seesSlot() && stackHasCD() )
		{
			if ( !seesCD() )
				putCD();
			moveOn();//even
			if ( seesSlot() )
				moveOn();//odd
			
		}
		
		backUpTo( pos );
	}
	public boolean seesAllFilled()
	{
		String pos =	getPosition();
		while ( seesSlot() && seesCD() )
			moveOn();
		boolean result = !seesSlot();
		backUpTo ( pos );
		return result;
	}
	
	 public void fillEvenSlots()
	 {
		 moveOn();
		 fillOddSlots();
		 backUp();
	 }
	 public boolean seesOddsFilled()
	 {
		String pos =	getPosition();
		boolean result = true;
		while ( seesSlot() )
		{
			if ( !seesCD() )
			{
				result = false;
			}
			moveOn();
			if ( seesSlot() )
			{
			moveOn();
			}
			
		}
		backUpTo ( pos );
		return result;
	 }
	 public void bringBack()
	 {
		 String pos = getPosition();
		 if ( seesSlot() && seesCD() )
			 takeCD();
		
		while (seesSlot() )
		{
			if ( seesCD() )
			{
				takeCD();
				backUp();
				putCD();
				moveOn();
			}
			moveOn();
		}
		backUpTo ( pos );
	 }
	 
	  public boolean isAtOneGivenPosition( String pos1, String pos2 )
	  {
		String pos	= getPosition();
		boolean result = pos.equals( pos1 ) || pos.equals( pos2 );
		return result;
	  }
	  public void moveToCorrespondingSlot( Vic param )
	  {
		  while ( param.seesSlot() && seesSlot() )
		  {
			  if ( param.seesCD() )
			  {
				  param.takeCD();
				  putCD();
			  }
			  param.moveOn();
			  moveOn();
		  }
		  
		  
	  }
}