import com.judahstutorials.javaintro.tools.Turtle;

public class Target
{
	public static void main(String[] args)
	{
		Turtle pokey = new Turtle();
		pokey.switchTo(Turtle.RED);
		pokey.fillCircle(256);
		pokey.switchTo(Turtle.YELLOW);
		pokey.fillCircle(128);
		pokey.switchTo(Turtle.BLUE);
		pokey.fillCircle(64);
		pokey.switchTo(Turtle.BLACK);
		pokey.fillCircle(32);
	}
}