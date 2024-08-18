public class SquareTurtle
{
	public static void main ( String[] args )
	{
		SmartTurtle square = new SmartTurtle();
		square.makeBigSquare();
		square.move(90, 15);
		square.move(-90, 0);
		square.move(0,-15);
		square.makeSmallSquare();
		square.move(0,15);
		square.move(-90,15);
		square.move(90,50);
		square.makeBigSquare();
		square.move(90,15);
		square.move(-90,15);
		square.makeSmallSquare();
	}
	
}