import com.judahstutorials.javaintro.tools.Turtle;
public class TurtleHouse
{
	public static void main ( String[] args )
	{
		Turtle bot = new Turtle();
		bot.paint(90,150);//left wall
		bot.paint(-90,200);//ceilling
		bot.paint(-90,150);//right wall
		bot.paint(-90,200);//floor
		bot.move(180,85);//move to the middle
		bot.paint(90,50);//left side of door
		bot.paint(-90,30);//top side of door
		bot.paint(-90,50);//right side of the door
		bot.move(180,75);//move to the window posiotion
		bot.paint(-90,25);//bottom part of window
		bot.paint(90,25);//right side of window
		bot.paint(90,25);//top part of window
		bot.paint(90,25);//left part of window
		bot.move(-90,30);//move to second window position
		bot.paint(0,25);//bottom part of second window
		bot.paint(-90,25);//left part of second window
		bot.paint(-90,25);//top part of second window
		bot.paint(-90,25);//right part of second window
	}
}