import com.judahstutorials.javaintro.tools.Turtle;

public class SmartTurtle extends Turtle
{
	// Make a 10x10 square; finish with the same position/heading.
	public void makeSmallSquare()
	{ paint (90, 10);
		paint (90, 10);
		paint (90, 10);
		paint (90, 10);
	}
	//======================
	// Make a 40x40 square; finish with the same position/heading.
	public void makeBigSquare()
	{
		paint (90, 40);
		paint (90, 40);
		paint (90, 40);
		paint (90, 40);
	}
	//======================

	public void makeHexagon()
	{
		paint(60,30);
		paint(60,30);
		paint(60,30);
		paint(60,30);
		paint(60,30);
		paint(60,30);
	}
} 