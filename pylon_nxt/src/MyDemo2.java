import lejos.nxt.Motor;
import lejos.nxt.LCD;
import lejos.nxt.Button;

public class MyDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LCD.drawString("Rotation Control", 0, 0);
		Button.waitForAnyPress();
		LCD.clear();
		Motor.B.rotate(1440);
		LCD.drawInt(Motor.B.getTachoCount(), 0, 0);
		Motor.B.rotateTo(0);
		LCD.drawInt(Motor.B.getTachoCount(), 0, 1);
		Button.waitForAnyPress();
	}

}
