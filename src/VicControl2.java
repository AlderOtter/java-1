import com.judahstutorials.javaintro.tools.Vic;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

public class VicControl2
{
	private static Vic tim;
	private static Vic tim2;
	
	public static void main( String[] args )
	{
		Vic.reset( args );
		tim = new Vic();
		tim2 = new Vic();

	
		KeyboardFocusManager	focusMgr	=
			KeyboardFocusManager.getCurrentKeyboardFocusManager();
		focusMgr.addKeyEventDispatcher( new KeyListener() );
	}
	
	public static class KeyListener implements KeyEventDispatcher 
	{
		public boolean dispatchKeyEvent( KeyEvent evt )
		{
			int		keyCode	= evt.getKeyCode();
			int		type    = evt.getID();
			
			if (  type == KeyEvent.KEY_PRESSED )
			{
				
				if ( keyCode == KeyEvent.VK_RIGHT )
				{
					if (tim.seesSlot())
					{
						tim.moveOn();
					}
					
				}
				if ( keyCode == KeyEvent.VK_LEFT )
				{
					tim.backUp();
				}
				if ( keyCode == KeyEvent.VK_UP )
				{
					if (tim.seesSlot() && tim.seesCD() ) 
					{
						tim.takeCD();
					}
				}
				if ( keyCode == KeyEvent.VK_DOWN )
				{
					if (tim.seesSlot() && !tim.seesCD() ) 
					{
							tim.putCD();
					}
				}
			}
			
			if (  type == KeyEvent.KEY_PRESSED )
			{
				
				if ( keyCode == KeyEvent.VK_D )
				{
					if (tim2.seesSlot())
					{
						tim2.moveOn();
					}
					
				}
				if ( keyCode == KeyEvent.VK_A )
				{
					tim2.backUp();
				}
				if ( keyCode == KeyEvent.VK_W )
				{
					if (tim2.seesSlot() && tim2.seesCD() ) 
					{
						tim2.takeCD();
					}
				}
				if ( keyCode == KeyEvent.VK_S )
				{
					if (tim2.seesSlot() && !tim2.seesCD() ) 
					{
						tim2.putCD();
					}
				}
			}
			return true;
		}
	}
}