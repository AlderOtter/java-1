public class SmartTurtleDemo
{
	public static void main( String[] args )
	{
		SmartTurtle smarty = new SmartTurtle();
		smarty.makeSmallSquare();
		smarty.move(45,128);
		smarty.makeBigSquare();
		
		SmartTurtle pants = new SmartTurtle();
		pants.move(135,128);
		pants.makeBigSquare();
	}
}