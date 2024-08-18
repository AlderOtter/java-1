import com.judahstutorials.javaintro.tools.Vic;

public class Ex2_12
{
	public static void main(String[] args)
	{
        Vic.reset( args );
        SmartVic tim = new SmartVic();
		tim.takeCD();
		tim.moveTake();
		tim.moveTake();
		tim.backUp();
		tim.backPut();
		tim.moveOn();
		tim.moveOn();
		tim.putCD();
		tim.backPut();
	}
}
//java Ex2_12.java 111