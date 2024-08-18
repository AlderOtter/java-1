import com.judahstutorials.javaintro.tools.Vic;

public class Ex2_1
{
    public static void main(String[] args)
	{
		Vic.reset( args );
		SmartVic pat = new SmartVic();
		
		pat.moveOn();
		pat.moveTake();
		
		pat.backUp();
		pat.backPut();
	}
}
//java Ex2_1 00100 01001 10010 #4