import com.judahstutorials.javaintro.tools.Turtle;
import java.awt.event.KeyEvent;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;

public class Arrow
{
	public static void main( String[] args )
	{
		@SuppressWarnings("unused")
		Turtle bat = new Turtle();
		
		KeyboardFocusManager	focusMgr	=
			KeyboardFocusManager.getCurrentKeyboardFocusManager();
		focusMgr.addKeyEventDispatcher( new KeyListener() );
	}
	
	private static class KeyListener implements KeyEventDispatcher 
	{
		Turtle bat = new Turtle();

		public boolean dispatchKeyEvent( KeyEvent evt )
		{
			int		keyCode	= evt.getKeyCode();
			int		type    = evt.getID();
			
			if (  type == KeyEvent.KEY_PRESSED )
			{
				
				if ( keyCode == KeyEvent.VK_RIGHT )
				{
					bat.say("Right");
				}
				if ( keyCode == KeyEvent.VK_LEFT )
				{
					bat.say("Left");
				}
				if ( keyCode == KeyEvent.VK_UP )
				{
					bat.say("Up");
				}
				if ( keyCode == KeyEvent.VK_DOWN )
				{
					bat.say("Down");
				}
			}
			return true;
		}
	}
}