import com.judahstutorials.javaintro.tools.Vic;

public class Ex2_5
{
    public static void main(String[] args)
	{
		Vic.reset( args );
		Vic pat = new Vic();
		
		pat.moveOn();
		pat.takeCD();
		pat.moveOn();
		pat.takeCD();
		pat.backUp();
		pat.putCD();
		pat.moveOn();
		pat.putCD();
	}
}
// 011