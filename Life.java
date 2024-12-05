import java.applet.*;
import java.awt.*;
public class Life extends Applet
{
	   
	
	public void init()
	{
		Label l1=new Label("A");
		Label l2=new Label("B");
		Label l3=new Label("Result");
		TextField t1=new TextField(30);
		TextField t2=new TextField(30);
		TextField t3=new TextField(30);
		Button b=new Button("SUM");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		
	}
	
	
}
/*<applet code="Life.class" height="1000" width="1000">
</applet>*/