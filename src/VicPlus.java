import com.judahstutorials.javaintro.tools.Vic;

public class VicPlus extends Vic
{
	public boolean hasNoSlot()
	{
		return !seesSlot();
	}
    public boolean canTakeCD_orig()
    {
        if ( seesSlot() )
        {
            if ( seesCD() )
                return true;
            else
                return false;
        }
        else
            return false;
    }
	public boolean canTakeCD_takeFive()
	{
		boolean rval	= false;
		if ( seesSlot() )
			if ( seesCD() )
				rval= true;
			return rval;
	}
	
	public boolean canPutCD_orig()
	{
		boolean result = false;
		if ( seesSlot() )
			if (seesCD() )
				result = true;
			return result;
	}
	
	public boolean seesTwoFilled()
	{
		boolean result = false;
		if ( canTakeCD() )
		{
			moveOn();
			result = canTakeCD();
			backUp();
		}
		return result;
	}
	
	public boolean canTakeCD()
	{
		return seesCD() && seesSlot();
	}
	
	public boolean canPutCD()
	{
		return seesSlot() && seesCD();
	}
	
	 public void shiftDown()
	 {
		if (seesCD())
		{
			takeCD();
			moveOn();
			if (seesSlot())
			{
				if (!seesCD())
				{
					putCD();
				}
			}
		}
	 }
	 public void removeAllCDs()
	 {
		while ( seesSlot() )
		{
			if ( seesCD() )
				takeCD();
			moveOn();
		}
	 }
	 public void toLastSlot()
	 {
		while ( seesSlot() )
		{
			moveOn();
		}
		backUp();
	 }
	 public void takeOneBefore()
	 {
		while ( seesSlot() )
		{
			moveOn();
		}
		backUp();
		while ( !seesCD() )
		{
			backUp();
		}
		takeCD();
	 }
	 public boolean hasSomeFilledSlot()
	 {
		String pos = getPosition();
		while ( seesSlot() && ! seesCD() )
			moveOn();
		boolean result = seesSlot();
		
		while ( !pos.equals( getPosition() ) )
			backUp();
		return result;
	 }
	 
	 public boolean goToLastCD()
	 {
		 boolean result		= false;
		 String pos		= getPosition();
		 while ( seesSlot() )
		 {
			 if ( seesCD() )
			 {
				 pos = getPosition();
				 result = true;
			 }
			 moveOn();
		 }
		 while ( !pos.equals(getPosition() ) )
			 backUp();
		 return result;
	 }
	 public boolean lastIsFilled()
	 {
		 while ( seesSlot() )
			 moveOn();
		 backUp();
		 boolean result = seesCD();
		 return result;
	 }
}