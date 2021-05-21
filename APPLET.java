package programs_java;

import java.applet.*;
import java.awt.*;
public class APPLET extends Applet
{
	public void paint(Graphics gs)
	{
		gs.drawString("Line",100 ,20 );
		gs.setColor(Color.red);
		gs.drawLine(150, 20, 500, 20);
		
		gs.setColor(Color.black);
		gs.drawString("Rectangle",100 ,100 ); 
		gs.drawRect(150, 120, 200, 40);
		gs.fillRect(150, 180, 200, 40);
		
		
		gs.drawString("Oval",100 ,260 );
		gs.setColor(Color.magenta);
		gs.drawOval(150, 270, 200, 200);
		gs.fillOval(400, 270, 200, 200);
		
		

	}
}
