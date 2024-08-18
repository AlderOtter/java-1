import com.judahstutorials.javaintro.tools.Vic;

public class Ex2_11
{
	public static void main( String[] args )
	{
        Vic.reset( args );
        SmartVic tim = new SmartVic();
		tim.moveTake();
		tim.backTake();
		tim.movePut();
		tim.backPut();
	}
}
//java Ex2_11.java 11