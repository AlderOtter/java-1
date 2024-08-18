// import com.judahstutorials.javaintro.tools.Turtle;
import java.awt.Color;


public class IfDemo2
{
	public static void main( String[] args )
	{
		TurtlePlus timmy = new TurtlePlus();
		if ( timmy.areYouARabbit() )
		{
			timmy.switchTo(Color.RED);
			timmy.fillCircle(64);
			
		}
	}
}