import com.judahstutorials.javaintro.tools.Vic;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

public class VicControl
{
	private static Vic tim;
	private static Vic vik;
	
	public static void main( String[] args )
	{
		Vic.reset( args );
		tim = new Vic();
		vik = new Vic();
		
		KeyboardFocusManager	focusMgr	=
			KeyboardFocusManager.getCurrentKeyboardFocusManager();
		focusMgr.addKeyEventDispatcher( new KeyListener() );
	}
	
	private static class KeyListener implements KeyEventDispatcher 
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
				if ( keyCode == KeyEvent.VK_D )
				{
					if (vik.seesSlot())
					{
						vik.moveOn();
					}
				}
				if ( keyCode == KeyEvent.VK_A )
				{
					vik.backUp();
				}
				if ( keyCode == KeyEvent.VK_W )
				{
					if (vik.seesSlot() && vik.seesCD() ) 
					{
						vik.takeCD();
					}
				}
				if ( keyCode == KeyEvent.VK_S )
				{
					if (vik.seesSlot() && !vik.seesCD() ) 
					{
							vik.putCD();
					}
				}
			}
			return true;
		}
	}
}
//java VicControl 01010101 10101010 #8