import com.judahstutorials.javaintro.tools.Vic;

public class TwoVicUser extends Vic
{
    public boolean hasAsManySlotsAs( Vic parm )
    {
        String pos = getPosition();
        while ( seesSlot() && parm.seesSlot() )
        {
            moveOn();
            parm.moveOn();
        }
        
        boolean rval = !seesSlot() && !parm.seesSlot();
        while ( !pos.equals( getPosition() ) )
        {
            backUp();
            parm.backUp();
        }

        return rval;
    }
}
