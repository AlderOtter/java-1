import com.judahstutorials.javaintro.tools.Turtle;

public class Circles
{
	public static void main(String[] args)
	{
		Turtle pokey = new Turtle();
		pokey.switchTo(Turtle.RED);
		pokey.fillCircle(256);
		Turtle.sleep(500);
		pokey.switchTo(Turtle.ORANGE);
		pokey.fillCircle(128);
		Turtle.sleep(500);
		pokey.switchTo(Turtle.YELLOW);
		pokey.fillCircle(64);
		Turtle.sleep(500);
		pokey.switchTo(Turtle.GREEN);
		pokey.fillCircle(32);
		Turtle.sleep(500);
		pokey.switchTo(Turtle.BLUE);
		pokey.fillCircle(16);
		Turtle.sleep(500);
		pokey.switchTo(Turtle.MAGENTA);
		pokey.fillCircle(8);
	}
}